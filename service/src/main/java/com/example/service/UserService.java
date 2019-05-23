package com.example.service;

import org.springframework.stereotype.Service;
import com.example.model.User;

public interface UserService {

	User getUserById(Long id);
}
