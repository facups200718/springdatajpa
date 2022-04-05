package com.skillsoft.springdatajpa.entity;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
}
