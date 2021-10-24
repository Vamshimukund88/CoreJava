package methods;

public class Example5 {
    //Instance Variables
    int x =  10;
    int y = 20;
    void add(int x, int y)
    {
        System.out.println(x+y);
        System.out.println(this.x+this.y); // this keyword will call instance variables.
    }
    public static void main(String[] args)
    {
        Example5 E5 = new Example5();
        E5.add(1000,2000 );
        System.out.println("Vamshi"+"Mukund"); // appending both strings using "+" operator
        System.out.println(10+20+"Addition"); //adding and appending numerics and string
    }
}



