public class Main {
    // classe pessoa é para definir somente atributos da pessoa e o que foi pedido
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); // o objeto vai ser criado a partir da classe pessoa. Isso é uma instancia da classe pessoa
        p1.nome = "Luiza";
        p1.idade = 18;
        p1.apresentar(); // porque o método apresentar foi definido para apresentar as informações
    
        ContaBancaria cb = new ContaBancaria(); //Modificadores de acesso get e setters
        cb.setSaldo(30);
        System.out.println(cb.getSaldo());
         
        Calculadora calc = new Calculadora();
        calc.somar(5,17); //aqui eu só quero mostrar
        int res = calc.multipicar(2,6); // só armazena

        

         // só executa a classe pessoa Main, ela olha para a classe pessoa, vê os atributos e executa eles 
    }
}
// A classe pessoa só realiza o que foi pedido
// Orientação a objeto ela se baseia ao objeto até criar um conjunto e reaproveitar esse conjunto. Se quiser criar uma nova pessoa, eu vou estar instanciando a classe pessoa 