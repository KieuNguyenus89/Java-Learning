package SL_Learning;

public class For_Loop {
    static int firstClass   = 800;
    static int passMark  = 300;

    public static void main(String[] args) throws Exception{

        runAForLoop(100);
        runAReverseForLoop(30);



    }

    // For Loop
    public static void runAForLoop( int theMaxNum){
        for(int i = 1; i <= theMaxNum; i++){
            System.out.println( "The number is " + i);
        }
    }
    public static void runAReverseForLoop( int maxNo) {
        for (int i = maxNo; i > -10; i--) {
            System.out.println("The number is " + i);
        }
    }

}
