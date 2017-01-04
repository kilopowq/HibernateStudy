package com.kilopo.tryshop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "producers")
public class Producer extends BaseModel {

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "producer", fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<Product>();

    public Producer() {
    }


}
