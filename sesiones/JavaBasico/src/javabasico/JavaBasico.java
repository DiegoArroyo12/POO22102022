/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
        
        int val1 = 7;
        int val2 = 2;
        System.out.println(val1 | val2);
        System.out.println(val1 & val2);
        /*
        val1 = 000...0001
        val2 = 000...0010
        */
        // Desplazamiento a nivel de bits
        
        int val3 = 1;  // 000...0001
        int val4 = val3<<1; // Desplazar los bits una posición a la IZQ
                            // 000...0010
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        System.out.println("--- Arreglos ---");
        
        int [] edades; // Aquí solo se declara
        int [] edades2 = new int[5]; // Aquí se declara y reserva memoria
        int [] edades3 = {22,21,18,19,18}; // En este, se declara, reserva e inicializa
        
        /*
        Ahora se usa igual como en lenguaje C, C++, Python...etc.
        */
        
        edades2[0]=33;
        System.out.println("Edades 2:");
        System.out.println(edades2[0]); // 33
        System.out.println(edades2[1]); // 0
        // Ahora imprimimos las edades3
        System.out.println("Edades 3 a mano:");
        System.out.println( edades3[0] );
        System.out.println( edades3[1] );
        System.out.println( edades3[2] );
        System.out.println( edades3[3] );
        System.out.println( edades3[4] );
        // Ahora, lo combinamos con FOR
        System.out.println("Automatizado: ");
        for (int i = 0; i < edades3.length; i++) {
            System.out.println(edades3[i]);
        }
        /*
        Ejercicio 1
        Imprimir edades en orden inverso, empezar en 18 y teminar en 22
        */
        System.out.println("Ejercicio 1:");
        for (int i = edades3.length -1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        /*
        Ejercicio 2
        Cambiar todas las edades3 a 18
        */
        System.out.println("Ejercicio 2:");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = 18;
            System.out.println(edades3[i]);
        }
        
        /*
        for Each es un for especial, introducinedo en la versión 2 de Java.
        En esa versión Java sufrió muchos cambios que lo mejoraron bastante.
        El objetivo del For Each es simplificar la forma de recorrer arreglos
        fore + tecla tabulador
        */
        System.out.println("Con for each: ");
        for (int ed : edades3) {
            System.out.println( ed );
        }
        
        /*
        El for each lo seguiremos usando
        Es una sintaxis toralmente nueva, los : significa que del arreglo
        que esta al frente de los ":", sacar el siguiente elemento y 
        asignarlo a lo que esa a la izquierda de los :
        */
        
        System.out.println("Arreglo de la clase perro:");
        
        Perro [] lista = new Perro[3];
        lista[0] = new Perro("Poddle", 1);
        lista[1] = new Perro("San Bernardo", 3);
        lista[2] = new Perro("Akita", 2);
        // fore + TAB
        for (Perro perro : lista) {
            perro.comer();
        }
        
        System.out.println("Todos los perros a doberman:");
        for (Perro perro : lista) {
            perro.setRaza("Doberman");
        }
        
        // Volvemos a imprimir la lista
        for (Perro perro : lista) {
            System.out.println(perro);
        }
        
        //ArrayList de la clase Perro
        ArrayList mascotas = new ArrayList();
        mascotas.add( new Perro("Poddle",1));
        mascotas.add( new Perro("Doberman",2));
        mascotas.add( new Perro("Akita",2));
        mascotas.add( new Perro("Gran Danes",3));
        mascotas.add( new Perro("Chihuahua",0));
        
        for (Object mascota : mascotas) {
            Perro tmp = (Perro)mascota;
            tmp.setTamano(4);
            System.out.println( tmp );
        }
        
        // Despues de la versión 2 de java se agregó el concepto de clases
        // genericas
        
        System.out.println("----- Con Genérica -----");
        
        ArrayList<Perro> mascotas2 = new ArrayList<Perro>();
        mascotas2.add( new Perro("Poddle",1));
        mascotas2.add( new Perro("Doberman",2));
        mascotas2.add( new Perro("Akita",2));
        mascotas2.add( new Perro("Gran Danes",3));
        mascotas2.add( new Perro("Chihuahua",0));
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qué raza quieres cambiar de tamaño???");
        String raza = "Akita"; // Faltan excepciones
        
        System.out.println("------------------");
        
        for (Perro perro : mascotas2) {
            if(perro.getRaza().equals( raza )){
                perro.setTamano(4);
            }
        }
        
        for (Perro perro : mascotas2) {
            System.out.println( perro );
        }
        
        mascotas2.add(2, new Perro("Pug",2));
        System.out.println("------------------");
        for (Perro perro : mascotas2) {
            System.out.println( perro );
        }
        
        System.out.println("-------- GET ----------");
        
        System.out.println("Perro 2 es: " + mascotas2.get(2));
        
        System.out.println("--------- REMOVE ----------");
        
        System.out.println("Eliminar el akita, index 3");
        System.out.println("------------------");
        Perro p = mascotas2.remove(3);
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println("------------------");
        System.out.println("Perro sacado es: " + p);
        
        mascotas2.set(1, new Perro("Boxer", 3));
        mascotas2.set(2, new Perro("Labrador",4));
        System.out.println("------------------");
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        
        // Manejo de excepciones
        
        System.out.println("Elige un número entre 0 y 4:");
        Perro puppy=null;
        int num = 10;
        try{
            int indice = teclado.nextInt();
            puppy = mascotas2.get(indice);
            num = num / indice;
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Ocurrió un error, el valor debe estar entre 0 y 4");
            System.out.println( ex.getMessage());
            puppy = mascotas2.get(0);
        }catch(InputMismatchException ime){
            System.out.println("Solo deben ser números");
            puppy = mascotas2.get(0);
        }catch(Exception e){
            System.out.println("Ültimo recurso....");
        }finally{
            System.out.println("En finally");
            System.out.println(puppy);
        }
        // ERROR != EXCEPCION
        System.out.println("Se alcanzó el fin del programa!!");
    }
}
