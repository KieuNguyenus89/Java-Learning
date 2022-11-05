package java_basic;

public class LearnExceptionHandling_1 {
    public String applicationURL = "Https";

    public static void main(String args[]) {
        LearnExceptionHandling_1 obj = new LearnExceptionHandling_1();
        obj.doSomeOperations();

    }

    public void doSomeOperations() {
        try {
            int a = 100 / 0;
        } catch (Exception e) {
            System.out.println("there is some error with a");
        }
        finally {
            System.out.println("here i am closing");
        }
        System.out.println(applicationURL.length());

        System.out.println("This is my next test scripts validation/ Development of Application...");

}
    public void doGoogleHomePageHeaderValidation() {
        try {


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("abc");
        }
    }
}
