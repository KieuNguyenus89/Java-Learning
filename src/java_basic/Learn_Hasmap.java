package java_basic;

import java.util.HashMap;

public class Learn_Hasmap {

    public static void main(String args[]) throws Exception{
        Learn_Hasmap obj = new Learn_Hasmap();
        obj.implementHasmap();

    }
    public void implementHasmap(){
        HashMap<Integer, String> HM = new HashMap<Integer, String>();
        HM.put(1,"Peter");
        HM.put(2,"John");
        HM.put(3,"Mary");
        HM.put(4,"Tom");
        HM.put(5,"Jesica");
        HM.put(6,"Linda");
        System.out.println(HM.get(2));
        System.out.println(HM);
        HM.remove(6);
        System.out.println(HM);

        // How to iterate Hasmap
        for(int i:HM.keySet()){
            System.out.println("when key value is " + i + " " + "then its corresponding value is: " + HM.get(i));
        }
    }

}
