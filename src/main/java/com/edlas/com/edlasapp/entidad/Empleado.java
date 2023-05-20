package com.edlas.com.edlasapp.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fechaNacimiento", nullable = false)
    private Date fechaNacimiento;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fechaVinculacion", nullable = false)
    private Date fechaVinculacion;

    @Column(name = "porcentajePropina")
    private Float porcentajePropina;

    public Empleado() {
    }

    /**
     * @param id
     * @param nombre
     * @param nombreUsuario
     * @param area
     * @param puestoDeTrabajo
     * @param fechaNacimiento
     */
    public Empleado(Long id, String nombre, String nombreUsuario, int area, int puestoDeTrabajo, Date fechaNacimiento,
            Date fechaVinculacion, Float porcentajePropina) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.area = area;
        this.puestoDeTrabajo = puestoDeTrabajo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaVinculacion = fechaVinculacion;
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

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaVinculacion() {
        return this.fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public Float getPorcentajePropina() {
        return porcentajePropina;
    }

    public void setPorcentajePropina(Float porcentajePropina) {
        this.porcentajePropina = porcentajePropina;
    }

}
