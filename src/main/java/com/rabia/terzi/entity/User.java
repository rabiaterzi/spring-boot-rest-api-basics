package com.rabia.terzi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "KULLANİCİLAR")
@Data
public class User extends BaseEntity{
    @Id
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_gen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @Column(name = "ID")
    private Long id;
    @Column(name = "ISIM", length = 100)
    private String firstName;
    @Column(name = "SOYISIM", length = 100)
    private String lastName;
}
