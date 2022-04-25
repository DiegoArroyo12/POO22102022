/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author diego
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se debe crear un arreglo de 5 cuentahabinetes con datos de ejemplo y 
        con un FOR EACH deben mostrar quien es Premium y quien es Regular
        */
        Cuentahabiente cliente1 = new Cuentahabiente(112233, "Alberto", 67000.56f);
        Cuentahabiente cliente2 = new Cuentahabiente(122334, "Elizabeth", 53000.07f);
        Cuentahabiente cliente3 = new Cuentahabiente(319169, "Diego", 35560.00f);
        Cuentahabiente cliente4 = new Cuentahabiente(213567, "David", 27438.89f);
        Cuentahabiente cliente5 = new Cuentahabiente(062341, "Denisse", 12783.00f);
        
        Cuentahabiente [] clientes = {cliente1,cliente2,cliente3,cliente4,cliente5};
        
        for (Cuentahabiente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Id de Cliente: " + cliente.getIdCliente());
            System.out.println("Balance: " + cliente.getBalance());
            System.out.println(cliente.evaluarNivelCliente());
            cliente.retirarDinero(7000.90f);
            System.out.println(cliente.evaluarNivelCliente());
            System.out.println();
        }
    }
    
}
