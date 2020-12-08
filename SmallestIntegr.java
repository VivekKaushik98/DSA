public class SmallestIntegr {
    public static void main(String[] args) {
        
        public String smallestnum(String N)
        {
           
           
        int [] arr=new int[N.length()];
        int zeroo=0;
        for(int i=0;i<N.length();i++)
        {   
            arr[i]=N.charAt(i)-'0';
            if(arr[i]==0)
            zeroo++;
        }
       
        Arrays.sort(arr);
       
        String str="";
        int temp=arr[0];
        arr[0]=arr[zeroo];
        arr[zeroo]=temp;
        for(int i=0;i<arr.length;i++)
        {
         str+=Integer.toString(arr[i]);
            
        }
        return str;
           
    }
    
}
