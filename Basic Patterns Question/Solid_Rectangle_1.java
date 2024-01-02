// Expected Output

// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

// Logic 
// let i be a row. 
// There are 4 row

// And j be a column
// There are 5 columns
public class Solid_Rectangle_1
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
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}