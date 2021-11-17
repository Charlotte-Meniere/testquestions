package Questions;

public class VF extends Question {
    public VF() { super();}

    public void isTrue(String resVF) {
        if(resVF == "v") {

            this.setResponse("Bien joué à toi grosse merde");
            System.out.println(this.getResponse());
        } else if (resVF == "f"){
            this.setResponse("Dios mio...tu est sacrément nul");
            System.out.println(this.getResponse());
        }
    }
}
