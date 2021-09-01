package flowstatements;

public class ConditionStatements {
    // Condition statements using if,ifelse,Switch
    static int i = 10;

    public static void main(String[] args) {
        // if else example
     /*   if (i < 50) {
            System.out.println(i);
        } else
            System.out.println("Not less");
    } */
        switch (i) {
            case 1:
                System.out.println("value is 1");

                break;
            case 10:
                System.out.println("value is 10");

                break;
            default:
                System.out.println("Invalid Data");
        }
    }
}
