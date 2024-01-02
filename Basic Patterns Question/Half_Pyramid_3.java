// Expected Output

// * 
// * * 
// * * * 
// * * * * 

public class Half_Pyramid_3 
{
    public static void main(String[] args) 
    {
        int n = 4;
        // int m = 5;
        String ch = "*";

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        
    }    
}