
/**
 * Write a description of class Caballo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import  java.lang.Math;
import java.util.Scanner;
public class Caballo
{
    String posInicial;
    String posFinal;
    int posInitX;
    int posInitY;
    int posEndX;
    int posEndY;
    String [][] Tablero;
    int numFilas , numColumnas;
    
    public static void main(String args[]){
        Caballo juego = new Caballo();
        juego.imprimirTablero();
    }
    
    public Caballo()
    {
       Scanner lector=new Scanner(System.in);
       System.out.print("\f");
       
       System.out.println("Posición inicial del caballo (X , Y): "); 
       posInicial = lector.nextLine();
       
       System.out.println("Posición final del caballo (X , Y): "); 
       posFinal = lector.nextLine();
       
       String PosInitXY[] = posInicial.split(",");
       String PosEndXY[] = posFinal.split(",");
       
       numFilas = 8;
       numColumnas = 8;
       
       Tablero = new String[numFilas][numColumnas];
       
       posInitX = Integer.parseInt(PosInitXY[0]);
       posInitY = Integer.parseInt(PosInitXY[1]);
       
       posEndX = Integer.parseInt(PosInitXY[0]);
       posEndY = Integer.parseInt(PosInitXY[1]);
       
       if(posInitX >= 0 || posInitX <= (numFilas - 1)){
           
       }
       else{
           System.out.println("Posición X Inicial No Valida");           
       }
       
       if(posInitY >= 0 || posInitY <= (numColumnas - 1)){
           
       }
       else{
           System.out.println("Posición Y Inicial No Valida");           
       }
       
       if(posEndX >= 0 || posEndX <= (numFilas - 1)){
           
       }
       else{
           System.out.println("Posición X Final No Valida");           
       }
       
       if(posEndY >= 0 || posEndY <= (numFilas - 1)){
           
       }
       else{
           System.out.println("Posición X Final No Valida");            
       }
       
       
       
       this.llenarTablero();
       
       Tablero [posInitX][posInitY] = "0";
             
       System.out.println("\n-------------------------------------------------" );
     }
    
    public void llenarTablero(){
        for (int i = 0; i < numFilas; i++){
            for (int j = 0; j < numColumnas; j++){
                Tablero[i][j]="X";
            }
        }
    } 
     
    public void imprimirTablero(){
        for (int i = 0; i < numFilas; i++){
            for (int j = 0; j < numColumnas; j++){
                System.out.print(Tablero[i][j]); 
            }
            System.out.println();
        }
    }
}
