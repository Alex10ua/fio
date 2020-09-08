package ua.lab.fio.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "man")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "identificationcode")
    private Long identificationcode;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "fathername")
    private String fathername;
    @Column(name = "gender")
    private String gender;
    @Column(name = "numberofpassport")
    private String numberofpassport;
    @Column(name = "birthdate")
    private String birthdate;
    @Column(name = "address")
    private String address;

    public Person() {
    }
}
