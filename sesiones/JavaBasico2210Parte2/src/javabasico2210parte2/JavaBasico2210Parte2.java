/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.Figura;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class JavaBasico2210Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c = new Cuadrado(4.0f, 4.0f);
        Circulo cir = new Circulo(5.0f);
        
        System.out.println( c.calcularArea() );
        System.out.println( cir.calcularArea() );
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("1) Cuadrado, 2) Círculo, 3) Triángulo, 4) Rectángulo\nElige una opción: ");
        int opcion = teclado.nextInt(); // Excepciones
        switch (opcion) {
            case Figura.CUADRADO:
                System.out.println(c.calcularArea());
            case Figura.CIRCULO:
                System.out.println(cir.calcularArea());
            case Figura.TRIANGULO:
                // Área triángulo
                break;
            case Figura.RECTANGULO:
                // Área rectángulo
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        JOptionPane.showMessageDialog(null, "Hola", "El título", JOptionPane.ERROR_MESSAGE);
        
        /*
        JFrame. Nos permite hacer ventanas tipo Windows
        JButton. Para botones
        MouseListener
        JDialog Cuadros de diálogo
        
        Color color = new Color(Color.GREEN);
        Color micolor = new Color(186, 52, 235);
        */
        
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Daniela");
        eda.entrenar();
        eda.ensayar();
        eda.comer();
    }
    
}
