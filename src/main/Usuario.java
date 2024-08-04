/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author enzol
 */
public  abstract class Usuario implements Serializable{
    private String nombreUsuario;
    private String contrasena;
    
    protected Menu menu=new Menu();
    public abstract int GetMenu();
    
   // public abstract String toString();
    public void validar() {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario (Su DNI):");
        int nom = scan.nextInt();
        scan.nextLine(); // Consume el carácter de nueva línea restante
        
        String pass;
        do {
            System.out.println("Ingrese su contraseña (TIPO DE USUARIO EN MAYÚSCULAS):");
            pass = scan.nextLine();    
        } while (!(pass.equals("ADMIN") || pass.equals("EMP") || pass.equals("SOCIO")));
    
    
// No cerramos el Scanner aquí para permitir más entradas futuras si es necesario.
    }
    public boolean validarUsuarioContraseña(String usuario, String contraseña) {
        return ((this.nombreUsuario.equals(usuario) && this.contrasena.equals(contraseña)));
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String contrasena() {
        return contrasena;
    }
    
}
