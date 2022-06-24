package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Test1 {

        private final static String SEQ_NAME = "test_generator";

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
        @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
        private Long id;
        private String name;
}
