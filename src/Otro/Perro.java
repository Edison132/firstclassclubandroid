/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otro;

/**
 *
 * @author ALUMNO
 */
public class Perro {
    private String raza;
    private String edad;
    private String color;
    private int escalaGravedad;
    private boolean fueAtendido;
    
    
    public Perro() {
        
    }

    public Perro(String raza, String edad, String color, int escalaGravedad) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.escalaGravedad = escalaGravedad;
        this.fueAtendido = false;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEscalaGravedad() {
        return escalaGravedad;
    }

    public void setEscalaGravedad(int escalaGravedad) {
        this.escalaGravedad = escalaGravedad;
    }

    public boolean isFueAtendido() {
        return fueAtendido;
    }

    public void setFueAtendido(boolean fueAtendido) {
        this.fueAtendido = fueAtendido;
    }
    
    
    
}
