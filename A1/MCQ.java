public class MCQ implements Question{

    String[][] questions = new String[10][6]; 
    int score = 0; 

    @Override 
    public void createQuestion(){

        int index = 0; 

        questions[index][0] = "How many sides does a hexagon have?"; 
        questions[index][1] = "4"; 
        questions[index][2] = "5"; 
        questions[index][3] = "6"; 
        questions[index][4] = "7"; 
        questions[index++][5] = "3"; 

        questions[index][0] = "What is California's state animal"; 
        questions[index][1] = "Brown Bear"; 
        questions[index][2] = "Black Bear"; 
        questions[index][3] = "Grizzly Bear"; 
        questions[index][4] = "Polar Bear"; 
        questions[index++][5] = "3"; 

        questions[index][0] = "What is California's state capitol"; 
        questions[index][1] = "Sacramento"; 
        questions[index][2] = "Los Angeles"; 
        questions[index][3] = "San Francisco"; 
        questions[index][4] = "San Diego"; 
        questions[index++][5] = "1"; 

        questions[index][0] = "What is the capitol of the United States"; 
        questions[index][1] = "Washington"; 
        questions[index][2] = "Washington D.C."; 
        questions[index][3] = "New York City"; 
        questions[index][4] = "Los Angeles"; 
        questions[index++][5] = "2"; 

        questions[index][0] = "What does AI stand for?"; 
        questions[index][1] = "Artificial Instinct"; 
        questions[index][2] = "Animal Intelligence"; 
        questions[index][3] = "Any Igloo"; 
        questions[index][4] = "Artificial Intelligence"; 
        questions[index++][5] = "4"; 

        questions[index][0] = "Who is the CEO of Amazon?"; 
        questions[index][1] = "Bill Gates"; 
        questions[index][2] = "Jeff Bezos"; 
        questions[index][3] = "Elon Musk"; 
        questions[index][4] = "Tim Cook"; 
        questions[index++][5] = "2"; 

        questions[index][0] = "What vowel comes after e"; 
        questions[index][1] = "a"; 
        questions[index][2] = "i"; 
        questions[index][3] = "o"; 
        questions[index][4] = "u"; 
        questions[index++][5] = "2"; 

        questions[index][0] = "How many letters are in the alphabet?"; 
        questions[index][1] = "24"; 
        questions[index][2] = "25"; 
        questions[index][3] = "26"; 
        questions[index][4] = "27"; 
        questions[index++][5] = "3"; 

        questions[index][0] = "What are the primary colors?"; 
        questions[index][1] = "Red, Yellow, Blue"; 
        questions[index][2] = "Red, Green, Blue"; 
        questions[index][3] = "Red, Orange, Blue"; 
        questions[index][4] = "Red, Yellow, Indigo"; 
        questions[index++][5] = "1"; 

        questions[index][0] = "Who is the professor of this class? "; 
        questions[index][1] = "Rahul Talari"; 
        questions[index][2] = "Adam Summerville"; 
        questions[index][3] = "Hao Ji"; 
        questions[index][4] = "Yu Sun"; 
        questions[index++][5] = "4"; 
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
