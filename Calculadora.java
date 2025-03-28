public class Calculadora {
 
public void saudacao(){
    System.out.println("Bem vindo/a a calculadora");
}

public void somar(int a, int b){  // Parametro, só consigo usar se usar argumentos que satisfaçam os parametros sempre.
    System.err.println("Soma:" + (a + b)); // System é volátil, ele mostra e não armazena
}
public int multipicar(int x, int y){ // Com o void não quero retorno, sem o void eu quero retorno
    return x * y; // o return armazena um valor
}

}


// Métodos são ações, podem ser simples ou complexos 