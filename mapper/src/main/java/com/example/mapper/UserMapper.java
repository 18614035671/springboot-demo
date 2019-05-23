package com.example.mapper;

import org.apache.ibatis.annotations.Param;
import com.example.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User getUserById(@Param("id") Long id);
}
