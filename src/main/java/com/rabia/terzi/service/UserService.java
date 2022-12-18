package com.rabia.terzi.service;

import com.rabia.terzi.dto.UserDto;
import com.rabia.terzi.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    List<UserDto> getUsers();
    UserDto getUser(Long id);
    UserDto updateUser(Long id, UserDto user);
    Boolean deleteUser(Long id);
    Page<User> pagination(int currentPage, int pageSize);
    Page<User> pagination(Pageable pageable);
}
