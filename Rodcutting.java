import java.util.*;
public class Rodcutting {

    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int maxRod(int n,int a,int b,int c){

        int [] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=-1;
if(n==0)
return 0;
if(i-a>=0)
    dp[i]=max(dp[i],dp[i-a]);
if((i-b>=0))
dp[i]=max(dp[i],dp[i-b]);
if(i-c>=0)
dp[i]=max(dp[i],dp[i-c]);

if(dp[i]!=-1)
dp[i]++;

        }
        return dp[n];

    }

     public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();

while(t-->0){
int n=sc.nextInt();
int a =sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

System.out.println("Max Number of Piece used Can be: "+maxRod(n,a,b,c));


}
sc.close();

    }
    
}
