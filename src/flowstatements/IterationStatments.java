package flowstatements;

public class IterationStatments {
// Iteration Statements : for, while, do-while,
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        // while code
        while(i<10)
        {
            System.out.println("Value is : "+i);
            i++;
        }
        //do-whie
        do
            {
                System.out.println("Printing values for do-while statement : "+j);
                j++;
            }while(j<10);
        // for statement
        for(int k=0; k<10;k++)
        {
            if(k==5){
                break;
            }
            System.out.println("For statement values are :"+k);

        }


    }
}
