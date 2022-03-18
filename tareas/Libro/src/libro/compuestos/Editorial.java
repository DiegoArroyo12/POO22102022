/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.compuestos;

/**
 *
 * @author diego
 */
public class Editorial {
    String nombre;
    String idioma;
    String fecha;
    String ciudad;

    public Editorial() {
    }

    public Editorial(String nombre, String idioma, String fecha, String ciudad) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.fecha = fecha;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", idioma=" + idioma + ", fecha=" + fecha + ", ciudad=" + ciudad + '}';
    }

    public void publicarLibro(){
        System.out.println("Publicando el último libro...");
    }
}
