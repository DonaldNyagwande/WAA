package com.miu.W1D2Lab2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String title;
    String content;
    String author;
}
