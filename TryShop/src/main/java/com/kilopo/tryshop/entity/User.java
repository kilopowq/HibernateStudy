package com.kilopo.tryshop.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends Person {

    @OneToMany(mappedBy = "user")
    private Set<Order> orders = new HashSet<Order>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private UserStatus status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Basket baskets;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id")
    private Admin blockedBy;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Comment> comments = new HashSet<Comment>();

    public User() {
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }


    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Basket getBaskets() {
        return baskets;
    }

    public void setBaskets(Basket baskets) {
        this.baskets = baskets;
    }

    public Basket getBasket() {
        return baskets;
    }

    public void setBasket(Basket basket) {
        this.baskets = basket;
    }

    public Admin getBlockedBy() {
        return blockedBy;
    }

    public void setBlockedBy(Admin blockedBy) {
        this.blockedBy = blockedBy;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
