package com.kilopo.tryshop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product extends BaseModel {

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "info")
    private String info;

    @Column(name = "photo")
    private String photo;

    @Column(name = "number", nullable = false)
    private int num;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producers_id")
    private Producer producer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "garanty")
    private String garanty;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_basket",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "basket_id")})
    private Set<Basket> baskets = new HashSet<Basket>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_order",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "order_id")})
    private Set<Order> orders = new HashSet<Order>();

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private Set<Comment> comments = new HashSet<Comment>();

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getGaranty() {
        return garanty;
    }

    public void setGaranty(String garanty) {
        this.garanty = garanty;
    }

    public Set<Basket> getBaskets() {
        return baskets;
    }

    public void setBaskets(Set<Basket> baskets) {
        this.baskets = baskets;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
