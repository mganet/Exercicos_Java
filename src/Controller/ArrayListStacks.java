package Controller;

import Model.Aluno;
import java.util.ArrayList;
import java.util.Stack;

public class ArrayListStacks {

    ArrayList<Aluno> aluno_ = new ArrayList<Aluno>();
    Stack<Aluno> stack_ = new Stack<Aluno>();

    public ArrayListStacks() {
        
        arrayList();
        for(int i = 0; i < aluno_.size(); System.out.println(aluno_.get(i++).getNome()));
        stack();
        for(int i = 0; i < aluno_.size(); System.out.println(stack_.get(i++).getNota()));
        
    }
    
    void arrayList() {
        Aluno a1 = new Aluno("Mário", "911111111", 20);
        Aluno a2 = new Aluno("Pedro", "911111111", 19);
        Aluno a3 = new Aluno("Bogdan", "911111111", 18);
        Aluno a4 = new Aluno("Menor Duart", "911111111", 17);
        Aluno a5 = new Aluno("Rui", "911111111", 16);
        
        aluno_.add(a1);
        aluno_.add(a2);
        aluno_.add(a3);
        aluno_.add(a4);
        aluno_.add(a5);
    }
    
    void stack() {
        
        int min  = 21,
            last = -1,
            max  = -1,
            pos  = -1;
        
        do {
            
            for(int i = 0; i < aluno_.size(); i++) {
                if(aluno_.get(i).getNota() < min && pos == -1) {
                    min = aluno_.get(i).getNota();
                    pos = i;
                } else if(aluno_.get(i).getNota() > last) {
                    min = aluno_.get(i).getNota();
                    pos = i;
                }
                if(aluno_.get(i).getNota() > max) max = aluno_.get(i).getNota();
            }
            
            stack_.add(aluno_.get(pos));
            last = min;
            
        } while(min != max);
    }
    
    
    
}
