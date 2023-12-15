package activities;

import java.util.HashMap;

public class Activity11
{
    public static void main (String[] args)
    {
        HashMap<Integer, String> colour = new HashMap<Integer, String>();
        colour.put(1, "Red");
        colour.put(2, "Green");
        colour.put(3, "Yellow");
        colour.put(4, "Purple");
        colour.put(5, "Orange");

        System.out.println("List of Colours : " +colour);
        System.out.println("Remove Yellow colour from the list : " +colour.remove(3));
        System.out.println("List of Colours : " +colour);

        if (colour.containsValue("Green"))
        {
            System.out.println("Green Colour is available in the List");
        }
        else
        {
            System.out.println("Green Colour is not available in the List");
        }
        System.out.println("Total number of colours in the list : " +colour.size());
    }
}
