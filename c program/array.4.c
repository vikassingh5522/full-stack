// --------------------------- Array and 1d array  -------------------------------
#include <stdio.h>
// It will become simple using the loop
// int main()
// {
//     int x[] = {14, 12, 35, 19, 22};
//     int i , pos= 0;
//     printf("\n array element no's:");
//     for (i = 100; i < 105 ; i++)
//     {
//         printf("%5d", x[pos]);
//         pos++;
//     }
//     return 0;
// }

// using iterator i as a position indicator
// int main()
// {
//     int x[5] = {14, 12, 35, 19, 22};
//     int i ;
//     printf("\n array element no's:");
//     for (i = 0; i < 5 ; i++)
//     {
//         printf("%5d", x[i]);
//     }
//     return 0;
// }

// WAP to input and display the array of 7 elements.
// int main()
// {
//     int x[7],i;
//     printf("\n Enter the 7 elements of array:");
//     for(i=0; i<7; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     printf("Element are  %d");
//     for(i=0; i<7; i++)
//     {
//         printf("%8d ", x[i]);
//     }
//     return 0;
// }

// Enter any 10 nos and count even and odd nos from it
//  int main()
// {
// 	int arr[10], i, ecnt=0, ocnt=0;
// 	printf("\n Enter any 10 nos: ");
// 	for(i=0;i<10;i++)
// 	{
// 		scanf("%d",&arr[i]);
// 	}
// 	// process
// 	for(i=0;i<10;i++)
// 	{
// 		if(arr[i]%2==0)
// 		{
// 			ecnt++;
// 		}
// 		else
// 		{
// 			ocnt++;
// 		}
// 	}
// 	printf("\n Elements are: ");
// 	for(i=0;i<10;i++)
// 	{
// 		printf("%8d",arr[i]);
// 	}
// 	printf("\n Even Count is %d and Odd count is: %d",ecnt,ocnt);
// 	return 0;
// }

// Enter the 10 nos and display the even and odd list from it.
// {
//     int x[10], i, eventcount, oddcount;
//     printf("\n Enter the 10 nos:");
//     for (i = 0; i < 10; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     printf("\n Element are:");
//     for (i = 0; i < 10; i++)
//     {
//         printf("%8d", x[i]);
//     }
//     printf("\n Even Elements are: :");
//     for (i = 0; i < 10; i++)
//     {
//         if (x[i] % 2 == 0)
//         {
//             printf("\n %4d", x[i]);
//         }
//     }
//     printf("\n odd Element are:");
//     for (i = 0; i < 10; i++)
//     {
//         if (x[i] % 2 != 0);
//         {
//             printf("\n %4d", x[i]);
//         }
//     }
//     return 0;
// }

//   Enter the 10 nos and display the even and odd list from it.
// int main()
// {
// 	int arr[10], i, ecnt=0, ocnt=0;
// 	printf("\n Enter any 10 nos: ");
// 	for(i=0;i<10;i++)
// 	{
// 		scanf("%d",&arr[i]);
// 	}
// 	printf("\n Elements are: ");
// 	for(i=0;i<10;i++)
// 	{
// 		printf("%8d",arr[i]);
// 	}
// 	printf("\n Even Elements are: ");
// 	for(i=0;i<10;i++)
// 	{
// 	    if(arr[i]%2==0)
// 	    {
// 		    printf("%8d",arr[i]);
// 	    }
// 	}
// 	printf("\n Odd Elements are: ");
// 	for(i=0;i<10;i++)
// 	{
// 	    if(arr[i]%2!=0)
// 	    {
// 		    printf("%5d",arr[i]);
// 	    }
// 	}
// 	return 0;
// }

// Enter any 10 nos and display list of primes from it.
// int main()
// {
//     int x[10], i, d, flg;
//     printf("\n Enter any 10 nos: ");
//     for (i = 0; i < 10; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     printf("\n all lelement are :");
//     for (i = 0; i < 10; i++)
//     {
//         printf("%2d ", x[i]);
//     }
//     printf("\n list prime elements are :");
//     for (i = 0; i < 10; i++)
//     {
//         d = 2;
//         flg = 0;
//         while (d <= (x[i] / 2))
//         {
//             if (x[i] % d == 0)
//             {
//                 flg = 1;
//                 break;
//             }
//             d++;
//         }
//         if (flg == 0)
//         {
//             printf("%5d", x[i]);
//         }
//     }
//     return 0;
// }

// Enter the 5 nos and count the palindrome nos from it.
// int main()
// {
//     int no, x[5], rev, i, count = 0;
//     printf("\n Enter any 5 nos: ");
//     for (i = 0; i < 5; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     for (i = 0; i < 5; i++)
//     {
//         no = x[i];
//         rev = 0;
//         while (no != 0)
//         {
//             rev = rev * 10 + no % 10;
//             no = no / 10;
//         }
//         if (rev == x[i])
//         {
//             count++;
//         }
//     }
//     printf("\n Array Elements: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("%6d",x[i]);
// 	}
// 	printf("\n Palindrome Count: %d",count );
// 	return 0;
// }

