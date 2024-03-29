/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidades;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author DisenoWeb
 */
public class Contrato implements Serializable{
    int id;
    int codigo_tipo_contrato;
    int codigo_trabajador;
    LocalDate fechainicio;
    LocalDate fechafin;
    double horas;
    boolean situacion;
    boolean asegurado;

    public Contrato() {
    }

    public Contrato(int codigo, int codigo_trabajador, LocalDate fechainicio, LocalDate fechafin, double horas, boolean situacion, boolean asegurado) {
        this.codigo_tipo_contrato = codigo;
        this.codigo_trabajador = codigo_trabajador;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.horas = horas;
        this.situacion = situacion;
        this.asegurado = asegurado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public int getCodigo_tipo_contrato() {
        return codigo_tipo_contrato;
    }

    public void setCodigo_tipo_contrato(int codigo_tipo_contrato) {
        this.codigo_tipo_contrato = codigo_tipo_contrato;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public boolean isSituacion() {
        return situacion;
    }

    public void setSituacion(boolean situacion) {
        this.situacion = situacion;
    }

    public boolean isAsegurado() {
        return asegurado;
    }

    public void setAsegurado(boolean asegurado) {
        this.asegurado = asegurado;
    }

    public int getCodigo_trabajador() {
        return codigo_trabajador;
    }

    public void setCodigo_trabajador(int codigo_trabajador) {
        this.codigo_trabajador = codigo_trabajador;
    }
    
    
    
}
