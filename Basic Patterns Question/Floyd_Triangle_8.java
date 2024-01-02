public class Floyd_Triangle_8 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int number = 1;
        String space = " ";
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(number + space);
                number++;
            }
            System.out.println();
        }
        
    }
}
