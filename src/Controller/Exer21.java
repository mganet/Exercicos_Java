package Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer21 {
    
    ArrayList<String> array_ = new ArrayList<String>() {{
        add("b");
        add("3");
        add("Carruagem");
        add("8.56");
        add("caixa de armazenamento");
    }};
    
    public Exer21() {
       
        int opc = 0;
        
        do {
            
            System.out.println("1 - Listar");
            System.out.println("2 - Adicionar");
            System.out.println("3 - Sair");
            System.out.print("\nEscolha: ");
            opc = new Scanner(System.in).nextInt();
            
            switch(opc) {
                case 1 :
                    listArray();
                    break;
                case 2 :
                    System.out.print("Item a adicionar: ");
                    addItem(new Scanner(System.in).nextLine());
                    break;
                case 3 :
                    System.out.println("Até logo");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while(opc != 3);
       
    }
    
    void listArray() {
        for(int i = 0; i < array_.size();System.out.println(array_.get(i++)));
    }
    
    void addItem(String item) {
        array_.add(item);
    }
    
}
