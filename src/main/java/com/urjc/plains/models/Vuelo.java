package com.urjc.plains.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Vuelo {

    @Id
    @GeneratedValue
    private Long id;

    private String company;

    @ManyToOne
    @JoinColumn(name = "id")
    private Avion avion;

    @ManyToOne
    @JoinColumn(name = "iata", insertable = false, updatable = false)
    private Aeropuerto aeropuertoOrigen;

    @ManyToOne
    @JoinColumn(name = "iata", insertable = false, updatable = false)
    private Aeropuerto aeropuertoDestino;

    private Date fechaHoraVuelo;

    private int duracionVuelo;

    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VueloTripulante> tripulantes;

    public Vuelo(String company, Avion avion, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, Date fechaHoraVuelo, int duracionVuelo) {
        this.company = company;
        this.avion = avion;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.fechaHoraVuelo = fechaHoraVuelo;
        this.duracionVuelo = duracionVuelo;
    }

    public Vuelo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public Date getFechaHoraVuelo() {
        return fechaHoraVuelo;
    }

    public void setFechaHoraVuelo(Date fechaHoraVuelo) {
        this.fechaHoraVuelo = fechaHoraVuelo;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(int duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public List<VueloTripulante> getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(List<VueloTripulante> tripulantes) {
        this.tripulantes = tripulantes;
    }
}
