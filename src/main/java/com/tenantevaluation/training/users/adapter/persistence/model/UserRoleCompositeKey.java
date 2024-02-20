package com.tenantevaluation.training.users.adapter.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
public class UserRoleCompositeKey implements Serializable {

    private BigInteger user_id;
    private BigInteger role_id;

}
