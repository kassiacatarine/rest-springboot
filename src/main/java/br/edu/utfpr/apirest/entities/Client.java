package br.edu.utfpr.apirest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Client
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String phone;
    private double creditLimit;
    // private Parents parents;
}