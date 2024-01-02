// Expected Output

// *
// **
// ***
// ****

public class Inverted_Half_Pyramid_180_degree_5
{
    public static void main(String[] args) 
    {
        int n = 4;
        // int m = 5;
        String ch = "*";
        String space = " ";
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(space);
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }    
    }    
}
