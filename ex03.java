import java.util.Scanner;
public class ex03{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);//Declaração scanner
        String [][] agenda = new String [10][5]; // Declaração matriz 10x5
        int n = 0;//Declaração variável N

        do {//Inicio laço de repetição Do, para fazer as perguntas 10x
            System.out.print("-------------------------------- \n");//Questão estética
            
            System.out.printf("Nome: ");//Pergunta o nome
            agenda [n][0] = s.nextLine();//Armazena a resposta na coluna correspondente

            System.out.printf("Endereco: ");//Pergunta o endereço
            agenda [n][1] = s.nextLine();//Armazena a resposta na coluna correspondente

            System.out.printf("Codigo Postal: ");//Pergunta o codigo

            System.out.printf("Bairro: ");//Pergunta o bairro
            agenda [n][3] = s.nextLine();//Armazena a resposta na coluna correspondente
            
            System.out.printf("Telefone: ");//Pergunta o telefone
            agenda [n][4] = s.nextLine();//Armazena a resposta na coluna correspondente

            n++;
        } while (n < 10);//Final laço repetição até 10x

        for (int i = 0; i < agenda.length; i++) {//Laço repetição for verificando se é maior que a quantidade de elementos da matriz
                for (int j = 0; j < agenda[i].length; j++) {//Laço repetição for verificando se j é menor que a quantidade de elementos da matriz com parâmetro i
                    System.out.print ("\t\t"+ agenda[i][j]);//Configura e exibe matriz
                }
        System.out.println();//Mostra resultado
        } 

        s.close();//Fecha o scanner
    }
}

       