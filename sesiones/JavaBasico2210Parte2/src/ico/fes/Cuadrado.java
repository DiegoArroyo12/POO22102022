/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author diego
 */
public class Cuadrado implements Figura{
    float alto;
    float ancho;

    public Cuadrado() {
    }

    public Cuadrado(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "alto=" + alto + ", ancho=" + ancho + '}';
    }

    @Override
    public float calcularArea() {
        return this.alto * this.ancho;
    }

    @Override
    public String saludar() {
        System.out.println("Hola desde un método No Abstracto");
        return "Hola";
    }
    
    
}
