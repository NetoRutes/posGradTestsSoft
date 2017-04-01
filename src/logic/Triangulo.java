package logic;

public class Triangulo {
	private Boolean valido;
	
	public Triangulo(Boolean valido){
		this.valido = valido;
	}
	
	private Boolean isValid(){
		if(valido){
			return true;
		}else return false;
	}
	
	public Boolean getValido(){
		return this.valido;
	}
}
