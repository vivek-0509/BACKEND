package QuizConsole;
import java.util.*;
public class QuestionService{
   
    Question [] questions=new Question[4];
    String selection[]=new String[4];

   public QuestionService(){
    questions[0]=new Question(1,"What","Java","Pyhton","C++","flask","Java");
    questions[1]=new Question(2,"What","Java","Pyhton","C++","flask","flask");
    questions[2]=new Question(3,"What","Java","Pyhton","C++","flask","Python");
    questions[3]=new Question(4,"What","Java","Pyhton","C++","flask","C++");
   }
   
   public void playquiz(){
      int i=0;
     for(Question q : questions){
        System.out.println("Question no.: "+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc=new Scanner(System.in);
        selection[i]=sc.nextLine();
        i++;
     }
   }
   
   int score=0;
   public void printScore(){
      for(int i=0;i<selection.length;i++){
         if(selection[i].equals(questions[i].getAnswer())){
            score++;
         }
      }

      System.out.println(score);
   }

  
}