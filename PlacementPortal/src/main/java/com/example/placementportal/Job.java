package com.example.placementportal;

import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String packageAmount;
    private String description;

    // Manual Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getPackageAmount() { return packageAmount; }
    public void setPackageAmount(String packageAmount) { this.packageAmount = packageAmount; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}