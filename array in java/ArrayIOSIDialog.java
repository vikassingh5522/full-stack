// Array input and display - showInputDialog()

import javax.swing.JOptionPane;
class ArrayIOSIDialog
{
	public static void main(String []args) 
	{
		String data = JOptionPane.showInputDialog("Enter the Space seperated array of integers");
		System.out.println("Entered string: "+data);

		String []nums = data.split(" ");
		int []ar = new int[nums.length];		

		System.out.println("\n Enter array: ");
		for(int i=0 ; i<nums.length ; i++)
		{
			ar[i]=Integer.parseInt(nums[i]);
		}

		System.out.println("\n1. Array elements are: ");
		for(int x : ar)
		{
			System.out.print("    "+x);
		}
	}
}
