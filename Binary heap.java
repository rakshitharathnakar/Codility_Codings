import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // Implement your solution here
        String bin=Integer.toBinaryString(N);
        int c=0;
        ArrayList<Integer> lengths=new ArrayList<Integer>();
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1' && (i+1) < bin.length() && bin.charAt(i+1)=='0')
            {
                c+=1;
                i++;
                while(bin.length()>(i+1)&&bin.charAt(i+1)=='0')
                {
                    c+=1;
                    i++;
                    if((i+1)<bin.length()&&bin.charAt(i+1)=='1')
                    {
                        break;
                    }
                }
                if(bin.length()>(i+1)&&bin.charAt(i+1)=='1')
                {
                    lengths.add(c);
                    c=0;
                }
            }
        }
        if(lengths.size()==0)
           return 0;
        else
        return Collections.max(lengths);
    }
}
