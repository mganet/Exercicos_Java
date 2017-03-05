package exercicios;

import Controller.ArrayListStacks;
import Controller.ArrayEstatico;
import Controller.Exer21;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        
        
        int opc = 0;
        
        
        System.out.println("1 - Array Estatico");
        System.out.println("2 - Exer21");
        System.out.println("3 - ArrayListStacks");
        System.out.print("\nEscolha: ");
        
        switch(new Scanner(System.in).nextInt()) {
            case 1 :
                new ArrayEstatico();
                break;
            case 2 :
                new Exer21();
                break;
            case 3 :
                new ArrayListStacks();
                break;
        }
       
        
    }
    
}
