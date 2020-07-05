package com.alebian.springbatchexample.repositories;

import com.alebian.springbatchexample.models.Password;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<Password, String> {
}
