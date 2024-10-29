package com.secuirity.demo.service;

import com.secuirity.demo.modal.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
