package com.itsol.train.mock.service;

import com.itsol.train.mock.domain.User;
import com.itsol.train.mock.dto.UserDto;
import com.itsol.train.mock.exception.EmailExistException;
import com.itsol.train.mock.exception.UsernameExistException;

import java.util.Optional;

public interface UserService {
    /**
     * Register user
     *
     * @param userDto UserDto
     */
    void register(UserDto userDto) throws UsernameExistException, EmailExistException;

    /**
     *
     * @return Optional<User>
     */
    Optional<User> getUserWithAuthorities();
}
