package com.kilopo.tryshop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "userStatuses")
public class UserStatus extends BaseModel {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "discount", nullable = false, length = 2)
    private double discount;

    @Column(name = "level", nullable = false)
    private int level;

    @OneToMany(mappedBy = "status", fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<User>();

    public UserStatus() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
