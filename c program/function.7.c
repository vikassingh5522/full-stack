// ------------------------------- function  basic----------------------------
// #include <stdio.h>
// #include <stdlib.h>

// void patten(); // declaration prototype
// void patten() // function definition
// {
//     printf("\n vikas ");
// }

// int main()
// {
//     //  fution call
//     patten();
//     return 0;
// }

// --------------------------------------------------------------------------------------------------
// print  goo morning pune
//  #include<stdio.h>
//  void msg();
//  void msg()
//  {
//    printf("\n good morning pune");
//  }
//  int main()
//  {
//      int i,j;
//      for(i=0;i<10;i++){
//      msg();
//      }
//     return 0;
//  }
// --------------------------------------------------------------------------------------------------

// void msg();
// int main()
// {
// 	printf("\n Main starts \n");
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	msg();
// 	printf("\n main ends");
// 	return 0;
// }

// void msg()
// {
// 	printf("good morning Pune");
// }

//-------------------------------------------------------------------------------------------------
// #include<stdio.h>
// void mumbai();
// void delhi();
// void patna();
// int main()
// {
// 	printf("\n At start in main()");
// 	mumbai();
// 	printf("\n back to main from mumbai");
// 	delhi();
// 	printf("\n back to main() from delhi");
// 	printf("\n At end in main()");
// 	return 0;
// }
// void mumbai()
// {
// 	printf("\n i am in mumbai");
// }
// void delhi()
// {
// 	printf("\n i am in delhi");
// 	patna();
// 	printf("\n back to delhi from patna");
// }
// void patna()
// {
// 	printf("\n i am in patna");
// }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------

// Different Types Of Functions

// 			Function
// 			   |
// 		---------------------------------------
// 		|				                   |
// 	    User-Defined			         Built-in
// 	       |				                |
//   -----------------------------	           ----------------------------------------------------------------------
//   |	   |	   |	   |      |				             |		        |		         |		            |
//   I    II      III     IV      V             Math related     Graphics        IO related             String related  .....
// 					                          math.h	     graphics.h     stdio.h/conio.h	          String.h

//  - Built-in: These fuctions are provided with the compiler. Any language consists of Editor, Compiler, Library,
// 	     documentation and more..., All built-in functions are the part of library. and the are grouped together
// 	     into header files.

//  - User-Defined Functions: These functions are defined by the user of language.(programmer)
// 			    There are following types of UDF

// 			I] simple function (function without argument without return type)
// 			II] function with argument without return type
// 			III] function without argument with return type
// 			IV] function with argument with return type
// 			V] Recursion

// WAP to add two nos
// int main()
// {
// 	int a,b,tot=0;
// 	printf("\n Enter any two nos: ");
// 	scanf("%d %d",&a,&b);
// 	tot=a+b;
// 	printf("\n Addition is %d",tot);
// 	return 0;
// }

// -------------------------------------------------------------------------------------------

// I] simple function (function without argument without return type)

// #include <stdio.h>
// #include <stdlib.h>
// void add();
// void add() // simple function mai fall call mai sab write up kar te hai
// {
// 	int a,b,tot=0;
// 	printf("\n Enter any two nos: ");
// 	scanf("%d %d",&a,&b);
// 	tot=a+b;
// 	printf("\n Addition is %d",tot);
// }
// int main()
// {
// 	add();
// 	add();
// 	add();
// 	return 0;
// }
// ----------------------------program------------------------------------------------------------
// #include <stdio.h>
// void add()
// {
//     int a, b, total = 0;
//     printf("\n enter the 2 number:");
//     scanf("%d %d", &a, &b);
//     total = a + b;
//     printf("\n add 2 nummber: %d", total);
// }
// int main()
// {
//     add();
//     add();
//     return 0;
// }
//---------------------------------------------------------------------------------------------------
// II] function with argument without return type

// #include<stdio.h>
// void add(int,int);
// int main()
// {
// 	int a,b;
// 	printf("\n Enter any two nos: ");
// 	scanf("%d %d",&a,&b);
// 	add(a,b); // Actual arguments
// 	return 0;
// }
// void add(int x, int y) // formal arguments
// {
// 	int tot=0;
// 	tot=x+y;
// 	printf("\n Addition is %d",tot);
// }
// --------------------------------------------------------------------------------------------------

// III] function without argument with return type
// #include<stdio.h>
// int add();
// int main()
// {
// 	int t;
// 	t=add();
// 	printf("\n Addition is %d",t);
// 	return 0;
// }

// int add()
// {
// 	int a,b,tot=0;
// 	printf("\n Enter any two nos: ");
// 	scanf("%d %d",&a,&b);
// 	tot=a+b;
// 	return tot;
// }
//---------------------------------------------------------------------------------------------------------

// IV] function with argument with return type

// #include<stdio.h>
// int add(int,int);
// int main()
// {
// 	int a,b,t;
// 	printf("\n Enter any two nos: ");
// 	scanf("%d %d",&a,&b);
// 	t=add(a,b);
// 	printf("\n Addition is %d",t);
// 	return 0;
// }
// int add(int x, int y)
// {
// 	int tot=0;
// 	tot=x+y;
// 	return tot;
// }

//--------------------------------------------------------------

// Recursion: calling function from itself.

// find factorial

// 5!=5*4!
// 4!=4*3!
// 3!=3*2!
// 2!=2*1!
// 1!=1

// int main()
// {
// 	int no,ans;
// 	printf("\n Enter any number: ");
// 	scanf("%d",&no);
// 	ans=fact(no);
// 	printf("\n Factorial is %d",ans);
// 	return 0;
// }
// int fact(int n)
// {
// 	if(n==1)
// 	  return 1;
// 	else
// 	  return (n*fact(n-1));
// }

// --------------------------------------------------------------------------------------------------------------
// write a program using function to reverse entered nuunber - int findreverse(int);

// #include<stdio.h>
// int findreverse(int);
// int main()
// {
// 	int no,r;
// 	printf("\n Enter the number: ");
// 	scanf("%d",&no);
// 	r=findreverse(no);
// 	printf("\n Reverse of %d is %d",no,r);
// }
// int findreverse(int n)
// {
// 	int rev=0;
// 	while(n!=0)
// 	{
// 		rev=(rev*10)+(n%10);
// 		n=n/10;
// 	}
// 	return rev;
// }

//---------------------------------------------------------------------------------------------------------------------------
// palindrome check using function

#include <stdio.h>
#include <stdlib.h>
int findreverse(int);
char ispalindrome(int, int);
int main()
{
	int no, r;
	char ch;
	printf("\n Enter the number: ");
	scanf("%d", &no);
	r = findreverse(no);  
	printf("\n Reverse of %d is %d", no, r);
	ch = ispalindrome(findreverse(no), no);
	if (ch == 'y')
		printf("\n Palindrome Number");
	else
		printf("\n Not a Palindrome Number");

	return 0;
}
char ispalindrome(int n1, int n2)
{
	if (n1 == n2)
		return 'y';
	else
		return 'n';
}
int findreverse(int n)
{
	int rev = 0;
	while (n != 0)
	{
		rev = (rev * 10) + (n % 10);
		n = n / 10;
	}
	return rev;
}
