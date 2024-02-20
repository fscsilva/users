package com.tenantevaluation.training.users.adapter.user;

import jakarta.validation.ValidationException;

public class UserNotFoundException extends ValidationException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