// Enter any 10 nos and find 1st and second max.
// int main()
// {
//     int x[10], i, no, firstmax, secmax;
//     printf("\n Enter  the 10 no of through keyboard :");
//     for (i = 0; i < 10; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     firstmax = x[0];
//     secmax = x[1];
//     for (i = 1; i < 10; i++)
//     {
//         if (x[i] >= firstmax)
//         {
//             secmax = firstmax;
//             firstmax = x[i];
//         }
//         else if (x[i] > secmax)
//         {
//             secmax = x[i];
//         }
//     }
//         printf("\n All element :");
//         for (i = 0; i < 10; i++)
//         {
//             printf("%8d", x[i]);
//         }
//         printf("\n  firstmax: %d  \t secmax: %d ", firstmax, secmax);
//     return 0;
// }

// input 12 nos, WAP to find smallest numbers position in an array
// int main()
// {
//     int x[12], i, no, pos ,min,small;
//     printf("\n Enter  the 12 no of through keyboard :");
//     for(i=0;i<12;i++)
//     {
//         scanf("%d",&x[i]);
//     }
//     pos=0;
//     min=x[0];
//     for(i=1;i<12;i++)
//     {
//         if(x[i]<min)
//         {
//           min=x[i];
//           pos=i;
//         }
//     }
// printf("\n array of the  element are:");
// for ( i = 0; i < 12; i++)
// {
//     printf("%8d",x[i]);
// }
// printf("\n smallest element :%d present at :%d postion:",min, pos);
// return 0;
// }

//  WAP to input array of 10 nos and display it as it is and in reverse manner nos
// int main()
// {
//     int x[10], i, no ,rev;
//     printf("\n Enter  the 10 no  :");
//     for(i=0;i<10;i++)
//     {
//       scanf("%d",&x[i]);
//     }
//     printf("\n array of the  element are:");
//     for ( i = 0; i < 10; i++)
//     {
//         printf("%5d",x[i]);
//     }
//     printf("\n reverse-1 :");
//     for ( i = 9; i >= 0; i--)
//     {
//          printf("%5d",x[i]);
//     }
//     printf("\n Reverse-2: ");
// 	for(i=0;i<10;i++)
// 	{
// 		printf("%5d",x[9-i]);
// 	}
//     return 0;
// }

// WAP to input array of 10 nos and copy it as it is and in reverse manner in another arrays
// int main()
// {
//     int x[10], y[10], z[10], i, j;
//     printf("\n Enter  the 10 no  :");
//     for (i = 0; i < 10; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     for (i = 0; i < 10; i++)
//     {
//         y[i] = x[i]; // copy as it is
//     }
//     for (i = 0, j = 9; i < 10; i++, j--)
//     {
//         z[i] = x[j]; // copy in reverse manner
//     }
//     printf("\n Original array: ");  // original copy
// 	for(i=0;i<10;i++)
// 	{
// 		printf("%8d",x[i]);
// 	}
//     printf("\n copeing array:");
//     for (i = 0; i < 10; i++)
//     {
//         printf("%8d", y[i]);
//     }
//     printf("\n copy in reverse array:");
//     for (i = 0; i < 10; i++)
//     {
//         printf("%8d", z[i]);
//     }
//     return 0;
// }

// Enter the price of 6 items thw keyboard and find total bill, apply the  discount 3% if item price is greater than 100 and 5% if it is greater than 500
// 23	120	600	90	220	50
// int main()
// {
// 	float pr[6],tot=0.0,dis=0.0;
// 	int i;
// 	printf("\n Enter the price of 6 items: ");
// 	for(int i=0;i<6;i++)
// 	{
// 		scanf("%f",&pr[i]);
// 	}
// 	for(int i=0;i<6;i++)
// 	{
// 		if(pr[i]>=500)
// 		{
// 			dis=dis+(pr[i]*0.05);
// 		}
// 		else if(pr[i]>=100)
// 		{
// 			dis=dis+(pr[i]*0.03);
// 		}
// 		tot=tot+pr[i];
// 	}
// 	printf("\n Total Bill: %0.2f",tot);
// 	printf("\n Discount: %0.2f",dis);
// 	printf("\n Pay Rs: %0.2f",(tot-dis));
// 	return 0;
// }

// SELECTION SHORT✅👍
//   55 44 33 22 11

