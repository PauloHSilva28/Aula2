package aula2;

public class Pc {
	public String modelo;
	public String Processador;
	public int Portas_USB;
	public int Armazenamento;
	
	public void ligar() {
		System.out.println("O Pc " + modelo + " ligou");
	}
	
	public void verificar_componentes() {
		System.out.println("O processador " + Processador + " está funcionado corretamente!");
	}
	public void GetPc () {
		System.out.println("Modelo: " + modelo 
							+"\nProcessador: " + Processador 
							+"\nPortas USB: " + Portas_USB 
							+"\nArmazenamento: " + Armazenamento);
	}
	

		

}
