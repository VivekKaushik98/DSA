import java.util.*;
import java.io.IOException;
import java.io.InputStream;
//import java.io.PrintWriter;
import java.util.InputMismatchException;
 
class FastScanner {
  
    private InputStream mIs;
  private byte[] buf = new byte[1024];
  private int curChar;
  private int numChars;
 
  public FastScanner() {
    this(System.in);
  }
 
  public FastScanner(InputStream is) {
    mIs = is;
  }
 
  public int read() {
    if (numChars == -1)
      throw new InputMismatchException();
    if (curChar >= numChars) {
      curChar = 0;
      try {
        numChars = mIs.read(buf);
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      if (numChars <= 0)
        return -1;
    }
    return buf[curChar++];
  }
 
  public String nextLine() {
    int c = read();
    while (isSpaceChar(c))
      c = read();
    StringBuilder res = new StringBuilder();
    do {
      res.appendCodePoint(c);
      c = read();
    } while (!isEndOfLine(c));
    return res.toString();
  }
 
  public String nextString() {
    int c = read();
    while (isSpaceChar(c))
      c = read();
    StringBuilder res = new StringBuilder();
    do {
      res.appendCodePoint(c);
      c = read();
    } while (!isSpaceChar(c));
    return res.toString();
  }
 
  public long nextLong() {
    int c = read();
    while (isSpaceChar(c))
      c = read();
    int sgn = 1;
    if (c == '-') {
      sgn = -1;
      c = read();
    }
    long res = 0;
    do {
      if (c < '0' || c > '9')
        throw new InputMismatchException();
      res *= 10;
      res += c - '0';
      c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
  }
 
  public int nextInt() {
    int c = read();
    while (isSpaceChar(c))
      c = read();
    int sgn = 1;
    if (c == '-') {
      sgn = -1;
      c = read();
    }
    int res = 0;
    do {
      if (c < '0' || c > '9')
        throw new InputMismatchException();
      res *= 10;
      res += c - '0';
      c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
  }
 
  public boolean isSpaceChar(int c) {
    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
  }
 
  public boolean isEndOfLine(int c) {
    return c == '\n' || c == '\r' || c == -1;
  
  }  
 
}
public class QuicksortScanner {

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

           
            //
            
            for(int i=0;i<l;i++){
                arr[i]=sc.nextInt();
            }
       
            quickSort(arr,0,l-1);
            // System.out.println("Sorted Array");
            // printArray(arr);
            // System.out.println();
      

        
          StringBuilder sb=new StringBuilder();
            
            System.out.println("Sorted Array");
          for(int i=0;i<l;i++){
            sb.append(arr[i]+" ");  
            
          }
          System.out.println(sb.toString());
          

        }
            
sc.close();
    }
    
}
