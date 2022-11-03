package SL_Learning;

public class Looping {

    public static void main(String[] args) throws Exception{

        runAForLoop(100);
        whileLoopExam();


    }

    // For Loop
    public static void runAForLoop( int theMaxNum){
        for(int i = 1; i <= theMaxNum; i++){
            System.out.println( "The number is " + i);
        }
    }
    // While Loop
    public static void whileLoopExam(){
        int a =50;
        while (a>0){
            System.out.println( "The number is " + a);
            a--;
        }

    }
}
