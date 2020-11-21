import java.util.*;

public class Kadane {

    public static int maxContiguousSum(ArrayList<Integer> arr){

        int max_till_now=0,max_till_end=0;

        for(int i=0;i<arr.size();i++){

            max_till_now+=arr.get(i);

            if(max_till_now<0)
            max_till_now=0;

            else if(max_till_now>max_till_end)
            max_till_end=max_till_now;
        }
        return max_till_end;

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>();

            for(int i=0;i<l;i++)
                arr.add(sc.nextInt());

            System.out.println("Sum of Contiguous SubArray: "+maxContiguousSum(arr));
                
        }


sc.close();
    }
    
    
}
