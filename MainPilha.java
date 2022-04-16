
package atividade_pilha;

public class MainPilha {
    public static void main(String[] args){
        
        //Porque a classe Pilha funciona tanto para instanciar 
        //uma pilha de “Strings”,quanto para instanciar uma pilha de “Inteiros”?
        
        
        //instanciando uma pilha de strings:
        Pilha pilha_string = new Pilha<String>();
        
        //empilhando
        pilha_string.empilhar("PRIMEIRO");
        pilha_string.empilhar("SEGUNDO");
        pilha_string.empilhar("TERCEIRO");
        
        //instanciando uma pilha de integer:
        Pilha pilha_int = new Pilha<Integer>();
        
        pilha_int.empilhar(1);
        pilha_int.empilhar(2);
        pilha_int.empilhar(3);
        
        //desempilhando a pilha de string:
        pilha_string.desempilhar();
        
        //desempilhando a pilha de integer:
        pilha_int.desempilhar();
        
    }
}
