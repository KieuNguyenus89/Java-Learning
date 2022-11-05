package java_basic;

public class Learn_Encapsulation {
    private int SSN;
    private String empName;
    private int empAge;
    private int bonus;


       public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public int getBonus(){
           int BNS = 0;
           if(SSN == 23456){
               BNS = 100;
           }
           if(SSN == 234567) {
               BNS = 80;
           }
           return BNS;
    }

    public static void main(String[] args) throws Exception{

        Learn_Encapsulation Obj = new Learn_Encapsulation();
        Obj.setEmpAge(35);
        Obj.setEmpName("John");
        Obj.setSSN(234567);
        System.out.println("Emp Name is : "+ Obj.getEmpName());
        System.out.println("Emp Age is  : "+ Obj.getEmpAge());
        System.out.println("Emp SSN is  : "+ Obj.getSSN());
        System.out.println("Emp Bonus is: "+ Obj.getBonus() + "%");

    }
}
