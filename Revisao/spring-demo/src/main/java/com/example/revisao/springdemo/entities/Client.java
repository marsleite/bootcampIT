package com.example.revisao.springdemo.entities;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Client {
  private @Getter @Setter Integer id;
  private @Getter @Setter String firstName;
  private @Getter @Setter String lastName;
  private @Getter @Setter LocalDateTime createdAt;
  public void setId(int i) {
    this.id = i;
  }
  public void setFirstName(String string) {
    this.firstName = string;
  }
  public void setLastName(String string) {
    this.lastName = string;
  }
  public void setCreatedAt(LocalDateTime now) {
    this.createdAt = now;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public LocalDateTime getCreatedAt() {
    return this.createdAt;
  }

  public String toString() {
    return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", createdAt=" + createdAt + "]";
  }
}
