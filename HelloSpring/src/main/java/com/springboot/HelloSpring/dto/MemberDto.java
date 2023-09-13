package com.springboot.HelloSpring.dto;

public class MemberDto {
    private String name;
    private String email;
    private String organization;

    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }


    public String getOrganization(String organization) {
        return organization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "MemberDto \n" +
                "name = '" + name + "\' \n" +
                "email = '" + email + "\' \n" +
                "organization = '" + organization + "\' \n";
    }
}
