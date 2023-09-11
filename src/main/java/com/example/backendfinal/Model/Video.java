package com.example.backendfinal.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
@Table(name = "video")

public class Video
{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        @Column(name="id")
        private long id;

        @Column(name="picture")
        private String picture;

        @Column(name="title")
        private String tittle;

        @Column(name="link")
        private String link;

        @Column(name="tipo")
        private String tipo;

        @Column(name="ano")
        private String ano;

        @Column(name="pg")
        private String pg;

        @Column(name="duration")
        private String duration;

        @Column(name="synopse")
        private String synopse;
    }


