// Expected Output

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

public class Zero_One_Triangle_9
{
    public static void main(String[] args) 
    {
        int n = 5;
        String space = " ";
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                sum = (i + j);
                if(sum % 2 == 0)
                {
                    System.out.print("1" + space);
                }
                else
                {
                    System.out.print("0" + space);
                }
            }
            System.out.println();
        }
        
    }    
}
