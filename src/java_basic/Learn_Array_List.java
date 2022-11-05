package java_basic;

import java.util.ArrayList;

public class Learn_Array_List {
    public static void main(String[] args)throws Exception{
        LearnArrayList();

    }
    public static void LearnArrayList(){
        ArrayList<String> obj = new ArrayList<>();
        ArrayList<Integer> obj1 = new ArrayList<>();

        obj.add("University");
        obj.add("Certificates");
        obj.add("Alumni");
        obj.add("StatusMasterclasses");
        obj.add("UniversityCareer");
        obj.add("UniversityCareer2011");

        // How to display ArrayList data?
        System.out.println(obj);

        // to add some data in an ArrayList
        obj.add(3,"Learning Java");
        System.out.println(obj);

        // to remove some data in an ArrayList
        obj.remove(3);
        System.out.println(obj);
        System.out.println(obj.size());

        // Iterating ArrayList
        for (String str:obj) {
            System.out.println(str);
            if(str.equalsIgnoreCase("Certificates")){
                break;
            }
        }



        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        obj1.add(50);
        obj1.add(60);
        obj1.add(70);



        // How to display ArrayList data?
        System.out.println(obj1);

        // to add some data in an ArrayList
        obj1.add(4,111);
        System.out.println(obj1);

        // to remove some data in an ArrayList
        obj1.remove(4);
        System.out.println(obj1);
        System.out.println(obj1.size());





    }
}
