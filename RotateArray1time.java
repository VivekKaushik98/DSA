import java.util.*;
public class RotateArray1time {

    public static void ShiftOne(int []arr,int l){
        
        int temp=arr[l-1];
        for(int i=l-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int ar:arr)
        System.out.print(ar+" ");
        System.out.println();
    }
    public static void main(String args[]){

      Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0)
        {
            int l=sc.nextInt();
            int [] arr=new int[l];

            for(int i=0;i<l;i++)
            arr[i]=sc.nextInt();
            
            ShiftOne(arr,l);

        }
        sc.close();
    }
}
