import java.util.*;


class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    
		int[] arr1=new int[m];
		int[] arr2=new int[n];
		
		for(int i=0;i<m;i++)
		    arr1[i]=sc.nextInt();

		for(int i=0;i<n;i++)
		    arr2[i]=sc.nextInt();
		
	HashSet<Integer> arrSet=new HashSet<>();
    
    for(int i=0;i<m;i++)
	    arrSet.add(arr1[i]);

	for(int i=0;i<n;i++)
	    arrSet.add(arr2[i]);

    int c=0;
	for(int ar:arrSet){
	c++;
	}
	System.out.println(c);
			    
	}
    sc.close()	;
    
		
		
	}
}