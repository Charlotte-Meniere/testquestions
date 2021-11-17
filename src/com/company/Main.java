package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //texte de présentation
        System.out.println("Yo les Narvalots ");
        System.out.println("Ci-joint notre quizz du tonerre");
        System.out.println("Appuyez sur 'Entrée' pour démarrer, et entrez les réponse dans le terminal.");

        // saut de ligne
        String entree = sc.nextLine();

        //1ére question
        System.out.println("Bon courage !");

        System.out.println("Question #1: combien font 1+1 pour Jean Claude Van Dam ?");

        // champs a compléter pour la reponse
        int answerCalcul = sc.nextInt();
//bonne réponse
        if (answerCalcul == 11) {
            System.out.println("Effectivement, la réponse est bien 11 !");
            System.out.println("Prochaine question, #2. ");
        }
        //mauvaise reponse
        //passe a la question 2
        else {
            System.out.println("Malheureusement pour vous, ce n'était pas la bonne réponse. ");
            System.out.println("Question #2.");
        }
// debut question 2
        System.out.println("En quelle année seront nous diplomés de B3 ? ( 4 chiffres )");
        // champs a compléter pour la reponse
        int answerDiplome = sc.nextInt();
        // bonne réponse
        if (answerDiplome == 2022) {
            System.out.println("Oui, nous serons bien diplomés en 2022 !");
            System.out.println("Question #3.");
            //Mauvaise réponse
        } else {
            System.out.println("Non, nous ne seront pas diplomés en " + answerDiplome + ", mais bien en 2022 !");
            System.out.println("Question #3.");
        }
    // champs a compléter
        sc.nextLine();
        // question
        System.out.println("Quel est le surnom de Titouan (n'oubliez pas la majuscule)");
        String surnameAnswer = sc.nextLine();

        if (surnameAnswer.equals("Titou") || surnameAnswer.equals("Narvalot") || surnameAnswer.equals("Chef") ) {
            System.out.println("Oui, d'autres réponses étaient acceptés!");
            System.out.println("Merci d'avoir joué");
        }
    }
}
