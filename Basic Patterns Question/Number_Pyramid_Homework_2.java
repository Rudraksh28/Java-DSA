public class Number_Pyramid_Homework_2 
{
    public static void main(String[] args) 
    {
        int n = 5;
        String space = " ";

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(space);
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i + space);
            }
            // for(int j = 1; j <= n-i; j++)
            // {
            //     System.out.print(space);
            // }
            System.out.println();
        }
        
    }    
}