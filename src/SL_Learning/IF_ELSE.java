package SL_Learning;

public class IF_ELSE {
    //FirsLearn IF-ELSE bock....
   static int firstClass   = 800;
   static int passMark  = 300;


    public static void main(String[] args) throws Exception{
        testStudent_Grade(301);



    }

    public static void testStudent_Grade(int StudentMarks){
        if (StudentMarks >= firstClass){
            System.out.println( "Congrats: You got first class");

        }
        else if (StudentMarks < firstClass && StudentMarks > passMark){
            System.out.println( "Congrats: You got second class");
        }
        else{
            System.out.println( "Sorry you are fail in this exam");
        }


    }


}
