package com.app.demo.models;
import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String telefono;
    private String ubicacion;
    private String resumen;
    @OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Formacion> formacion;

    @OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Experiencia> experiencia;

    @OneToMany(mappedBy = "curriculum", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Aptitud> aptitudes;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getUbicacion() {return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}
    public String getResumen() {return resumen;}
    public void setResumen(String resumen) {this.resumen = resumen;}
    public List<Formacion> getFormacion() {return formacion;}
    public void setFormacion(List<Formacion> formacion) {this.formacion = formacion;}
    public List<Experiencia> getExperiencia() {return experiencia;}
    public void setExperiencia(List<Experiencia> experiencia) {this.experiencia = experiencia;}
    public List<Aptitud> getAptitudes() {return aptitudes;}
    public void setAptitudes(List<Aptitud> aptitudes) {this.aptitudes = aptitudes;}
}
