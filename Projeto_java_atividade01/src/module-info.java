
module Projeto_java_atividade01 {
}
public class Guitarra{
	private String numeroSerie, fabricante, modelo, tipo, madeira;
	private double preco;
	
	public Guitarra(	
		   String numeroSerie, String fabricante, String modelo,  String tipo, String madeira, double preco) {
		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.numeroSerie = numeroSerie;
		this.madeira = madeira;
		this.preco = preco;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie (String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setfabricante(String fabricate) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModeloe(String Modelo) {
		this.modelo = Modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String Tipo) {
		this.tipo = Tipo;
	}
	public String getMadeira() {
		return madeira;
	}
	public void setMadeira(String Madeira) {
		this.madeira = Madeira;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco (String Preco) {
		this.preco = preco;
	}
	
   public static void main(String)[] args){
	   Guitarra minhaGuitarra = new Guitarra("01020304", "fender", "telecaster", "eletrica", "magno", "1500");
	   System.out.println(minhaGuitarra.getNumeroSerie());
	   System.out.println(minhaGuitarra.getMadeira());
	   System.out.println(minhaGuitarra.getNumeroPreco());
	   System.out.println(minhaGuitarra.getNumerotipo());
   }
	
}













