package SL_Learning;

public class variable_Learning {
    int roll  = 10;
    String bookName;
    public variable_Learning (){
        System.out.println(" This is Constructor");
        this.bookName = " Let us c";

    }

    public static void main(String[] args) {
        variable_Learning Obj = new variable_Learning ();

        System.out.println(addition_number(20, 30, 20));
        System.out.println(FullName("Kieu", "Nguyen"));
        System.out.println("The engineering c book name is: " + Obj.bookName);





    }
    public  void addition() {
        System.out.println(roll);
        int em = 12345;
        System.out.println(em);

    }
    public void subs() {
        System.out.println(roll);


    }
    public static int addition_number (int a, int b, int c) {
        return a+b+c;
    }

    public static String FullName (String FN, String LN) {
        return FN + " " + LN;
    }
}

