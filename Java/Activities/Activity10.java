package activities;

import java.util.HashSet;

public class Activity10
{
    public static void main (String[] args ) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("K");
        hs.add("M");
        hs.add("B");
        hs.add("Y");
        hs.add("O");
        System.out.println("List of values : " + hs);
        System.out.println("Size of the Hashset : " + hs.size());
        System.out.println("Remove Y in the Set : " + hs.remove("Y"));

        if (hs.remove("L"))
        {
            System.out.println("L is present in the set and removed");

        }
        else
        {
            System.out.println("L is not present in the set");

        }
        System.out.println("Letter M is present in the Set : " +hs.contains("M"));
        System.out.println("Updated Hashset: " + hs);
    }
}
