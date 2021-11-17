package Questions;

public class QCM extends Question {
    String choix1;
    String choix2;
    String choix3;

    public QCM() {
        super();
    }

    // Getter
    public String getChoix1() {
        return this.choix1;
    }
    public String getChoix2() {
        return this.choix2;
    }
    public String getChoix3() {
        return this.choix3;
    }

    // Setter
    public void setChoix1(String c1) {
        this.choix1 = c1;
    }
    public void setChoix2(String c2) {
        this.choix2 = c2;
    }
    public void setChoix3(String c3) {
        this.choix3 = c3;
    }

    // Affichage des choix
    public void AffichageChoix() {
        System.out.println("Choix 1 " + getChoix1());
        System.out.println("Choix 2 " + getChoix2());
        System.out.println("Choix 3 " + getChoix3());
    }
}
