/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_integrador;


/**
 *
 * @author Enrique
 */
public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;
    public int puntosdeJ = 0;

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return  partido + ", equipo=" + equipo + ", resultado=" + resultado + ", puntos=" + puntosdeJ + '}';
    }
        
    
    
    public int puntos(Pronostico resultadoPro, Partido resultadoPar){
        
        
        
        if(resultadoPro.equipo.equals(resultadoPar.getEquipo1())&&
           resultadoPro.resultado.equals(resultadoPar.resultadoP(resultadoPar.getEquipo1())) || 
           resultadoPro.equipo.equals(resultadoPar.getEquipo2()) &&
           resultadoPro.resultado.equals(resultadoPar.resultadoP(resultadoPar.getEquipo2()))){
           resultadoPro.puntosdeJ = resultadoPro.puntosdeJ +1 ; 
            System.out.println("Se suma un total de " + puntosdeJ);
              }
        else{
            System.out.println("No suma puntos");
        }
        
        return puntosdeJ;
    }
    
}

