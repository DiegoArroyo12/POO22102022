/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author diego
 */
public class Perro {
    private String raza;
    private int tamano;
    public final static String cola = "cola";

    public Perro() {
    }

    public Perro(String raza, int tamano) {
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tamano=" + tamano + '}';
    }
    
    public void comer(){
        System.out.println("El perro de raza " + this.raza);
        System.out.println("Esta comiendo....");
    }
    
    public static void ladrar(){
        System.out.println("Wof Wof Wof!!!");
    }
}
