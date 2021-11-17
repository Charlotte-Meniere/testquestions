package Questions;

public class Question implements QuestionsMethodes {
    String Question;
    String Response;

    public Question() {

    }

    @Override
    public String getQuestion() {
        return Question;
    }

    @Override
    public String getResponse() {
        return Response;
    }

    @Override
    public void setQuestion(String ques) {
        this.Question = ques;
    }

    @Override
    public void setResponse(String res) {
        this.Response = res;
    }

    @Override
    public void Affichage() {
        System.out.println(this.getQuestion());
    }
}
