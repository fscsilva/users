package com.tenantevaluation.training.users.adapter.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRoleCompositeKey implements Serializable {

    private BigInteger user_id;
    private BigInteger role_id;

}
