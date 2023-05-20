package com.driver;

import java.util.Objects;

public class User {
    private String name;
    private String mobile;

    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getName().equals(user.getName()) && getMobile().equals(user.getMobile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMobile());
    }
}
