import java.util.*;
public class LCSnoDp {
 
    public static int maxx(int a,int b){
        return (a>b)?a:b;
    }
    public static int  findLCS(String X,String Y,int m,int n){
    if (m==0||n==0)
         return 0;

        if (X.charAt(m-1)==Y.charAt(n-1))
        {
            return 1+findLCS(X,Y,m-1,n-1);
        }
        return maxx(findLCS(X, Y, m-1, n),findLCS(X, Y, m, n-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();sc.nextLine();
        while(t-->0){
            String X=sc.nextLine();
            int m=X.length();
            String Y=sc.nextLine();
            int n=Y.length();

            System.out.println(findLCS(X,Y,m,n));



        }
sc.close();
    }
}

