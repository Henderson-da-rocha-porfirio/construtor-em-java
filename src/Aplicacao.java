public class Aplicacao {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(); //Instanciando um retangulo r1 criando um novo objeto Retangulo.
		double area1 = r1.calcularArea();
		System.out.println(area1);
		
		Retangulo r2 = new Retangulo(5, 7); // refere-se ao costrutor que chamam dois parâmetros, no caso converterá em double como está alí na classe Retangulo.
		double area2 = r2.calcularArea();
		System.out.println(area2);

		Quadrado q = new Quadrado(6);
		System.out.println(q.calcularArea());
		
	}
}
