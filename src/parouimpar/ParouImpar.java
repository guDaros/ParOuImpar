package parouimpar;

public class ParouImpar {

    public static void main(String[] args) {
        Jogador mario = new Jogador();
        mario.nome = "Mario";
        Jogador luigi = new Jogador();
        luigi.nome = "Luigi";
        Jogador yoshi = new Jogador();
        yoshi.nome = "Yoshi";
        Jogador.duelo(mario, luigi);
        Jogador.duelo(mario, yoshi);
        Jogador.duelo(luigi, yoshi);
        Jogador.duelo(luigi, mario);
        Jogador.duelo(yoshi, mario);
        Jogador.duelo(yoshi, luigi);
        
        mario.descrever();
        luigi.descrever();
        yoshi.descrever();
    }
    
}
