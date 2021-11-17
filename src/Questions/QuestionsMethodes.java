package Questions;

public interface QuestionsMethodes {
    // Setter
    abstract String getQuestion();
    abstract String getResponse();

    // Getter
    abstract void setQuestion(String ques);
    abstract void setResponse(String res);

    // Affichage
    abstract void Affichage();
}
