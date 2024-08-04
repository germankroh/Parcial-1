/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package main;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class Main  {
    
    public static void main(String[] args) throws IOException{
        Control c= new Control();
        boolean usuarioLogeado;
        c.RestaurarEstadoSistema();
        usuarioLogeado = c.Login();
        if (usuarioLogeado) {
            c.realizarAccionUsuario();
            c.Desloguearse();
        }
    }
 
}
