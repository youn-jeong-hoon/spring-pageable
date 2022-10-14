package com.example.demo;

import com.example.demo.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageResponse {
  private List<User> data;
  private PageInfo pageInfo;
}