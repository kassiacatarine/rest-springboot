package br.edu.utfpr.apirest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Parents
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parents {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String initials;
    private int phoneCode;
}