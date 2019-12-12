package com.cos.crud.repository;

import java.util.Optional;

import com.cos.crud.model.User;

public interface UserRepository {
void join(User user);
User login(User user);
}
