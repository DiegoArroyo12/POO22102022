/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.compuestos;

/**
 *
 * @author diego
 */
public class Genero {
    int numeroRegistro;
    String genero;

    public Genero() {
    }

    public Genero(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return "Genero{" + "numeroRegistro=" + numeroRegistro + '}';
    }

    public void genero(int numeroRegistro){
        if (numeroRegistro == 000){
            System.out.println("El Género del libro es: Generalidades");
        }
        else if(numeroRegistro == 100){
            System.out.println("El Género del libro es: Filosofía y Psicología");
        }
        else if (numeroRegistro == 200){
            System.out.println("El Género del libro es: Religión");
        }
        else if (numeroRegistro == 300){
            System.out.println("El Género del libro es: Ciencias Sociales");
        }
        else if (numeroRegistro == 400){
            System.out.println("El Género del libro es: Lunguas");
        }
        else if (numeroRegistro == 500){
            System.out.println("El Género del libro es: Matemáticas y Ciencias Naturales");
        }
        else if (numeroRegistro == 600){
            System.out.println("El Género del libro es: Tecnología");
        }
        else if (numeroRegistro == 700){
            System.out.println("El Género del libro es: Artes");
        }
        else if (numeroRegistro == 800){
            System.out.println("El Género del libro es: Literatura");
        }
        else if (numeroRegistro == 900){
            System.out.println("El Género del libro es: Historia y Geografía");
        }
    }
            
}
