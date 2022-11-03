package SL_Learning;

public class method_overloading {
    public static void main(String args[]) throws Exception{
        method_overloading Obj = new method_overloading();
        Obj.Addition(10,20);
        Obj.Addition(10,20,30);

    }
    public void Addition(int a, int b){

        int add = a + b;
        System.out.println(add);


    }
   public void Addition(int a, int b, int c){
       int add = a + b +c;
       System.out.println(add);

   }
}
