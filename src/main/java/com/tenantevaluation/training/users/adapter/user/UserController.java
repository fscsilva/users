package com.tenantevaluation.training.users.adapter.user;

import com.tenantevaluation.training.users.domain.port.api.UserAPI;
import com.tenantevaluation.training.users.domain.port.service.UserService;
import com.tenantevaluation.training.users.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController implements UserAPI {

    private final UserService userService;


    @Override
    public ResponseEntity<User> findUserByUsernameWithRole(String username) {
        return ResponseEntity.ok(userService.getUserByUsername(username));
    }
}
