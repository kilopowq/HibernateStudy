package com.kilopo.tryshop.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "admins")
public class Admin extends Person {

    @OneToMany(mappedBy = "blockedBy", fetch = FetchType.LAZY)
    private Set<User> blockedUsers = new HashSet<User>();

    @OneToMany(mappedBy = "blockedBy", fetch = FetchType.LAZY)
    private Set<Comment> comments = new HashSet<Comment>();

    public Admin() {
    }

    public Set<User> getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(Set<User> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
