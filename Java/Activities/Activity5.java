package activities;

public class Activity5
{
    public static void main(String[] args)
    {
        String s = "Harry Potter";
        MyBook newbook = new MyBook();
        newbook.setTitle(s);
        System.out.println("The title is: " + newbook.getTitle());
    }
}
