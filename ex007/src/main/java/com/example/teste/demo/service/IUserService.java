package com.example.teste.demo.service;

import com.example.teste.demo.model.User;

import java.util.List;

public interface IUserService {

  public List<User> getUsers();
  public void setUsers(User users);
  public void deleteById(Long id);
  public User findById(Long id);
}
