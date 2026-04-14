package packkTP3;

class Rectangle {
	private double Largeur;
	private double Hauteur;
	
	public Rectangle(double Largeur, double Hauteur) {
		this.Largeur = Largeur;
		this.Hauteur = Hauteur;
	}
	
	public double Surface() {
		return Hauteur*Largeur;
	}
	
	public double Perimetre() {
	
		return 2*(Largeur + Hauteur);
	
}
}
	
public class EX2 {
	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle(5,3);
		System.out.println("Le perimetre du rectangle 1 :"+R1.Perimetre());
		System.out.println("Le surface du rectangle 1 :"+R1.Surface());
		
		
	}
		
	}

