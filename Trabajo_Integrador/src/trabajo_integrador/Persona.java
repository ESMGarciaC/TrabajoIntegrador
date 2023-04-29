/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_integrador;

/**
 *
 * @author Enrique
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Pronostico pronostico;
    private int puntos;

    public Persona(String nombre, String apellido, Pronostico pronostico, int puntos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pronostico = pronostico;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Pronostico getPronostico() {
        return pronostico;
    }

    public void setPronostico(Pronostico pronostico) {
        this.pronostico = pronostico;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", pronostico=" + pronostico + ", puntos=" + puntos + '}';
    }
    
    public int sumarPuntos(Pronostico puntaje){

        System.out.println("El puntaje total de " + nombre + " es igual a " + puntos );

       return puntos + puntaje.puntosdeJ;

    }
    
}
