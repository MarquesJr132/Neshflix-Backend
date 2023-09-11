package com.example.backendfinal.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "download")

public class Download {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        @Column(name="id")
        private long id;

        @Column(name="link")
        private String link;
    }

