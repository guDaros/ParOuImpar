
package parouimpar;

import java.util.Random;

public class Jogador {
    int vitorias=0, derrotas=0;
    String nome;
    Random gerador = new Random();
        
    int jogar() {
       return gerador.nextInt(2);
    }
    
    static void duelo(Jogador j1, Jogador j2) {
        int valor1 = j1.jogar() + 1;
        int valor2 = j2.jogar() + 1;
        if(valor1 % valor2 == 0) {
            j1.vitorias++;
            j2.derrotas++;
        } else {
            j1.derrotas++;
            j2.vitorias++;
        }
    }
    
    void descrever() {
        System.out.println("Nome: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        
    }
    
}
   