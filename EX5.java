package packkTP3;

class CompteBancaire{
	
	private String numero;
	private double solde;
	
	public CompteBancaire(String numero , double solde) {
		this.numero = numero;
		this.solde = solde;
		
	}
	
	public void Deposer(double montant) {
		solde += montant ;
		
	}

	public void Retirer(double montant) {
		if (montant > 0 && montant <= solde) {
			
			solde -= montant;
		}}
		
	public void transferer(CompteBancaire c , double montant) {
		if (montant > 0 && montant <= solde) {
			this.solde -=montant;
			c.solde +=montant;
			
		}}
	public void afficherSolde() {
		System.out.println("compte : N" + numero + " solde : "+solde);
		
	}
	



}

public class EX5 {
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire("C001", 1000);
        CompteBancaire c2 = new CompteBancaire("C002", 500);

        System.out.println("Soldes initiaux :");
        c1.afficherSolde();
        c2.afficherSolde();

        c1.Deposer(200);
        System.out.println("Après dépôt dans C001 :");
        c1.afficherSolde();

        c1.Retirer(150);
        System.out.println("Après retrait de C001 :");
        c1.afficherSolde();

        c1.transferer(c2, 300);
        System.out.println("Après transfert de C001 vers C002 :");
        c1.afficherSolde();
        c2.afficherSolde();
    }
}
