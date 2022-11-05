package java_basic;

public class Learn_Array {
    public static void main(String[] args)throws Exception{
        LearnIntTypeArray();
        LearnStringTypeArray();


        }


   public static void LearnIntTypeArray() {


       //How to do Array declaration
       //int num[]  = {10,20,30,40,50,60,70,80,90}
       int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90};
       // 10 == 0 position, 20 = 1st position ....90 it is in 8th position ....
       // How to get lent of the array
       int arrayLenth = num.length;
       System.out.println(arrayLenth);
       for (int i = 0; i < arrayLenth; i++) {
           System.out.println(i);
           System.out.println(num[i]);
       }
   }
        public static void LearnStringTypeArray(){

            String bankName[]  = new String[8];


            //Array initialization...

            bankName[0] = " IPMC Bank";
            bankName[1] = " SBI Bank";
            bankName[2] = " PNB Bank";
            bankName[3] = " HSBC Bank";
            bankName[4] = " MCkl Bank";
            bankName[5] = " IPUIO Bank";
            bankName[6] = " IPMCK Bank";
            bankName[7] = " IPMCL Bank";

            for (int a= 0; a < bankName.length; a++){
                System.out.println(bankName[a]);
            }
        }
    }


