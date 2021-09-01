package inheritance;

public class Example4Instanceblock {
    {
        System.out.println("Parent class Instance block");
    }
}
class Example4Instanceblockchild extends  Example4Instanceblock {
    {
        System.out.println("child class Instance block");
    }
    public static void main(String[] args)
    {
        new Example4Instanceblockchild();
    }
}
