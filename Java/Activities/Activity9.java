package activities;

import java.util.ArrayList;

public class Activity9
{
    public static void main (String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add(3 , "Grapes");
        myList.add("pineapple");

        System.out.println("List of fruits : " +myList);
        for (String s : myList)
        {
            System.out.println(s);
        };
        System.out.println("Third fruit is : " +myList.get(3));
        System.out.println("Check Apple in the list : " +myList.contains("Apple"));
        System.out.println("Number of fruits available : " +myList.size() );
        System.out.println("Remove Mango from the list : " +myList.remove("Mango"));
        System.out.println("Number of fruits available : " +myList.size() );
    }
}
