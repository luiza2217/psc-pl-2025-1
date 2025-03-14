import javax.swing.JOptionPane;

public class Entrada_Joption {
public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite seu nome"); //JOption é uma classe

   String idade = JOptionPane.showInputDialog("Digite a sua idade");
    
  double altura = Double.parseDouble(JOptionPane.showInputDialog(" Digite a sua altura")); //showInputDialog só aceita String
  
   int idadeStr = Integer.parseInt(idade); // Parse faz a conversao

   JOptionPane.showMessageDialog(null, " Meu nome é " + nome + " Tenho " + idadeStr + " Minha altura é " + altura);

}    


}
