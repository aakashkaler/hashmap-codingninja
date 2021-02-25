import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        HashMap<Integer,Integer> m=new HashMap<>();
        int z=0;
        for(int i:arr)
        {
            m.put(i,z);
            z++;
        }
        int start=0,startind=0,end=0,max=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:arr)
        {
            if(m.containsKey(i))
            {
                int a=i+1,b=i-1,s=i,e=i,c=0,l=m.get(i);
            while(true)
            {
              if(m.containsKey(a))
              {
                  e=a;
                  c++;
                  
                  m.remove(a);
              }
                else
                {
                    break;
                }
                a++;
            }
                while(true)
                {
                    if(m.containsKey(b))
                    {
                        s=b;
                        c++;
                        l=m.get(b);
                        m.remove(b);        
                    }
                    else
                    {
                        break;
                    }
                    b--;
                }
                if(c>=max)
                {
                    if(c==max)
                    {
                        if(l<startind)
                        {
                        max=c;
                    start=s;
                            startind=l;
                    end=e;
                        }
                    }
                    else{
                    max=c;
                    start=s;
                        startind=l;
                    end=e;
                    }
                }
            }     
        }
        ar.add(start);
        ar.add(end);
        return ar;
    }
}
