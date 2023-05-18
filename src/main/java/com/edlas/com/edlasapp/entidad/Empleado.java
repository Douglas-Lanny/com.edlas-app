package com.edlas.com.edlasapp.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "nombreUsuario", length = 60, nullable = false, unique = true)
    private String nombreUsuario;

    @Column(name = "estatus")
    private boolean estatus = true;

    @Column(name = "area", nullable = false)
    private int area;

    @Column(name = "puestoDeTrabajo", nullable = false)
    private int puestoDeTrabajo;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String nombreUsuario, int area, int puestoDeTrabajo) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.area = area;
        this.puestoDeTrabajo = puestoDeTrabajo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean isEstatus() {
        return this.estatus;
    }

    public boolean getEstatus() {
        return this.estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPuestoDeTrabajo() {
        return this.puestoDeTrabajo;
    }

    public void setPuestoDeTrabajo(int puestoDeTrabajo) {
        this.puestoDeTrabajo = puestoDeTrabajo;
    }

}
