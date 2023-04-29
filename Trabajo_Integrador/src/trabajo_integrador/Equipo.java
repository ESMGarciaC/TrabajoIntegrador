/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_integrador;

/**
 *
 * @author Enrique
 */
public class Equipo {
    private String nombre;
    private ResultadoEnum descripcion;

    public Equipo(String nombre) {
        this.nombre = nombre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ResultadoEnum getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(ResultadoEnum descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
}
