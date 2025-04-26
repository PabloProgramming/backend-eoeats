package com.app.eoeats.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String imageId;
    private String image;
    private String name;
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Plate> plates;
    @ManyToOne
    @NonNull
    private Restaurant restaurant;

}
