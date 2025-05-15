package com.valueMomentum.insurancepolicyProject.service;


import com.valueMomentum.insurancepolicyProject.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepo extends JpaRepository<Policy, Long> {
}
