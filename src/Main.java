import Questions.QCM;
import Questions.RC;
import Questions.VF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Premier QCM
            QCM qcm1 = new QCM();
            qcm1.setQuestion("Comment je m'appel ?");
            qcm1.setChoix1("Titouan (un prénom de merde)");
            qcm1.setChoix2("Henry");
            qcm1.setChoix3("Diego");
            qcm1.setResponse("Bien joué grosse merde");
            qcm1.Affichage();
            qcm1.AffichageChoix();

            int resQCM = Integer.parseInt(br.readLine());
            if(resQCM == 3) {
                System.out.println(qcm1.getResponse());
            }

            // Premier VF
//            VF vf1 = new VF();
//            vf1.setQuestion("Je suis con ?");
//            vf1.Affichage();
//            String resVF = br.readLine();
//            vf1.isTrue(resVF);

            RC rc1 = new RC();
            rc1.questionRC();
        } catch (IOException e) {
            System.out.println("He ben gros con");
        }
    }
    }

