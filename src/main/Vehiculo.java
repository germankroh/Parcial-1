package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import main.UsuarioSocio;

public class Vehiculo {
    private String matricula;
    private String nombre;
    private String tipo;
    private int Dimensiones ;
    private UsuarioSocio socio;
    private Garage garage;
    private LocalDate fechaAsignacionGarage;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDimensiones(int Dimensiones) {
        this.Dimensiones=Dimensiones;
    }
    public void setSocio(UsuarioSocio socio) {
        this.socio = socio;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public void setFecha(LocalDate fechaAsignacionGarage) {
        this.fechaAsignacionGarage = fechaAsignacionGarage;
    }
    
    String getMatricula() {
        return matricula;
    }
    
    String getNombre() {
        return nombre;
    }

    String getTipo() {
        return tipo;
    }

    int getDimensiones() {
        return Dimensiones;
    }

    LocalDate getFechaAsignacionGarage() {
        return fechaAsignacionGarage;
    }
}
