package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageInfo {
  private int page; // 현재 페이지
  private int size; // 한 페이지 데이터 수
  private Long totalElements; // 전체 데이터 수
  private int totalPages; // 전체 페이지
}
