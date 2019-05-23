package org.mapper;

import org.apache.ibatis.annotations.Param;
import org.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User getUserById(@Param("id") Long id);
}
