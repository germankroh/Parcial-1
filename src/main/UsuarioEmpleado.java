package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;

public class UsuarioEmpleado extends Usuario {
    private Consultar consultar;
    protected String codigo;
    protected String direccion;
    protected String telefono;
    protected String especialidad;
    protected List<Zona> zonasAsignadas;
    private BD sistemaState;
    
    UsuarioEmpleado emp = new UsuarioEmpleado("empUser", "empPass");

    
    public UsuarioEmpleado(String empUser, String empPass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public UsuarioEmpleado(String nombreEmpleado, String direccion, String telefono, String especialidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public UsuarioEmpleado(String nombreEmpleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public UsuarioEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public UsuarioEmpleado(String juan, String pérez, String string, String calle_Falsa_123, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setConsultar(Consultar consultar) {
        this.consultar = consultar;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        String nombreUsuario = null;
        String contrasena = null;
        return "UsuarioEmpleado{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", codigo='" + codigo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDni() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDireccion() {
        return direccion;
    }

    public String getContrasena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public String getTelefono() {
        return telefono;
    }
    public BD getSistemaState() {
        return sistemaState;
    }
    public void setSistemaState(BD sistemaState) {
        this.sistemaState = sistemaState;
    }

    @Override
    public int GetMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public class Menu {
    /*
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
    */
    public void consultarInformacion() {
        int opcionConsulta;
        boolean menuAnterior = false;
        
        do {
            opcionConsulta = mostrar("1- Consultar Socio (por DNI)\n2- Consultar Empleado (por DNI)\n3- Consultar Vehículo (por Patente)\n4- Consultar Garage (por Numero)\n5- Consultar Zona (por Letra)\n0- Menu Anterior", "Error. Ingrese una opción válida", 0, 5, 3);
            
            switch (opcionConsulta) {
                case 1:
                    // método para consultar socio por DNI
                    break;
                case 2:
                    // método para consultar empleado por DNI
                    break;
                case 3:
                    // método para consultar vehículo por Patente
                    break;
                case 4:
                    // método para consultar garage por Numero
                    break;
                case 5:
                    // método para consultar zona por Letra
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
