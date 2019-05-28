/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clubandroid.pkg2dapractica;

import Otro.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class ComClubAndroid2dapractica {
    // VARIABLES GLOBALES
        static Scanner scanner = new Scanner(System.in);
        static ArrayList<Perro> listaPacientes = new ArrayList<>();
    /*
        1° INGRESAR PERROS
        2° VER LISTA DE PERROS INTERNADOS
        3° ATENDER UN PERRO
        4° DAR DE ALTA
    */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("****MENU PRINCIPAL****");
            System.out.println("[1] INGRESAR UN PERRO");
            System.out.println("[2] VER LISTA DE PERROS INTERNADOS");
            System.out.println("[3] ATENDER UN PERRO");
            System.out.println("[4] DAR DE ALTA");
            System.out.println("[0] SALIR");
            opcion = Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    ingresarPerro();
                    break;
                case 2:
                    mostrarListaPerros();
                    break;
                case 3:
                    //atenderPerro();
                    break;
                case 4:
                    //darDeAlta();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("OPCION INVALIDA!!");
            }
        } while (opcion != 0);
    }
    
    static public void ingresarPerro() {
        Perro nuevoPerro = new Perro();
        System.out.println("*** INGRESANDO UN NUEVO PERRO ***");
        System.out.println("Ingrese la raza del perro: ");
        nuevoPerro.setRaza(scanner.nextLine());
        System.out.println("Ingrese la edad del perro: ");
        nuevoPerro.setEdad(scanner.nextLine());
        System.out.println("Ingrese el color del perro: ");
        nuevoPerro.setColor(scanner.nextLine());
        System.out.println("Ingrese el estado de la gravedad: [0] POCO GRAVE ---> [10] DEMASIADO GRAVE");
        nuevoPerro.setEscalaGravedad(Integer.parseInt(scanner.nextLine()));
        
        listaPacientes.add(nuevoPerro);
        
        System.out.println("Se ha registrado con éxito!");
    }
    
    static public void mostrarListaPerros(){
        System.out.println("*** LISTA DE PACIENTES ***");
        for (Perro perro : listaPacientes) {
            System.out.println("RAZA: " + perro.getRaza());
            System.out.println("EDAD: " + perro.getEdad());
            System.out.println("COLOR: " + perro.getColor());
            System.out.println("GRAVEDAD: " + perro.getEscalaGravedad());
            if (perro.isFueAtendido() == true){
                System.out.println("EL PERRO YA HA SIDO ATENDIDO");
            } else {
                System.out.println("EL PERRO AÚN NO HA SIDO ATENDIDO");
            }
            System.out.println("--------------------------------------");
        }
    }
    
}
