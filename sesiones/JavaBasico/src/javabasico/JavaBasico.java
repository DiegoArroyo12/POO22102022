/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author diego
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println((dias + 3)); // Aquí la concatena
        int temp = Integer.parseInt(dias);
        System.out.println("Dias = " + (temp+3)); //Aquí suma la cantidad
        
        Perro dog1 = new Perro("Poddle",1);
        System.out.println( dog1 );
        System.out.println( Perro.cola );
        System.out.println( dog1.cola );
        
        Perro.ladrar();
        dog1.ladrar();
        
        String cad1 = "Hola ";
        String cad2 = "Mundo";
        String cad3 = cad1 + cad2;
        System.out.println( cad3 );
        System.out.println("Edad : " + edad + " años");
        
        String res = "";
        /*
        if ( edad >= 18 ){
            res = "Mayor de edad";
        }else{
            res = "Menor de edad";
        }
        System.out.println("Eres : " + res);
        
        System.out.println("--------");
        */
        res = (edad >= 18)?"Mayor de edad":"Menor de edad";
        System.out.println("Eres : " + res);
    }
    
}
