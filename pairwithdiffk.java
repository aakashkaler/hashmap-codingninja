import java.util.*;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) 
    {
		//Write your code here
        HashMap<Integer,Integer> m=new HashMap<>();
        int c=0;
        

        for(int i:arr)
        {
            if(m.containsKey(i))
            {
                int l=m.get(i);
                m.put(i,l+1);
            }
            else
            {
                m.put(i,1);
            }
        }
        for(int i:arr)
        {
            if(k!=0)
            {
            if(m.containsKey(i-k))
            {
                c=c+m.get(i)*m.get(i-k);
                m.remove(i-k);
            }
            }
            else
            {
                if(m.containsKey(i))
                {
                int t=m.get(i);
                if(t>1)
                {
                    int f=(t*(t-1))/2;
                    c=c+f;
                }
                    m.remove(i);
                }
                
            }
        }
        
        
        return c;
	}
}
