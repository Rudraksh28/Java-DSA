public class Inverted_Half_pyramid_with_number_7 
{
    public static void main(String[] args) 
    {
        int n = 5;
        String space = " ";
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print(j + space);
            }
            System.out.println();
        }
    }    
}
