import javax.swing.JOptionPane;

public class EntradaExemplo2 {
    public static void main(String[] args) {
       int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

       if (resposta == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Você escolheu continuar!");
       } else{
        JOptionPane.showMessageDialog(null, "Você escolheu sair.");
       }





    }



}
