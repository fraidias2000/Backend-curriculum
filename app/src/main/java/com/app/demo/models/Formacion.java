package com.app.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Formacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tiempo;
    private String lugar;
    private String titulo;
    @Column(name = "descripcion_formacion")
    private String descripcionFormacion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTiempo() {return tiempo;}
    public String getLugar() {return lugar;}
    public String gettitulo() {return titulo;}
    public String getdescripcionFormacion() {return descripcionFormacion;}
    public void setdescripcionFormacion(String descripcion) {this.descripcionFormacion = descripcionFormacion;}
    public void setTiempo(String tiempo) {this.tiempo = tiempo;}
    public void setLugar(String lugar) {this.lugar = lugar;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    

}
