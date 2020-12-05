public class Substring {

    public static void main(String[] args) {
        
        String str="abcd";

        int n=str.length();
        for(int i=0;i<n;i++)
        {
            for(int len=1;len<=n-i;len++)
            {
              String substring="";
             for(int j=i;j<i+len;j++)  
             {
                 substring+=str.charAt(j); 
             } 
            System.out.println(substring);
            }
            
        }
    }
    
}
