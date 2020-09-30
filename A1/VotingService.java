import java.lang.Math

public class VotingService {
    public static void main(String [] args){

    }

    int questionCount; 

    public void createQuiz(Student[] students){
        int rand = (int)(Math.random()*10); 
        for(int index = 0; count < rand; ++index)
            System.out.println(students[9-index]);

        SCQ sc = new SCQ(); 
        sc.createQuestion();
        MCQ mc = new MCQ(); 
        mc.createQuestion(); 

        String finalQuestions = new String[10]; 
        String[] questionType = new String[10]; 
        for(int index = 0; index < 10; ++index){
            if((int)(Math.random()*1) == 1){
                rand = (int)(Math.random()*10); 
                finalQuestions[index] = sc.questions[rand]; 
                questionType[index] = "SCQ"; 
            }
            else {
                rand = (int)(Math.random()*10); 
                finalQuestions[index] = mc.questions[rand]; 
                questionType[index] = "MCQ"; 
            }
        }

        runQuestions(finalQuestions, questionType, students);
    }
    
    public void runQuestions(String[] question, String[]type, Student[] students){
        for (int i = 0; i < 10; ++i){
            int correct = (int)(Math.random()*4)
        
        }
        System.out.println("---------------------------------------");
        System.out.println("Question: " + questionCount++);
        System.out.println("Choose answer(s): ");
        System.out.println("A: " + question[1]); 
        System.out.println("B: " + question[2]); 
        System.out.println("C: " + question[3]); 
        System.out.println("D: " + question[4]); 
        System.out.println("---------------------------------------");
        
    }
}
