/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.compuestos;

/**
 *
 * @author diego
 */
public class Tamaño {
    String medidas;

    public Tamaño() {
    }

    public Tamaño(String medidas) {
        this.medidas = medidas;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    @Override
    public String toString() {
        return "Tama\u00f1o{" + "medidas=" + medidas + '}';
    }
    
    public void tamañoLibro(String medidas){
        System.out.println("El tamaño del libro es: " + medidas);
    }
}
