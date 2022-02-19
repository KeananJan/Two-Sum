
package twosumleetcode;

/**
 *
 * @author Keanan
 */
public class TwoSumLeetCode
{

    
    public static void main(String[] args) 
    {
        // Declaring all the vaiables and array's thats going to be used
       int target=58;
       int sum[] = {3,2,4,12,36,54,18,26,79,10,36,19,92,20};
       
       int answer[] = getAnswer(sum, target);
       
       //Used to display the sum array 
       for(int c = 0 ; c<sum.length; c++)
       {
           System.out.print(sum[c] + " ");
           
       }
       
        System.out.println(" ");
       
        System.out.println("Target :" + target);
        
         if ( answer.length == 2)
         {
              System.out.println( "Index "+answer[0] + " Index " + answer[1]);
         }
         else {System.out.println("No Answer!");}
    }

    private static int[] getAnswer(int sum[], int target ) 
    {
      for (int x = 0; x < sum.length; x++) 
        {
            for (int y = x + 1; y < sum.length; y++) 
            {
                if (sum[x] + sum[y] == target) 
                {
                    return new int[] {x , y};
                }
           }
       }
   return new int[]{} ;}
}
    

