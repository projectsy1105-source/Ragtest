package com.back.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
public class ProductKeyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Setter
    @JsonIgnore
    private Product product;

    @Column
    @Setter
    private String keyword;

    public ProductKeyword(String keyword) {
        this.keyword = keyword;
    }
}
