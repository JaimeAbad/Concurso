package ruben;


public class Ficha {

	private String color;
	
	Ficha(String color){
		this.color=color;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public boolean equals (Object obj) {
		boolean resultado=false;
		if(obj instanceof Ficha && color.equals(((Ficha)obj).color))
				resultado=true;
		return resultado;
	}
	
	
}
