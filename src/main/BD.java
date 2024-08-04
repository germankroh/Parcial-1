/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author enzol
 */
public class BD implements Serializable{
    public static ArrayList<Vehiculo> listaVehi = new ArrayList<>();//static para que pueda accederse en cualquier lado sin necesidad de crear instancias
    public static ArrayList<Zona> listaZona = new ArrayList<>();
    private List<Usuario> usuarios=new ArrayList<>();
    public static ArrayList<UsuarioSocio> listaSocios = new ArrayList<>();
    public static ArrayList<UsuarioEmpleado> listaEmpleado = new ArrayList<>();
    private static BD instancia;
    
    public BD deSerializar(String a) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream(a);
        ObjectInputStream o = new ObjectInputStream(f);
        BD s = (BD) o.readObject();
        o.close();
        f.close();
        return s;
    }

    public void serializar(String a) throws IOException {
        FileOutputStream f = new FileOutputStream(a);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(this);
        o.close();
        f.close();
    }
    
     public static BD newBD() {

        if (Objects.isNull(instancia)) {
            instancia = new BD();
        }
        return instancia;
    }

    public static ArrayList<Vehiculo> getListaVehi() {
        return listaVehi;
    }

    public static ArrayList<Zona> getListaZona() {
        return listaZona;
    }

    public static ArrayList<UsuarioSocio> getListaSocios() {
        return listaSocios;
    }

    public static ArrayList<UsuarioEmpleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public static BD getInstancia() {
        return instancia;
    }
    public List<Usuario> getUsuariosSistema() {
        return usuarios;
    }
     
    
}



