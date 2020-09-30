public class VotingService {
    public static void main(String [] args){

    }

    int questionCount; 

    public void submission(Student student){

    }
    
    public void runQuestions(String[] question){
        System.out.println("---------------------------------------");
        System.out.println("Quesion: " + questionCount++);
        System.out.println("Choose answer(s): ");
        System.out.println("A: " + question[1]); 
        System.out.println("B: " + question[2]); 
        System.out.println("C: " + question[3]); 
        System.out.println("D: " + question[4]); 
        System.out.println("---------------------------------------");
        
    }
}
