import java .util.*;

class AsciiIndex1{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=new char[str.length()];
        
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        int s=0;
        int flag=0;
        if(str.length()<3)
        {
            System.out.println(0);
        }
        
        
        else {
            for(int i=0;i<str.length();i++)
            {
                if(( (int)ch[i]>=65 &&(int)ch[i]<=90 || (int)ch[i]>=97 &&(int)ch[i]<=127)||(int)ch[i]==' '){
            if((i+1)%3==0 && i!=0 )
                {
                   //System.out.println(i+3);
                    s=s+(int)ch[i];
                    if(ch[i]==' ')
                    s=s-32;
                }
                }
                else{
                    flag=1;
                    System.out.println(str+" is not a valid string"); 
                    break;
                }
            }
            if(flag==0)
            System.out.println("Sum is "+s);
        }

    }
}