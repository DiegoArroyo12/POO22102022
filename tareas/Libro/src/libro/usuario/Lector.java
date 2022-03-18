/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.usuario;

import libro.Libro;

/**
 *
 * @author diego
 */
public class Lector extends Libro{
    String nombre;
    int numeroCuenta;
    int edad;

    public Lector() {
    }

    public Lector(String nombre, int numeroCuenta, int edad) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Lector{" + "nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", edad=" + edad + '}';
    }
    
    public void solicitarLibro(){
        System.out.println("Necesito un libro...");
    }
    
    public void tomarLibro(int estante){
        System.out.println("Tomaré el libro del estante número " + estante);
    }
    
    public void leer(){
        System.out.println("Este libro es muy interesante...");
    }
    
    public void devolverLibro(){
        System.out.println("Es momento de devolver el libro...");
    }
}
