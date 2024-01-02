// Expected Output

// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

//Logic



public class Solid_Rhombus_Homework_1 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int m = 5;
        String space = " ";

        for(int i = 0; i <= n; i++)
        {
            for(int j = n-i; j >= 1; j--)
            {
                System.out.print(space);
            }
            for(int j = m; j >= 1; j--)
            {
                System.out.print("*" + space);
            }
            System.out.println();
        }
        
    }    
}
