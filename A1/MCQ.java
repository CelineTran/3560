import java.util.Random 

public class MCQ implements Question{

    String[][] questions = new String[10][6]; 
    int score = 0; 

    @Override 
    public void createQuestion(){

        int index = 0; 

        questions[index][0] = "Which are prime numbers?"; 
        questions[index][1] = "4"; 
        questions[index][2] = "5"; 
        questions[index][3] = "6"; 
        questions[index][4] = "7"; 
        questions[index++][5] = "2 4"; 

        questions[index][0] = "Which is not a city in Orange County?"; 
        questions[index][1] = "Anaheim"; 
        questions[index][2] = "La Habra Heights"; 
        questions[index][3] = "Pomona"; 
        questions[index][4] = "Tustin"; 
        questions[index++][5] = "2 3"; 

        questions[index][0] = "Which are cities in California"; 
        questions[index][1] = "Sacramento"; 
        questions[index][2] = "Los Angeles"; 
        questions[index][3] = "San Francisco"; 
        questions[index][4] = "San Diego"; 
        questions[index++][5] = "1 2 3 4"; 

        questions[index][0] = "Which are not U.S Cities?"; 
        questions[index][1] = "Washington"; 
        questions[index][2] = "Washington D.C."; 
        questions[index][3] = "New York"; 
        questions[index][4] = "Los Angeles"; 
        questions[index++][5] = "1 3"; 

        questions[index][0] = "Which are not U.S. States"; 
        questions[index][1] = "Alaska"; 
        questions[index][2] = "Dominican Republican"; 
        questions[index][3] = "Bahamas"; 
        questions[index][4] = "New York"; 
        questions[index++][5] = "2 3"; 

        questions[index][0] = "Who are CEOs?"; 
        questions[index][1] = "Bill Gates"; 
        questions[index][2] = "Jeff Bezos"; 
        questions[index][3] = "Elon Musk"; 
        questions[index][4] = "Tim Cook"; 
        questions[index++][5] = "1 2 3 4"; 

        questions[index][0] = "Which vowels comes after e"; 
        questions[index][1] = "a"; 
        questions[index][2] = "i"; 
        questions[index][3] = "o"; 
        questions[index][4] = "u"; 
        questions[index++][5] = "2 3 4"; 

        questions[index][0] = "Who was a U.S. President"; 
        questions[index][1] = "Richard Nixon"; 
        questions[index][2] = "John Mccain"; 
        questions[index][3] = "Donald Trump"; 
        questions[index][4] = "Kanye West"; 
        questions[index++][5] = "1 3"; 

        questions[index][0] = "Which are primary colors"; 
        questions[index][1] = "Red"; 
        questions[index][2] = "Green"; 
        questions[index][3] = "Blue"; 
        questions[index][4] = "Yellow"; 
        questions[index++][5] = "1 3 4 "; 

        questions[index][0] = "Who is a professor at CPP? "; 
        questions[index][1] = "Albert Einstein"; 
        questions[index][2] = "Adam Summerville"; 
        questions[index][3] = "Hao Ji"; 
        questions[index][4] = "Yu Sun"; 
        questions[index++][5] = "2 3 4"; 
    }

    @Override
    public String[][] generateQuestions() {
        Random rand = new Random(); 
        for (int index = 0; index < questions.length-1; ++index){
            String[] tempArr = questions[index]; 
            int tempInt = rand.nextInt((questions.length-1) - index) + index;
            questions[index] = questions[tempInt];
            questions[tempInt] = tempArr;  
        }

        String[][] finalQuestions = new String[5][]; 
        for(int index = 0; index < 5; ++index)
            finalQuestions[i] = questions[i]; 
    
    }

    @Override
    public void getScore(){

    }
}
