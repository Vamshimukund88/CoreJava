package assignments;
/*
Create 2 instance variables
create two static methods
call these methods and variables in main method
 */
public class AssignStaticInstanceMethds {
    int x = 10;
    int y = 20;
    public static void main(String[] args)
    {
        // Printing variables from main methods
        AssignStaticInstanceMethds ASI3 = new AssignStaticInstanceMethds();
        System.out.println("Printing variables using main method " +ASI3.x);
        System.out.println("Printing variables using main method  "+ASI3.y);
        // Printing variables from methods
      m1();
      m2();
    }
    public static void m1()
    {
        AssignStaticInstanceMethds ASI = new AssignStaticInstanceMethds();
        System.out.println(" Printing variables using method m1 "+ ASI.x);
    }
    public static void m2()
    {
        AssignStaticInstanceMethds ASI2 = new AssignStaticInstanceMethds();
        System.out.println("Printing variables using method m2" + ASI2.y);
    }
}
