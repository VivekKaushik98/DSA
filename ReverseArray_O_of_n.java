import java.util.*;
class ReverseArray_O_of_n{

    public static void printArr(int[] arr)
    {
        for(int ar: arr)
        {
            System.out.print(ar+" ");
            
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello world");

        int t=sc.nextInt();
        while (t-->0)
        {
            int l=sc.nextInt();
        int arr[]=new int[l];
        int strt=0;
        int last=l-1;
        
        for(int i=0;i<l;i++)
            arr[i]=sc.nextInt();
         while(strt<last){
            int tmp=arr[strt];
            arr[strt]=arr[last];
            arr[last]=tmp;
            strt++;
            last--;
        }
        printArr(arr);
        System.out.println();//

        }
        
sc.close();
    }
}