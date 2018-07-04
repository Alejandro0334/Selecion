/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selecion;

/**
 *
 * @author Alejandro
 */
public class Selecion {

     enum delanteros{
           
       FALCAO_GARCIA(34,33),
       CARLOs_BACCA (33, 80);   
            
        double efectividad;
        int golesXPartido;

        delanteros(double efectividad, int golesXPartido) {
            this.golesXPartido = golesXPartido;
            this.efectividad = efectividad;
        }
    }
     
     enum defensa{
     MINA(23,4),
     SANCHEZ(4,5),
     ARIAS(34,5),
     DAVINSON(25,18);
     
     double KmXPartido;
     int balonesRecuperados;
     
        defensa(double KmXPartido, int balonesRecuperados)
        {
           this.KmXPartido = KmXPartido;
           this.balonesRecuperados = balonesRecuperados;
        }
     }
     
     enum medio{
     
     JAMEZ(13,6),
     QUINTERO(14,2);
     
     int pasesEfectivosXPartido;
     int golesXPartido;
     
        medio(int pasesEfectivosXPartido, int golesXPartido)
        {
            this.golesXPartido = golesXPartido;
            this.pasesEfectivosXPartido = pasesEfectivosXPartido;
        }
     
     }
    /**
     * @param args the command line arguments
     */
    private static delanteros d1Derecha;
    private static delanteros d1Izquierda;
    private static medio m1Centro;
    private static medio m2Centro;
    private static defensa df1Derecha;
    private static defensa df1Izquierda;
    private static defensa df1Centro;
    private static defensa df2Centro;
   
     static class alineacion {

         public void definirDelanteroDerecha(){
              d1Derecha = delanteros.CARLOs_BACCA;
              System.out.println("Delantero derecha: "+d1Derecha);
         }
         
         public void definirDelanterosIzquierda(){
             d1Izquierda = delanteros.FALCAO_GARCIA;
             System.out.println("Delantero izquierda: "+d1Izquierda);
         }
         
         public void definirMedio(){
             m1Centro = medio.QUINTERO;
             m2Centro = medio.JAMEZ;
             
             System.out.println("Medio Campo: " + m1Centro);
         }
         
         public void defensa(){
             df1Derecha = defensa.ARIAS;
             df1Izquierda = defensa.SANCHEZ;
             df1Centro = defensa.MINA;
             df2Centro = defensa.DAVINSON;
             
             System.out.println("Defensa derecha: " +df1Derecha);
             System.out.println("Defensa izquierda: "+df1Izquierda);
             System.out.println("Defensa central: " + df1Centro + " - " + df2Centro);             
         }
    }

    public static void main(String[] args) {
        alineacion a = new alineacion();
        
        a.defensa();
        a.definirMedio();
        a.definirDelanteroDerecha();
        a.definirDelanterosIzquierda();
    }
    
}
