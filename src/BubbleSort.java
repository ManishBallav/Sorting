import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) 
	{
		String a[] = new String[5];
		Scanner in = new Scanner(System.in);
		
		int n = a.length;
		
		System.out.println("Enter 5 words");
		for(int i=0; i<n; i++)
		{
			a[i] = in.nextLine();
		}
		
		System.out.print("\nUnsorted Array:\n");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+", ");
		}
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String t = a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
		System.out.println("\nSorted elements are:");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+", ");
		}

	}

}
