
public class TestaAtleta {

	public static void main(String[] args) {
		
		Atleta atleta = new Atleta();
		
		atleta.altura = 1.74;
		atleta.peso = 68;
		
		System.out.println("IMC: " + atleta.obterIMC());
		System.out.println("Situação: " + atleta.classificar());
		System.out.println("Risco à saúde: " + atleta.obterRisco());
	}
}
