package com.urjc.plains.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Aeropuerto {

    @Id
    private int iata;

    private String nombre;

    private String ciudad;

    private String pais;

    @OneToMany(mappedBy = "aeropuertoRevision")
    private List<Revision> revisiones;

    @OneToMany(mappedBy = "aeropuertoOrigen")
    private List<Vuelo> vuelosSalida;

    @OneToMany(mappedBy = "aeropuertoDestino")
    private List<Vuelo> vuelosLlegada;

    public Aeropuerto() {}

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getIata() {
        return iata;
    }

    public void setIata(int iata) {
        this.iata = iata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(List<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public List<Vuelo> getVuelosSalida() {
        return vuelosSalida;
    }

    public void setVuelosSalida(List<Vuelo> vuelosSalida) {
        this.vuelosSalida = vuelosSalida;
    }

    public List<Vuelo> getVuelosLlegada() {
        return vuelosLlegada;
    }

    public void setVuelosLlegada(List<Vuelo> vuelosLlegada) {
        this.vuelosLlegada = vuelosLlegada;
    }
}
