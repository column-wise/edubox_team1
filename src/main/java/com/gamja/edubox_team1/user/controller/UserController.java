package com.gamja.edubox_team1.user.controller;

import com.gamja.edubox_team1.user.model.dto.*;
import com.gamja.edubox_team1.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 회원가입
    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserSignupRequestDTO userSignupRequestDTO) {
        UserResponseDTO createdUser = userService.createUser(userSignupRequestDTO);
        return ResponseEntity.ok(createdUser);
    }

    // 특정 회원 정보 조회
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable long id) {
        UserResponseDTO user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    // 회원 목록 조회
    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> listUsers() {
        List<UserResponseDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    // 회원 프로필 정보 수정
    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUserProfile(@PathVariable long id, @RequestBody UserUpdateProfileRequestDTO userUpdateProfileRequestDTO) {
        UserResponseDTO updatedUser = userService.updateUserProfile(id, userUpdateProfileRequestDTO);
        return ResponseEntity.ok(updatedUser);
    }

    // 회원 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
