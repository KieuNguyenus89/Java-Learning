package java_basic;

public class Learn_Custom_Throw_Exception {
    public static void  main (String args[]){
        Learn_Custom_Throw_Exception obj = new Learn_Custom_Throw_Exception();
        obj.DelhiPublicSchoolAdmission(9);

    }

    public void DelhiPublicSchoolAdmission(int StudentAge){
        if( StudentAge > 10) {
            throw new ArithmeticException("Sorry your kid is not eligible for the Admission");
        }
            if (StudentAge < 10) {
                System.out.println("welcome to DelhiPublicSchoolAdmission");
            }
        }

    }

