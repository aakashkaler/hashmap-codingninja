import java.util.*;
public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
         HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i:arr1)
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
        for(int i:arr2)
        {
            if(m.containsKey(i))
            {
                System.out.println(i);
                 int k=m.get(i);
                if(k==1)
                {
                    m.remove(i);
                }
                else
                {
                m.put(i,k-1);
                }
            }
        }
	}
}
