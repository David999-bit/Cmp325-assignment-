package org.example.example.model.model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;

@Entity
public class User {

    @jakarta.persistence.Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

private class UserName {
    @Id
    public long id;

    @NonNull
    private String username;
    private String password;
    private String email;
}
}
