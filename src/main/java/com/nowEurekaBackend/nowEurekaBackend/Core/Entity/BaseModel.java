package com.nowEurekaBackend.nowEurekaBackend.Core.Entity;

import com.nowEurekaBackend.nowEurekaBackend.Core.Entity.Enum.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
public class BaseModel {

    private UUID UUID;
    @Id
    private String id;
    private String userName;
    private String surName;
    private int    age;
    private Long createdAt=System.currentTimeMillis();
    private Long updatedAt=System.currentTimeMillis();
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String countryCode;
    private Gender gender;



}
