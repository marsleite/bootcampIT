package com.example.teste.demo.service;

import com.example.teste.demo.model.User;
import com.example.teste.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {
  private final UserRepository userRepo;

  public UserService(UserRepository userRepo) {
    this.userRepo = userRepo;
  }

  @Override
  @Transactional(readOnly = true)
  public List<User> getUsers() {
    return userRepo.findAll();
  }

  @Override
  public void setUsers(User users) {
    userRepo.save(users);
  }

  @Override
  public void deleteById(Long id) {

  }

  @Override
  public User findById(Long id) {
    return null;
  }
}
