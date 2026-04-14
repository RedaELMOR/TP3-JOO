package packkTP3;
class NombreComplexe {
    private double reel;
    private double imaginaire;
    
    public NombreComplexe(double reel, double imaginaire) {
    	this.reel = reel;
    	this.imaginaire=imaginaire;
    }
    
    public NombreComplexe Addition(NombreComplexe c) {
    	double a = this.reel + c.reel;
    	double b = this.imaginaire + c.imaginaire;
    	return new NombreComplexe(a,b);
    }
    
    public NombreComplexe Multiplication(NombreComplexe c) {
    	double a = this.reel * c.reel - this.imaginaire * c.imaginaire;
    	double b = this.reel * c.imaginaire + this.imaginaire * c.reel;

    	return new NombreComplexe(a, b);
    	}
    
    public void afficher() {
    	System.out.println(reel+"+"+imaginaire+"i");
    			
    	
    }
    
}

public class EX4 {
    public static void main(String[] args) {

        NombreComplexe c1 = new NombreComplexe(2, 3);
        NombreComplexe c2 = new NombreComplexe(1, 4);

        System.out.println("Nombre 1 :");
        c1.afficher();

        System.out.println("Nombre 2 :");
        c2.afficher();

        NombreComplexe somme = c1.Addition(c2);
        System.out.println("Addition :");
        somme.afficher();
        NombreComplexe produit = c1.Multiplication(c2);
        System.out.println("Multiplication :");
        produit.afficher();
    }
}