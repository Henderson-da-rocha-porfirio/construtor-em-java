public class Retangulo {

	private double largura; // atributos
	private double altura; // atributos
	
	public Retangulo() {
		this(4, 3); // O construtor parece um método mas não é um método. Ele é chamado no momento em que o objeto é instanciado, ou seja o código será executado pelo objeto.
		largura = 4;           // Ele não retorna ou define nada nele. Isso só acontece dentro do método.
		altura = 3;			// Pode criar objetos Retangulo sem criar nenhuma informacao ou parametro em ()
	}
	
	public Retangulo(double largura, double altura) { // Construtor com passagem de parâmetros. Sobrecarga de construtores (só mudar os parâmetros)
		this.largura = largura;							// Pode criar objetos Retangulo passando a informacao de largura e altura que irão assumir os valores passados no construtor.
		this.altura = altura;
	}
	
	public double calcularArea() { // método se diferencia de um construtor porque esse tem retorno (return)
		return largura * altura;
	}
}
