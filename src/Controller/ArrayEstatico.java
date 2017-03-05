package Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEstatico {
    
    int num_[]   = new int[100];
    int array_  = 0;
    

    public ArrayEstatico() {
        
        int opc     = 0,
            num  = 0;
        
        do {
            
            System.out.println("Array Estatico");
            System.out.println("1 - Adicionar array");
            System.out.println("2 - Procurar array");
            System.out.println("3 - Listar array");
            System.out.println("4 - Eliminar array");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha: ");
            opc = new Scanner(System.in).nextInt();
            
            switch(opc) {
                case 1 :
                    System.out.print("Insira o numero que deseja introduzir: ");
                    num = new Scanner(System.in).nextInt();
                    addNumber(num);
                    break;
                case 2 :
                    System.out.print("Insira o numero que deseja procurar: ");
                    num = new Scanner(System.in).nextInt();
                    num = searchNumber(num);
                    
                    if(num != -1) {
                        System.out.println("Existe encontra-se na posição: " + num);
                    } else {
                        System.out.println("Numero inexistente");
                    }
                    break;
                case 3 :
                    listArray();
                    break;
                case 4 :
                    if(array_ > 0) {
                        System.out.print("Posição do número que deseja apagar: ");
                        num = new Scanner(System.in).nextInt();
                        delNumber(num);
                    } else {
                        System.out.println("Não existe numeros introduzidos para apagar");
                    }
                    break;
                case 5 :
                    break;
                default :
                    System.out.println("Opção invalida");
                    break;
            }
            
        } while(opc != 5);
    }
    
    public void addNumber(int num) {
        num_[array_] = num;
        array_++;
    }
    
    public int searchNumber(int num) {
        for(int i = 0; i < array_; i++) {
            if(num_[i] == num) return i;
        }
        
        return -1;
    }
    
    public void listArray() {
        for(int i = 0; i < array_; i++) {
            System.out.println("Posição: " + i + " Numero: " + num_[i]);
        }
    }
    
    public void delNumber(int num) {
       
            if(num != array_-1) {
                num_[num]       += num_[array_-1];
                num_[array_-1]  =  num_[num] - num_[array_-1];
                num_[num]       -= num_[array_-1];     
            }

            num_[array_-1] = 0;
            array_--;
    }
    
}
