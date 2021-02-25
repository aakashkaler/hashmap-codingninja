import java.util.*;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[])
    {
		int max=0,sum=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum==0)
            {
                max=i+1;
            }
            if(m.containsKey(sum))
            {
                int k=m.get(sum);
                if(i-k>max)
                {
                    max=i-k;
                    
                }
            }
            else
            {
                m.put(sum,i);
            }
        }
        return max;
	}
}
