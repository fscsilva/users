package com.tenantevaluation.training.users.domain.port.service;

import com.tenantevaluation.training.users.domain.user.User;


public interface UserService {

    User getUserByUsername(String username);

}
