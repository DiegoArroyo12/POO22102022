/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author diego
 */
public class Teclado {
    String marca;
    int numeroTeclas;
    boolean mutimedia;  // true = multimedia

    public Teclado() {
    }

    public Teclado(String marca, int numeroTeclas, boolean mutimedia) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
        this.mutimedia = mutimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public boolean isMutimedia() {
        return mutimedia;
    }

    public void setMutimedia(boolean mutimedia) {
        this.mutimedia = mutimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + ", mutimedia=" + mutimedia + '}';
    }
    
    
}
