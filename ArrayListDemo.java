package Arrays;

import java.util.ArrayList;
import java.util.Collections;

class Class {

}
public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());


       //  ArrayList<Integer> list2 = new ArrayList<Double>();

      ///  ArrayList<> list3  = new ArrayList<Integer>(); 


    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    System.out.println(list.size());

    list.add(1, 5);
    System.out.println(list);


    System.out.println(list.get(1));


    list.remove(1);
    System.out.println(list);

    list.add(1, 5);
    list.add(2, 5);

    list.remove(Integer.valueOf(5));
    System.out.println(list);

    System.out.println("Contains 5: " + list.contains(5));

    Collections.sort(list);


    System.out.println(list);

    ArrayList<Integer> noOdd = new ArrayList<Integer>();
    for(i <=)

    //Challenge 1
    

    for (int i = 0; i < 10; i++){
        int a = (int) ((Math.random()*10)+1);
        if (a != 1 && a!= 3 && a != 5 && a != 7 && a != 9)
        newlist.add(a);
        }
    System.out.println(newlist);
   
    ArrayList<String> guestList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    System.out.println("Who is invited?");
    String line = input.nextLine();
    While (!line.equalsIgnoreCase("exit")){
        guestList.add(line);
        line = input.nextLine();
    }
    System.out.println("who do you want to check for in the guest list?");
    line = input.nextLine();
    while (!line.equalsIgnoreCase("exit")){
        if (guestList.contains(line))
            System.out.println("they are invited");
    }

    }

    public static void lucasolution(){

        ArrayList<String> guestList = new ArrayList<String>();

        String name = "";

        Scanner input = new Scanner(System.in);
        
    }

}
    

