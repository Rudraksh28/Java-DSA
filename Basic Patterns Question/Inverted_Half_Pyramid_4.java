// Expected Output

// * * * * 
// * * * 
// * * 
// * 

public class Inverted_Half_Pyramid_4 
{
    public static void main(String[] args) 
    {
        int n = 4;
        // int m = 5;
        String ch = "*";
        String space = " ";
        
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch + space);
            }
            System.out.println();
        }

    }    
}
