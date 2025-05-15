package com.valueMomentum.insurancepolicyProject.controller;

import com.valueMomentum.insurancepolicyProject.model.Policy;
import com.valueMomentum.insurancepolicyProject.service.GetPolicyByIdea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {
    @Autowired
    private GetPolicyByIdea getPolicyByIdea;

    @GetMapping("/{id}")
    public Optional<Policy> getPolicy(@PathVariable Long id) {
        return getPolicyByIdea.getPolicyById(id);
    }
}
