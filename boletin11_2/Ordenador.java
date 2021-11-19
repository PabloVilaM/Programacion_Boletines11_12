package boletin11_2;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Ordenador {
    
    public void Juego(){
        
        double rand = Math.random()*51;
                
        int rand2 = (int)rand;
        Math.round(rand);
        int i = 0;
        int j = 0;
        System.out.println("El programa ah generado un numero aleatorio entre 1 y 50 (incluidos), intenta adivinarlo ");
        String nums2 = JOptionPane.showInputDialog("Cantos intentos queres");
        int num2= Integer.parseInt(nums2);
        
        while (i == 0){
            
            String nums = JOptionPane.showInputDialog("Introduce un número para adivinar el de la máquina");
            int num = Integer.parseInt(nums);
            
            int rest = Math.abs(rand2 - num);
            
            if (rest > 20 ){
                System.out.println("Estas moi lonxe de acertar");
            }
            else if (rest >= 10 && rest <= 20){
                System.out.println("Estas lonxe de acertar");
            }
            else if (rest < 10 && rest > 5){
                System.out.println("Estas preto");
            }
            else if(rest <= 5 && rest > 0){
                System.out.println("Estas moi preto");
            }
            else if (rest == 0){
                System.out.println("Has acertado POG");
                i++;
            }
            
            j++;
            
            if (j == num2){
                System.out.println("Te quedaste sin intentos");
                i++;
            }
        }
        Pregunta();
    }
    
    public void Pregunta(){
        String pregun = JOptionPane.showInputDialog("Quieres volver a jugar");
        pregun.toLowerCase();
        if (pregun.equals("si")){
            Juego();
        }
        else{
            System.out.println("Si no estas interesado bye bye");
        }
    }
}
