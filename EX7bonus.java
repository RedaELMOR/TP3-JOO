package packkTP3;

import java.util.Random;
import java.util.Scanner;

public class EX7bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int nombreSecret = rd.nextInt(10) + 1;
        int tentative;
        int nbTentatives = 0;
        int score;

        do {
            System.out.print("Deviner un nombre entre 1 et 10 : ");
            tentative = sc.nextInt();
            nbTentatives++;

            if (tentative < nombreSecret) {
                System.out.println("Plus grand");
            } else if (tentative > nombreSecret) {
                System.out.println("Plus petit");
            } else {
                System.out.println("Bravo !");
            }

        } while (tentative != nombreSecret);

        score = 11 - nbTentatives;
        if (score < 0) {
            score = 0;
        }

        System.out.println("Nombre de tentatives : " + nbTentatives);
        System.out.println("Score : " + score);
    }
}