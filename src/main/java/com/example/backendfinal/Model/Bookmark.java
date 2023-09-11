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
@Table(name = "bookmark")

public class Bookmark {

        @Id

        @Column(name="id")
        private long id;

        @Column(name="userid")
        private long userid;

        @Column(name="videoid")
        private long videoid;

}
