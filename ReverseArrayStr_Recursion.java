import java.util.*;
public class ReverseArrayStr_Recursion {

    public static void reverseStr(char [] chr,int strt,int last){

        
        if(strt>=last){
            return;
        }
        char temp=chr[strt];
        chr[strt]=chr[last];
        chr[last]=temp;
        reverseStr(chr,strt+1,last-1);



    }
    public static void printArr(char[] chr)
    {
        for(char ch:chr)
        System.out.print(ch);
    }
    public static void main(String args[]){
        System.out.println("Hello World");
       
        Scanner sc=new Scanner (System.in);
        
        int t=sc.nextInt();

        
        while(t-->0)
        {
        
            String str=sc.next();sc.nextLine();
            char chr []=new char[str.length()];

            int strt=0;
            int last=chr.length-1;
        
            for(int i=0;i<str.length();i++)
            {
                chr[i]=str.charAt(i);
            }
            reverseStr(chr,strt,last);
            printArr(chr);
            System.out.println();


        }
       sc.close();

    }
}
