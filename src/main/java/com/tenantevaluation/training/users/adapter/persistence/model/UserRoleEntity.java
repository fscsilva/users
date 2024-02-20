package com.tenantevaluation.training.users.adapter.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name = "user_roles")
@IdClass(UserRoleCompositeKey.class)
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleEntity {

    @NonNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id_id", nullable = false)
    private UserEntity user;

    @NonNull
    @Id
    @JoinColumn(name = "user_id_id", nullable = false)
    private BigInteger user_id;

    @NonNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id_id", nullable = false)
    private RoleEntity role;

    @NonNull
    @Id
    @JoinColumn(name = "role_id_id", nullable = false)
    private BigInteger role_id;


}
