/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_integrador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class Ronda {
    private String nro;
    public List<Partido> partidosjugados = new ArrayList<>();

    public Ronda(String nro) {
        this.nro = nro;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public List<Partido> getPartidosjugados() {
        return partidosjugados;
    }

    public void setPartidosjugados(List<Partido> partidosjugados) {
        this.partidosjugados = partidosjugados;
    }

    @Override
    public String toString() {
        return "Ronda " + "nro " + nro + ", partidosjugados " + partidosjugados ;
    }
    
    public void agregarPartidos(Partido partidos){
       
        partidosjugados.add(partidos);
    
    }
    
    
}
