/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

public class Menu extends BD {
    static int opcion;
    // Método para mostrar el menú y obtener una opción válida
    public static int mostrar(String menusMsj, String errorMenuMsj, int cantMinMenu, int cantMaxMenu, int cantReintentos) {
        int menuOp = -1;

        if (!menusMsj.isEmpty() && !errorMenuMsj.isEmpty() && cantMinMenu <= cantMaxMenu && cantReintentos >= 0) {
            do {
                menuOp = leerEntero(menusMsj);
                if (menuOp >= cantMinMenu && menuOp <= cantMaxMenu) {
                    return menuOp;
                }
                cantReintentos--;
                mostrarString(errorMenuMsj);
            } while (cantReintentos >= 0);
        }
        return menuOp;
    }

    // Método para leer un entero del usuario
    private static int leerEntero(String texto) {
        mostrarString(texto);
        Scanner stringScanner = new Scanner(System.in);
        int msj;
        while (true) {
            try {
                msj = Integer.parseInt(stringScanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                mostrarString("Entrada inválida. Por favor, ingrese un número entero.\n");
            }
        }
        return msj;
    }

    // Método para mostrar una cadena de texto
    private static void mostrarString(String s) {
        System.out.println(s + "\n");
    }
    
}