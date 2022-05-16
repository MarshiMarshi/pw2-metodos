
public class Atleta {

	public double peso;
	public double altura;
	
	public double obterIMC() {
		
		return peso / Math.pow(altura, 2);
	}
	
	public String classificar() {
		
		if (obterIMC() < 18.5) 
			return "Abaixo do Peso";
		
		else if (obterIMC() >= 18.5 && obterIMC() <= 24.9)
			return "Peso normal";
		
		else if (obterIMC() >= 25 && obterIMC() <= 29.9) 
			return "Pré-obesidade";
		
		else if (obterIMC() >= 30 && obterIMC() <= 34.9) 
			return "Obesidade Grau I";
		
		else if (obterIMC() >= 35 && obterIMC() <= 39.9) 
			return "Obesidade Grau II";
		
		else 
			return "Obesidade Grau III";
		
	}
	
	public String obterRisco() {
		
		if (obterIMC() < 18.5)
			return "Muito Alto";
		
		else if (obterIMC() >= 18.5 && obterIMC() <= 24.9)
			return "Baixo";
		
		else if (obterIMC() >= 25 && obterIMC() <= 29.9) 
			return "Médio";
		
		else if (obterIMC() >= 30 && obterIMC() <= 34.9) 
			return "Alto";
		
		else if (obterIMC() >= 35 && obterIMC() <= 39.9) 
			return "Muito Alto";
		
		else 
			return "Muitíssimo Alto";
		
	}
}
