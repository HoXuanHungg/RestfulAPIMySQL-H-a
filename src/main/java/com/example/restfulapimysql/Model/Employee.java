package com.example.restfulapimysql.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
public class Employee implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "address")
    private String address;

    public Employee(){

    }

}
