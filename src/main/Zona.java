package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import main.Garage;


public class Zona {
    private char letra;
    private String tipoVehiculos;
    private int numeroVehiculos;
    private double profundidad;
    private double ancho;
    private List<Garage> garages;

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setTipoVehiculo(String tipoVehiculos) {
        this.tipoVehiculos = tipoVehiculos;
    }

    public void setNumVehiculo(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public char getLetra() {
        return letra;
    }

    public String getTipoVehiculos() {
        return tipoVehiculos;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public double getAncho() {
        return ancho;
    }

    public List<Garage> getGarages() {
        return garages;
    }

    void setLetra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
