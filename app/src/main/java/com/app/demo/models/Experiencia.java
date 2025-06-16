package com.app.demo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tiempo;
    private String lugar;
    private String puesto_trabajo;
    private List<String> descripcion_trabajo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTiempo() {return tiempo;}
    public String getLugar() {return lugar;}
    public String getPuesto_trabajo() {return puesto_trabajo;}
    public List<String> getDescripcion_trabajo() {return descripcion_trabajo;}
    public void setTiempo(String tiempo) {this.tiempo = tiempo;}
    public void setLugar(String lugar) {this.lugar = lugar;}
    public void setPuesto_trabajo(String puesto_trabajo) {this.puesto_trabajo = puesto_trabajo;}
    public void setDescripcion_trabajo(List<String> descripcion_trabajo) {this.descripcion_trabajo = descripcion_trabajo;}

 

}
