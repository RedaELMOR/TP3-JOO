package packkTP3;

import java.util.ArrayList;

class Produit {

    private int id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    public Produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public static void ajouterProd(ArrayList<Produit> liste, Produit p) {
        liste.add(p);
    }

    public void modifierProd(String nom, String description, double prix, int quantite) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public static void supprimerProd(ArrayList<Produit> liste, int id) {
        for (Produit p : liste) {
            if (p.id == id) {
                liste.remove(p);
                break;
            }
        }
    }

    public static Produit getProduitByID(ArrayList<Produit> liste, int id) {
        for (Produit p : liste) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    public void afficher() {
        System.out.println("ID: " + id +
                ", Nom: " + nom +
                ", Desc: " + description +
                ", Prix: " + prix +
                ", Quantité: " + quantite);
    }
}
public class EX7 {
    public static void main(String[] args) {

        ArrayList<Produit> liste = new ArrayList<>();

        Produit p1 = new Produit(1, "PC", "Gaming", 8000, 5);
        Produit p2 = new Produit(2, "Souris", "RGB", 200, 10);

        Produit.ajouterProd(liste, p1);
        Produit.ajouterProd(liste, p2);

        for (Produit p : liste) {
            p.afficher();
        }
        p1.modifierProd("PC", "Gaming RTX", 9000, 3);
        Produit p = Produit.getProduitByID(liste, 1);
        if (p != null) p.afficher();

        Produit.supprimerProd(liste, 2);
    }
}
