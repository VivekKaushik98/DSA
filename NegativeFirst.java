import java.util.*;
public class NegativeFirst {

    public static void negFirst(ArrayList<Integer> arr,int l){

        int j=0,temp;
        for(int i=0;i<l;i++)
        {
            if(arr.get(i)<0){
            if(i!=j)
            {
             temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
             }
             j++;
            }
        }
        for(int ar:arr)
        System.out.print(ar+" ");
    }


    public static void main(String args[]){

        Scanner sc=new Scanner (System.in);

        int t=sc.nextInt();
    while(t-->0){
        ArrayList<Integer> arr=new ArrayList<>();
        int l=sc.nextInt();
        for(int i=0;i<l;i++){
            arr.add(sc.nextInt());

        }
        negFirst(arr,l);
        


        }

sc.close();
    }
}
