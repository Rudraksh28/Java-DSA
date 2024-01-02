// Expected Output

// *****
// *   *
// *   *
// *****

public class Hollow_Rectangle_2 
{
    public static void main(String[] args) 
    {
        int n = 4;
        int m = 5;
        String ch = "*";

        //Outer Loop
        for(int i = 1; i <= n; i++)
        {
            //Inner Loop
            for(int j = 1; j <= m; j++)
            {
                //cell(i,j)
                if(i == 1 || j ==1 || i == n|| j == m)
                {
                    System.out.print(ch);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
