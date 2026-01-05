package QUIZ_CONSOLE_APP;

public class Main {
    public static void main(String[]args){
        QuestionService service = new QuestionService();
        service.PlayQuiz();
        service.printScore();
    }
}
