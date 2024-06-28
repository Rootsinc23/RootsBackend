package com.newsletter.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "subscribers")
@AllArgsConstructor
@NoArgsConstructor
public class Subscribers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nID;
    @Column(name = "subName")
    private String name;
    @Column(name = "subEmail")
    private String email;
}
