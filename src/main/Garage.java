package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import main.UsuarioSocio;
import java.time.LocalDate;

public class Garage {
    private int numero;
    private double contadorLuz;
    private boolean serviciosMantenimiento;
    private Vehiculo vehiculo;
    private Zona zona;
    private UsuarioSocio propietario;
    private LocalDate fechaCompra;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setContadorLuz(double contadorLuz) {
        this.contadorLuz = contadorLuz;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setMantenimiento(boolean serviciosMantenimiento) {
        this.serviciosMantenimiento = serviciosMantenimiento;
    }

    public void setPropietario(UsuarioSocio propietario) {
        this.propietario = propietario;
    }

    public int getNumero() {
        return numero;
    }

    public double getContadorLuz() {
        return contadorLuz;
    }

    public boolean isServiciosMantenimiento() {
        return serviciosMantenimiento;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Zona getZona() {
        return zona;
    }

    public UsuarioSocio getPropietario() {
        return propietario;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    
}

