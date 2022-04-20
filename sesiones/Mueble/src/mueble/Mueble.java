/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mueble;

/**
 *
 * @author diego
 */
public class Mueble {

    /**
     * @param args the command line arguments
     */
    
    int idInventario;
    String color;
    String material;
    int largo;
    int ancho;
    int disponibilidad;

    public Mueble() {
    }

    public Mueble(int idInventario, String color, String material, int largo, int ancho, int disponibilidd) {
        this.idInventario = idInventario;
        this.color = color;
        this.material = material;
        this.largo = largo;
        this.ancho = ancho;
        this.disponibilidad = disponibilidad;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Mueble{" + "idInventario=" + idInventario + ", color=" + color + ", material=" + material + ", largo=" + largo + ", ancho=" + ancho + ", disponibilidad=" + disponibilidad + '}';
    }
    
    public void sacar(int cantidad){
        if (this.disponibilidad >= cantidad){
            this.disponibilidad -= cantidad;
            if(this.disponibilidad < 10){
                System.out.println("Mensaje: Solicitar más muebles del modelo "+this.idInventario);
            }else{
                System.out.println("Insuficiente: "+this.disponibilidad);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
