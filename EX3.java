package packkTP3;


class Etudiant{
	private double note;
	private String cne;
	
	public Etudiant(String cne , double note) {
		this.cne = cne ;
		this.note = note;
		
	}
	
 @Override
    public String toString() {
        return "Etudiant [CNE=" + cne + ", Note=" + String.valueOf(note) + "]";
    }
	
	public String estAdmis() {
	    return (note >= 10) ? "Admis" : "Non admis";
	}

}

public class EX3 {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("CNE123", 14.5);
		System.out.println("Etudiant 1:");
        System.out.println(e1);
        System.out.println("Admission : " + e1.estAdmis());
		
	}
	

}
