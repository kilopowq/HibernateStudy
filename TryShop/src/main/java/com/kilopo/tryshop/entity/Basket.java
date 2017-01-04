package com.kilopo.tryshop.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "baskets")
public class Basket extends BaseModel {

    @ManyToMany(mappedBy = "baskets", fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<Product>();

    @OneToOne(mappedBy = "baskets")
    private User user;

    public Basket() {
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
