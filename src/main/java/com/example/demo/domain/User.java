package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Getter
@Setter
@Table(name = "t_user")
public class User {
  @Id
  private String userId;
  private String userName;
}
