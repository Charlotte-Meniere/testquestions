package Reponses;

import java.util.ArrayList;

public class Responses implements ReponsesMethodes {

    // Instanciation de resQCM + Getter + Setter
    ArrayList<String> resQCM = new ArrayList<>();
    @Override
    public String getResQCM(int index) {
        return resQCM.get(index);
    }
    @Override
    public void setResQCM(String res) {
        resQCM.add(res);
    }

    // Instanciation de resVF + Getter + Setter
    ArrayList<String> resVF = new ArrayList<>();
    @Override
    public String getResVF(int index) {
        return resVF.get(index);
    }
    @Override
    public void setResVF(String res) {
        resVF.add(res);
    }

    // Instanciation de resRC + Getter + Setter
    ArrayList<String> resRC = new ArrayList<>();
    @Override
    public String getResRC(int index) {
        return resRC.get(index);
    }
    @Override
    public void setResRC(String res) {
        resRC.add(res);
    }

    // Affichage de la réponse
    public void Affichage(String name, int i) {
        switch (name) {
            case "getResQCM": {
                System.out.println(this.getResQCM(i));
                break;
            }
            case "getResVF": {
                System.out.println(this.getResVF(i));
                break;
            }
            case "getResRC": {
                System.out.println(this.getResRC(i));
                break;
            }
        }
    }
}
