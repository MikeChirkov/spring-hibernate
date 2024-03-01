package ru.netology.springhibernate.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}