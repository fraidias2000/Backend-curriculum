package com.app.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Aptitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

   @JsonIgnore
   @ManyToOne
   @JoinColumn(name = "curriculum_id")
   private Curriculum curriculum;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
}
