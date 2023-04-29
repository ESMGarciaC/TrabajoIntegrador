/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_integrador;





/**
 *
 * @author Enrique
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Equipo Argentina = new Equipo("Argentina");
       Equipo Francia = new Equipo ("Francia") ;
       Equipo Alemania = new Equipo ("Alemania") ;
       Equipo Mexico = new Equipo ("mexico") ;
       
       
       Partido partido1 = new Partido( Argentina, Francia, 5, 4);
       Partido partido2 = new Partido( Alemania, Mexico, 2, 2);
       
       Pronostico Prueba = new Pronostico(partido1, Argentina, ResultadoEnum.ganador); 
       Pronostico Prueba2 = new Pronostico(partido2, Alemania, ResultadoEnum.empate);
       
       Persona Enrique = new Persona("Kike","Garcia",Prueba,0);
       
       Ronda Ronda1 = new Ronda ("Ronda 1" );
       Ronda Ronda2 = new Ronda ("Ronda 2" );
       
       partido1.resultadoP(Argentina);
       partido2.resultadoP(Alemania);
               
       System.out.println("Goles de " + Argentina + " " + partido1.getGolesEquipo1());
       System.out.println("Goles de " + Francia + " " + partido1.getGolesEquipo2());
       
       System.out.println("Goles de " + Alemania + " " + partido2.getGolesEquipo1());
       System.out.println("Goles de " + Mexico + " " + partido2.getGolesEquipo2());
       
       Prueba.puntos(Prueba, partido1);
       Prueba2.puntos(Prueba2, partido2);
       
       System.out.println(Prueba);
       System.out.println(Prueba2);
      
       
       Ronda1.agregarPartidos(partido1);
       Ronda2.agregarPartidos(partido2);
       
       System.out.println(Ronda1);
       System.out.println(Ronda2);
       
       System.out.println(Enrique.getPuntos());
       
       Enrique.getPuntos();
        
        
    }
    
}
