package com.app.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tiempo;
    private String lugar;
    @Column(name = "puesto_trabajo")
    private String puestoTrabajo;
    @Column(name = "descripcion_trabajo")
    private String descripcionTrabajo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTiempo() {return tiempo;}
    public String getLugar() {return lugar;}
    public String getPuesto_trabajo() {return puestoTrabajo;}
    public String getDescripcion_trabajo() {return descripcionTrabajo;}
    public void setTiempo(String tiempo) {this.tiempo = tiempo;}
    public void setLugar(String lugar) {this.lugar = lugar;}
    public void setPuesto_trabajo(String puestoTrabajo) {this.puestoTrabajo = puestoTrabajo;}
    public void setDescripcion_trabajo(String descripcionTrabajo) {this.descripcionTrabajo = descripcionTrabajo;}

 

}
