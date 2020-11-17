import java.util.*;

public class Quicksort {

    public static int partition(int [] arr,int strt,int last){

        int X=arr[last];

        int i=strt-1;
        
        for(int j=strt;j<last;j++)
        {
            if(arr[j]<X)
            {
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[last];
        arr[last]=temp;

        return i+1;
    }
    public static void quickSort(int[] arr,int strt,int last)
    {
        if(strt<last)
        {
            int indexPartition=partition(arr,strt,last);

            quickSort(arr,strt,indexPartition-1);
            quickSort(arr, indexPartition+1, last);

        }

    }

    public static void printArray(int arr[])
    {
        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int l=sc.nextInt();
            int arr[]=new int[l];

           
            
            
            for(int i=0;i<l;i++){
                arr[i]=sc.nextInt();
            }
       
            quickSort(arr,0,l-1);
            System.out.println("Sorted Array");
            printArray(arr);
            System.out.println();
      

        }
            
sc.close();
    }
    
}
