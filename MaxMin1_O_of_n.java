import java.io.*;
import java.util.Scanner;

class MaxMinPair
{
    int max;
    int min;
}
class MaxMin1_O_of_n
{


    public static MaxMinPair findMaxMin(int [] arr)
    {
        MaxMinPair maxmin=new MaxMinPair();
        if(arr.length==1){
            maxmin.max=arr[0];
            maxmin.min=arr[0];
            }

        if(arr[0]>arr[1]){
            maxmin.max=arr[0];
            maxmin.min=arr[1];
        }
        else{
            maxmin.max=arr[1];
            maxmin.min=arr[0];
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>maxmin.max)
            {
                maxmin.max=arr[i];
            }
            else if(arr[i]<maxmin.min){
                maxmin.min=arr[i];
            }
        }


        return maxmin;

    }
    public static void main(String args[]) throws IOException{



        System.out.println("Hello World");
        Scanner sc =new Scanner(System.in);

        int t=sc.nextInt();
        
        while(t-->0)
    {   
        int l=sc.nextInt();

        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }

        MaxMinPair mxmn =findMaxMin(arr);
        System.out.print("Max: "+mxmn.max+" | Min: "+mxmn.min);
        

        

    }
        
        sc.close();


    }

}