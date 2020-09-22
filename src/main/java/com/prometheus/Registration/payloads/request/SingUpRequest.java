package com.prometheus.Registration.payloads.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SingUpRequest {

    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;

    @NotBlank
    @Size(min = 6,max = 40)
    private String password;

    public String getUsername (){
        return username;
    }

    public void setUsername (String username){
        this.username = username;
    }

    public String getEmail (){
        return email;
    }

    public void setEmail(){
        this.email =email;
    }

    public Set<String> getRole (){
        return role;
    }

    public void setRole (Set<String> role){
        this.role = role;
    }

}
