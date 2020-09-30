
public class Student (){

    private String Uid; 
    private int score; 

    public Student(String id){
        this.Uid = id; 
        score = 0; 
    }

    public String getId(){return Uid;}
    public void addScore(){score++;}
    public int getScore(){return score;}
    public void setId(String id){this.id = id;}
}