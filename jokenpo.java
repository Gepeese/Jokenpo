import java.util.Scanner;
import java.util.Random;
public class jokenpo{
    public static void main(String[] args) {
        // 1- papel , 2- pedra, 3- tesoura
        Scanner Ler = new Scanner(System.in);
        Random gerador = new Random();
        int numeroUsuario;
        int escolhaComputador;
        int pontosUsuario = 0;
        int pontosComputador = 0;

        for(int i = 0; i < 5; i++){
        numeroUsuario = Ler.nextInt();
        escolhaComputador = gerador.nextInt(3) + 1; // gera um número de 1 a 3.

        //visualização da escolha do computador
        switch(escolhaComputador){
            case 1:
            System.out.println("Computador escolheu papel");
            break;
            case 2:
            System.out.println("Computador escolheu pedra");
            break;
            case 3:
            System.out.println("Computador escolheu tesoura");
            break;

        }

  //verificacao do resultado
        if(numeroUsuario == escolhaComputador){
            System.out.println("Empate.");

        }
        else if((numeroUsuario - escolhaComputador) == -1 || 
        (numeroUsuario - escolhaComputador) == 2){
            System.out.println("Usuário Vencedor da rodada");
            pontosUsuario = pontosUsuario + 1;
        }
        else{
            System.out.println("Computador Vencedor da rodada");
            pontosComputador = pontosComputador + 1;

        }
        
    }
    //verificação final de pontos
    if(pontosUsuario > pontosComputador){
        System.out.println("Usuário Venceu a partida");
    }
    else if(pontosUsuario < pontosComputador){
    System.out.println("Computador Venceu a Partida");
    }
    else {
        System.out.println(   "O jogo empatou!");
    }
    Ler.close();
    }
}