package com.jenny.test;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-14 上午10:27
 */


@Entity
@Table(name = "Student", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})},
indexes = @Index(columnList = "id"))
@Data
public class Student {

    //自增ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    public Student() {
    }
}
