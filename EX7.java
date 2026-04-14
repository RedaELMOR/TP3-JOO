package packkTP3;

class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void appliquerRemise(double pourcentage) {
        if (pourcentage > 0 && pourcentage <= 100) {
            prix = prix - (prix * pourcentage / 100);
        }
    }

    public void afficher() {
        System.out.println("Produit : " + nom + "  Prix : " + prix);
    }
}

public class EX7 {
    public static void main(String[] args) {

        Produit p1 = new Produit("PC", 10000);
        Produit p2 = new Produit("Telephone", 5000);

        System.out.println("Produits initiaux :");
        p1.afficher();
        p2.afficher();

        p1.appliquerRemise(10);
        System.out.println("Apres remise sur PC :");
        p1.afficher();

        p2.appliquerRemise(20);
        System.out.println("Apres remise sur Telephone :");
        p2.afficher();
    }
}