package com.tenantevaluation.training.users.adapter.user;

import com.tenantevaluation.training.users.adapter.persistence.repository.RoleRepository;
import com.tenantevaluation.training.users.adapter.persistence.repository.UserRepository;
import com.tenantevaluation.training.users.adapter.persistence.repository.UserRoleRepository;
import com.tenantevaluation.training.users.domain.port.service.UserService;
import com.tenantevaluation.training.users.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class UserClient implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final RoleRepository roleRepository;


    @Override
    public User getUserByUsername(String username) {
        var user = userRepository.findUsersByUsername(username)
            .map(userEntity -> User.builder()
                .userId(userEntity.getId())
                .statusActive(true)
                .password(userEntity.getPass())
                .username(userEntity.getUsername())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLast_name())
                .build())
            .orElseThrow(() -> new UserNotFoundException("User not found"));
        var roleId = userRoleRepository.findUserRoleEntityByUser_id(user.getUserId())
            .map(userRoleEntity -> userRoleEntity.getRole().getId())
            .orElseThrow(() -> new UserRoleNotFoundException("User without role"));
        return roleRepository.findById(roleId)
            .map(roleEntity -> User.builder()
                .userId(user.getUserId())
                .statusActive(true)
                .password(user.getPassword())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .authorities(Collections.singletonList(new SimpleGrantedAuthority(roleEntity.getRole_name())))
                .build())
            .orElseThrow(() -> new UserRoleNotFoundException("Role not found"));

    }

}