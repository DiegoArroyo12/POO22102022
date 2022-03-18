/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

import libro.compuestos.Autor;
import libro.compuestos.Editorial;
import libro.compuestos.Genero;
import libro.compuestos.Tamaño;
import libro.usuario.Lector;

/**
 *
 * @author diego
 */
public class Libro {
    
    String titulo;
    int paginas;
    float costo;
    int estante;

    public Libro() {
    }

    public Libro(String titulo, int paginas, float costo, int estante) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.costo = costo;
        this.estante = estante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", paginas=" + paginas + ", costo=" + costo + ", estante=" + estante + '}';
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro = new Libro();
        libro.setTitulo("Veintemil Leguas de Viaje Submarino");
        libro.setPaginas(150);
        libro.setCosto(199.99f);
        libro.setEstante(8);
        
        System.out.println("Título del libro: " + libro.getTitulo());
        System.out.println("Número de páginas: " + libro.getPaginas());
        System.out.println("Precio del libro: $" + libro.getCosto());
        System.out.println("Se encuentra en el estante número: " + libro.getEstante());
        
        Autor autor = new Autor();
        autor.setNombre("Julio Verne");
        autor.setFechaNacimiento("8 de febrero de 1828");
        autor.setNacionalidad("Francés");
        
        System.out.println("Nombre del autor: " + autor.getNombre());
        System.out.println("Fecha de Nacimiento del Autor: " + autor.getFechaNacimiento());
        System.out.println("Nacionalidad del Autor: " + autor.getNacionalidad());
        
        autor.escribirNovela();
        
        Editorial editorial = new Editorial();
        editorial.setNombre("Porrúa");
        editorial.setIdioma("Español");
        editorial.setCiudad("Nantes");
        editorial.setFecha("20 de marzo de 1869 ");
        
        System.out.println("Nombre de la editorial: " + editorial.getNombre());
        System.out.println("Idioma: " + editorial.getIdioma());
        System.out.println("Ciudad: " + editorial.getCiudad());
        System.out.println("Fecha del libro: " + editorial.getFecha());
        
        editorial.publicarLibro();
        
        Genero genero = new Genero();
        genero.setNumeroRegistro(800);
        genero.genero(800);
        
        Tamaño tamaño = new Tamaño();
        tamaño.setMedidas("Estándar");
        tamaño.tamañoLibro("Estándar");
        
        Lector lector = new Lector();
        lector.setNombre("Diego Arroyo Palacios");
        lector.setEdad(18);
        
        lector.setNumeroCuenta(319169812);
        System.out.println("Lector: " + lector.getNombre());
        System.out.println("Edad del Lector: " + lector.getEdad());
        System.out.println("Número de cuenta del lector: " + lector.getNumeroCuenta());
        
        lector.solicitarLibro();
        lector.tomarLibro(8);
        lector.leer();
        lector.devolverLibro();
        
        System.out.println();
        System.out.println("Ejemplo con formato de la clase del miércoles 16 de Marzo:");
        System.out.println();
        
        System.out.println(libro);
        System.out.println(autor);
        autor.escribirNovela();
        System.out.println(editorial);
        editorial.publicarLibro();
        System.out.println(genero);
        System.out.println(tamaño);
        System.out.println(lector);
        lector.solicitarLibro();
        lector.tomarLibro(8);
        lector.leer();
        lector.devolverLibro();
    }   
}