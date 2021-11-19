package boletin11_1;

import javax.swing.JOptionPane;


public class Adivinanza {
    
    public void Adivinar(){
        int j = 0;
        while (j == 0){
            int i = 1;
            String respus = JOptionPane.showInputDialog("Jugador 1, introduce un numero del 1 al 50 (sin incluir), sera el numero que el jugador 2 intente adivinar");
            int respui = Integer.parseInt(respus);
            String respus2 = JOptionPane.showInputDialog("Introduce el numero de intentos que tiene");
            int contador = Integer.parseInt(respus2);
           
        
           while(i <= contador){
            String respus3 = JOptionPane.showInputDialog("Jugador 2, introduce un número (recuerda que tienes que adivinar uno entre 1 y 50");
            int respui3 = Integer.parseInt(respus3);
            
            if(respui3 < respui){
                System.out.println("O número tecleado é menor ca o que tes que adivinar");
            }
            else if (respui3 > respui){
                System.out.println("O número tecleado e maior ca o que tes que adivinar");
            }
            else{
                System.out.println("Has adiviñado el número");
                i = contador;
            }
            i++;
         }
          
          if(i != contador+1){
              System.out.println("Te has quedado sin intentos! Ese era el último");
              i=1;
          }
          
        }
       
    }
}
