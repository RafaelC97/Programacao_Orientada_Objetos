import java.util.Scanner; // é necessario importar os objetos

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        boolean ehBrasileiro;
        double salario;

        Scanner scan = new Scanner(System.in); //System.in indica que vai ser lido oque for digitado do teclado.
        //poderia ser um new file("nome do arquivo") para indicar que seria lido de um arquivo existente.

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine(); //linha que vai ser lida do teclado e armazenado na variavel (nextLine para String)

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt(); //nextInt para inteiros; equivalente ao scanf, mas é necessario Scanner scan = new Scanner(System.in)

        //System.out.println("Digite seu sexo: ");
        //sexo = scan.nextLine(); ex: colocar um nextLine depois de um nextInt sempre da erro a menos que limpe o buffer.

        System.out.println("Voce eh brasileiro ");
        ehBrasileiro = scan.nextBoolean();

        System.out.println("Digite seu salario: ");
        salario = scan.nextDouble();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);

        if(ehBrasileiro){
            System.out.println("Eh Brasileiro!");
        }else {
            System.out.println("Nao eh Brasileiro!");
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}