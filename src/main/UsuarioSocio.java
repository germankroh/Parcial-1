package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import main.Consultar;
import main.Usuario;

public class UsuarioSocio extends Usuario {
    private Consultar consultar;
    private String direccion;
    private String dni;
    private String telefono;
    private LocalDate fechaIngreso;
    private BD sistemaState;

    
    public void setConsultar(Consultar consultar) {
        this.consultar = consultar;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        String nombreUsuario = null;
        String contrasena = null;
        return "UsuarioSocio{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    public Consultar getConsultar() {
        return consultar;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public String getDni() {
        return dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public int GetMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //----------------------------------------------------------------------------------
    public class Menu {

    public void mostrarMenuPrincipal() {
        boolean continuarOperando = true;
        int opcion;
        
        do {
            opcion = mostrar("1- Consultar información\n0- Salir", "Error. Ingrese una opción válida", 0, 1, 3);
            
            switch (opcion) {
                case 1:
                    consultarInformacion();
                    break;
                case 0:
                    continuarOperando = false;
                    break;
            }
        } while (continuarOperando);
    }

    public void consultarInformacion() {
        int opcionConsulta;
        boolean menuAnterior = false;
        
        do {
            opcionConsulta = mostrar("1- Consultar Socio (por DNI)\n2- Consultar Empleado (por DNI)\n3- Consultar Vehículo (por Patente)\n4- Consultar Garage (por Numero)\n5- Consultar Zona (por Letra)\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 5, 3);
            
            switch (opcionConsulta) {
                case 1:
                    // método para consultar sus datos
                    break;
                case 2:
                    // método para consultar sus vehículos 
                    break;
                case 0:
                    menuAnterior = true;
                    break;
            }
        } while (!menuAnterior);
    }

    public int mostrar(String opciones, String error, int desde, int hasta, int cantidad) {
        int opcion = 0;
        return opcion;
    }
}
    
    
    
}
