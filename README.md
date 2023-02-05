# Construtores em Java
##Definição de Construtor
###Um construtor é um método de grande importância dentro de uma classe Java. Ele possui algumas características proprias:

#### * Assim como o método, ele tem o mesmo nome que a classe onde se encontra
#### * Não possui um valor de retorno, nem mesmo void.
#### * É passível de possuir parâmetros (argumentos)
#### * Toda classe deve possuir ao menos 1 construtor
#### * Se o desenvolvedor não escrever um construtor em uma classe, a JVM irá prover um construtor sem argumentos, também chamado de default.

### Exemplo de construtores(ver o funcionamento no projeto teste)

````
public class Carro{

private String cor;
private double preco;
private String modelo;

/* CONSTRUTOR PADRÃO OU CONSTRUTOR VAZIOU OU CONSTRUTOR SEM ARGUMENTOS (USANDO LOMBOK, USAR @@NoArgsConstructor) */
public Carro(){

}

/* CONSTRUTOR COM 2 PARÂMETROS */
public Carro(String modelo, double preco){
//Se for escolhido o construtor sem a COR do veículo
// definimos a cor padrão como sendo PRETA
this.cor = “PRETA”;
this.modelo = modelo;
this.preco = preco;
}

/* CONSTRUTOR COM 3 PARÂMETROS */
public Carro(String cor, String modelo, double preco){
this.cor = cor;
this.modelo = modelo;
this.preco = preco;
}

}

public class Honda extends Carro{

private String motor;

/* CONSTRUTOR PADRÃO */
public Honda(){

}

/* CONSTRUTOR COM PARÂMETROS */
public Honda(String motor, String modelo, double preco){
super(modelo, preco);
this.motor = motor;
}

}

public class Aplicacao {


public static void main(String[] args) {
//Construtor sem parâmetros
Honda hondaFitPreto = new Honda(“2.0 Flex”, “Honda Accord”, “60000”);
}

}

````
