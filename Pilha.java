
package atividade_pilha;

import java.util.ArrayList;

public class Pilha<t> {
    
    public ArrayList<t>pilha = new ArrayList<>();
    
    //método de empilhar, n representa nosso item que será inserido na classe main
    public void empilhar(t n){
        pilha.add(n);
    }
    
    //percorrendo minha pilha com o for para desempilhar
    public void desempilhar(){
        if (pilha.isEmpty() !=true){
            for (int j = pilha.size()-1; j>=0;j--){
                System.out.printf("%s",pilha.get(j)+ "\n");
            }
        }
        else{
            System.out.println("A pilha está vazia");
        }
        
    }
}
