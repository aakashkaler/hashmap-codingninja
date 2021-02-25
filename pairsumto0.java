import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        int x=0,c=0;
        for(int i:input)
        {
            if(m.containsKey(i))
            {
                int k=m.get(i);
                m.put(i,k+1);
            }
            else
            {
                m.put(i,1);
            }
        }
        for(int i:input)
        {
            if(i!=0)
            {
           if(m.containsKey(-i))
           {
               if(m.containsKey(i))
               {
               int k=m.get(i);
               int n=m.get(-i);
               
               x=x+(k*n);
               }
               m.remove(-i);

               
           }
            }
            else
            {
                c++;
                
            }
                           
        }
        int sum=0;
        for(int i=0;i<c;i++)
        {
            sum=sum+i;
        }
        return x+sum;
	}
}
