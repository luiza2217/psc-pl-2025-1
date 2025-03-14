import java.util.Scanner;

public class Entrada{
public static void main(String []args){
Scanner scanner = new Scanner(System.in);

System.out.println("Digite o seu nome");
String nome = scanner.nextLine();


System.err.println("Digite a sua idade");
int idade = scanner.nextInt();
System.err.println("Ola" + nome + " Você tem" + idade + " anos, seja bem vinda/o ");

}
}
