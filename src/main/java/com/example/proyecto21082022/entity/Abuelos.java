package com.example.proyecto21082022.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Abuelos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "abuelo_nombre")
    private String abueloNombre;
    @Basic
    @Column(name = "abuelo_apellido")
    private String abueloApellido;
    @Basic
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbueloNombre() {
        return abueloNombre;
    }

    public void setAbueloNombre(String abueloNombre) {
        this.abueloNombre = abueloNombre;
    }

    public String getAbueloApellido() {
        return abueloApellido;
    }

    public void setAbueloApellido(String abueloApellido) {
        this.abueloApellido = abueloApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abuelos abuelos = (Abuelos) o;
        return Objects.equals(id, abuelos.id) && Objects.equals(abueloNombre, abuelos.abueloNombre) && Objects.equals(abueloApellido, abuelos.abueloApellido) && Objects.equals(fechaNacimiento, abuelos.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, abueloNombre, abueloApellido, fechaNacimiento);
    }
}
