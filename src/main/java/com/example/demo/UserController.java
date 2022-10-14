package com.example.demo;

import com.example.demo.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
  private final UserRepository repository;

  @GetMapping
  ResponseEntity list(@PageableDefault(sort = "userName", direction = Sort.Direction.ASC) Pageable pageable) {
    return new ResponseEntity<>(repository.findAll(pageable), HttpStatus.OK);
  }
}
