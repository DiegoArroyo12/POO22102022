/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author diego
 */
public class Cuentahabiente {
    int idCliente;
    String nombre;
    float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero( float monto ){
        // Código para restarle el monto al balance
        balance -= monto;
        System.out.println(nombre + " tu retiro es de: " + monto + " tu balance es de: " + balance);
    }
    
    public String evaluarNivelCliente(){
        /*
        Dependiendo del balance debe regresar un String con una de estas dos opciones: 
        1.- "Cliente Regular" si es menor o igual a 50 mil.
        2.- "Cliente Premium" si es mayor a 50 mil
        */
        if (balance <= 50000){
            return "Cliente Regular";
        }else{
            return "Cliente Premium";
        }
    }
}
