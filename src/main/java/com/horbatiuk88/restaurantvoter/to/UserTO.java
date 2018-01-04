package com.horbatiuk88.restaurantvoter.to;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
* Transfer object for authorized user
* */
@Setter
@Getter
@ToString(of = {"id", "name", "email"})
public class UserTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    public UserTO() {
    }

    public UserTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
