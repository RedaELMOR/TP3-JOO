package packkTP3;

class Voiture {
    private String marque;
    private double vitesse;

    public Voiture(String marque, double vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void accelerer(double valeur) {
        if (valeur > 0) {
            vitesse += valeur;
            if (vitesse > 240) {
                vitesse = 240;
            }
        }
    }

    public void freiner(double valeur) {
        if (valeur > 0) {
            vitesse -= valeur;
            if (vitesse < 0) {
                vitesse = 0;
            }
        }
    }

    public void afficher() {
        System.out.println("Voiture : " + marque + " , Vitesse : " + vitesse + " km/h");
    }
}

public class EX6 {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("VOLkSWAGEN", 50);

        System.out.println("Etat initial :");
        v1.afficher();

        v1.accelerer(40);
        System.out.println("Apres acceleration :");
        v1.afficher();

        v1.accelerer(200);
        System.out.println("Apres forte acceleration :");
        v1.afficher();

        v1.freiner(60);
        System.out.println("Apres freinage :");
        v1.afficher();

        v1.freiner(300);
        System.out.println("Apres freinage total :");
        v1.afficher();
    }
}