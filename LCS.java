import java.util.*;

class LCS{

    public static int maxx(int a,int b){
        return (a>b)?a:b;
    }
    public static int  findLCS(String X,String Y,int m,int n){

        int dp[][]=new int [m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){

                if(i==0||j==0)
                dp[i][j]=0;
                else if(X.charAt(i-1)==Y.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else 
                dp[i][j]=maxx(dp[i][j-1],dp[i-1][j]);
            }
        }
     return dp[m][n];
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();sc.nextLine();
        while(t-->0){
            String X=sc.nextLine();
            int m=X.length();
            String Y=sc.nextLine();
            int n=Y.length();
            System.out.println("Length of LCS: "+findLCS(X,Y,m,n));
       }
sc.close();
    }
}