// #include <stdio.h>
// int main()
// {
//     int x[5], i,j, tmp;
//     printf("\n Enter the vslue any 5 no:");
//     for (i = 0; i < 5; i++)
//     {
//         scanf("%d", &x[i]);
//     }
//     printf("\n before sort");
//     for (i = 0; i < 5; i++)
//     {
//         printf("%d ", x[i]);
//     }
//     // selection sort
//     for (i = 0; i < 4; i++)
//     {
//        for(j=i+1;j<5;j++)
// 		{
// 			if(x[i]>x[j])
// 			{
// 				tmp=x[i];
// 				x[i]=x[j];
// 				x[j]=tmp;
// 			}
// 		}
//     }
//     printf("\n after soft ");
//     for(i=0;i<5; i++)
//     {
//         printf("%d ", x[i]);
//     }
//     return 0;
// }

// Enter any 10 nos and copy all nos in another array in ascending order.
// #include <stdio.h>
// int main()
// {
//      int x[10] ,i ,j , tmp,n;
//      printf(" Enter the element number : ",n);
//      scanf("%d", &n);
//      printf("\n  Enter the 10 number: ");
//      for(i=0; i<n; i++)
//      {
//         scanf("%d",&x[i]);
//         x[i]=x[i];
//      }
//      printf("\n original arr: ");
//      for(i=0; i<n; i++)
//      {
//        printf("%5d", x[i] );
//      }
//      // selection sort
//      for(i=0; i<n; i++)
//      {
//         for(j=i+1; j<n; j++)
//         {
//             if(x[i]>x[j])
//             {
//                 tmp=x[i];
//                 x[i]=x[j];
//                 x[j]=tmp;
//             }
//         }
//      }
//      printf("\n copied in acenending order:");
//      for(i=0; i<n; i++)
//      {
//         printf("%6d", x[i]);
//      }
//     return 0;
// }

// Bubble sort	✅
//  Entered Array -	55	44	33	22	11

// #include<stdio.h>
// int main()
// {
//      int i,j, tmp,n;
//      int x[n];
//      printf("\n Enter the element  number: ");
//      scanf("%d", &n);
//      printf("\n Enter the 4 number: ");
//      for(i=0; i<n; i++)
//      {
//         scanf("%d", &x[i]);
//      }
//      printf("\n before sort:");
//      for(i=0; i<n; i++)
//      {
//         printf("%5d", x[i] );
//      }
//      // bubble sort
//      for(i=0; i<n-1; i++)
//      {
//         for(j=0; j<(n-i); j++)
//         {
//             if(x[j] > x[j+1])
//             {
//                 tmp=x[j];
//                 x[j]=x[j+1];
//                 x[j+1]=tmp;
//             }
//         }
//      }
//      printf("\n After short:");
//      for(i=0; i<n; i++)
//      {
//         printf("%5d", x[i]);
//      }
//     return 0;
// }

// Insertion sort✅

// #include <stdio.h>
// int main()
// {
// 	int x[100],i,j,pivot,k;
//     int n;
//     printf("Enter the number of element:");
//     scanf("%d", &n);
// 	printf("\n Enter the  nos: ");
// 	for(i=0;i<n;i++)
// 	{
// 		scanf("%d",&x[i]);
// 	}
// 	printf("\n Before Sort: ");
// 	for(i=0;i<n;i++)
// 	{
// 		printf("%5d",x[i]);
// 	}
// 	// sort - Insertion 
// 	for(i=1;i<n;i++) // i gives pivot position
// 	{
// 		pivot=x[i];
// 		j=i-1;
// 		while( j!=-1 && x[j]>pivot)
// 		{
// 			x[j+1]=x[j];
// 			j--;
// 		}
// 		x[j+1]=pivot;
// 		/*printf("\n-----------------------------------------------\n");
// 		for(k=0;k<8;k++)
// 		{
// 			printf("%5d",x[k]);
// 		}*/
// 	}
// 	printf("\n After Sort: ");
// 	for(i=0;i<n;i++)
// 	{
// 		printf("%5d",x[i]);
// 	}
// 	return 0;
// }

// -------------------------------------------------------------------------------------------------------

	// Searching Techniques

		// - linear Search: operated on any array
		// - Binary Search: operated on sorted Array


// enter the number present or not in array by using linerar 
#include<stdio.h>
#define SIZE 10;
int main()
{
     int x[SIZE],i,no,flg;
    printf("\n Enter the %d nos: ",SIZE);
	for(i=0;i<SIZE;i++)
	{
		scanf("%d",&x[i]);
	}
	printf("\n Enter the number to be searched: ");
	scanf("%d",&no);
	flg=0;
	for(i=0;i<SIZE;i++)
	{
		if(x[i]==no)
		{
			flg=1;
			break;
		}
	}
	if(flg==0)
	{
		printf("\n %d is not present in an Array",no);
	}
	else
	{
		printf("\n %d is present at %d position",no,i);
	}

     
    return 0;  
}