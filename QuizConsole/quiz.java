package QuizConsole;
import java.util.*;
public class quiz{

    
    public static void main(String[] args){
        QuestionService  dis= new QuestionService();

        dis.playquiz();
        dis.printScore();
    }
}