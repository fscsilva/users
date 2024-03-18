package com.tenantevaluation.training.users.adapter.user;

import jakarta.validation.ValidationException;

public class UserRoleNotFoundException extends ValidationException {

    public UserRoleNotFoundException(String message) {
        super(message);
    }
}
