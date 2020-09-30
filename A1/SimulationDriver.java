public class SimulationDriver {
    public static void main(String [] args){
        System.out.println("Welcome to iVote Simulator");
        VotingService vs = new VotingService(); 
        Student andrew = new Student("001"); 
        Student brandon = new Student("002");
        Student chris = new Student("003"); 
        Student derek = new Student("004"); 
        Student eric = new Student("005");
        Student george = new Student("006"); 
        Student henry = new Student("007"); 
        Student isaac = new Student("008"); 
        Student jay = new Student("009"); 
        Student kota = new Student("010");
        Student[] students = new Student[]{andrew,brandon,chris,derek,eric,george,henry,isaac,jay,kota};  
        vs.runQuestions(students);
    }
}
