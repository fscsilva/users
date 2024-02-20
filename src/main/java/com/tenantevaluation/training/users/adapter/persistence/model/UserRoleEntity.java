package com.tenantevaluation.training.users.adapter.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
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
    @Id
    private BigInteger user_id;
    @NonNull
    @Id
    private BigInteger role_id;

}
