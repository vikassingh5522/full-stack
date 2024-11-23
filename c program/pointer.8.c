// Pointer:✅💡

// WAP to input percentage of marks of 10 students in HSC and display it.
// #include <stdio.h>
// int main()
// {
//     int i;
//     float m[10];
//     printf("\n Enter the percentage  10 of marks :");
//     for(i=0; i<10;i++)
//     {
//         scanf("%f", &m[i]);
//     }
//     printf("\n enter the list of student :");
//     for(i=0; i<10;i++)
//     {
//         printf("\n student %d - %0.2f ",i+1,m[i]);
//     }
// return 0;
// }

// WAP to input percentage of marks of N students in HSC and display it.
// #include<stdio.h>
// int main()
// {
//     int i,n;
//     float m[200];
//     printf("\n Enter the student count :");
//     scanf("%d",&n);
//     printf("\n Enter the percentage of student :");
//     for(i=0; i<n; i++)
//     {
//         scanf("%f", &m[i]);
//     }
//     printf("\n Enter the list :");
//     for(i=0; i<n; i++)
//     {
//         printf("\n student %d - %0.2f",i+1,m[i]);
//     }
//     return 0;
// }

// - In first way(array) will be used when you know the type and count🫡 of elements.
// - If you know the type but dont know the count, it will be decided at runtime then
//   you have two option.

// 	- decl an array with possible max size - problem🫡 is inefficient use of memory.
// 	- use pointer - will allocates the amount of memory needed.

// How to allocate the memory at runtime(Dynamic memory allocation).
// 	- In static allocation, type decl instruction allows you to assign an identifier to
// 	  allocated location.
// 	- In dynamic memory allocation, it will gives base address(begin byte number of allocated
// 	  location) in return, it will not allow you to assign an identifier to that location.
// 	- To allocate the memory, the builtin [ functions malloc(), calloc() or realloc() are used,
// 	  which are defined in stdlib.h/alloc.h]✅
// 	- we need to store that address, to store an address the special type of variable is needed,
// 	  called pointer.
// 	- Decl  syntax of pointer variable:
// 		<data_type> *<ptr_var_nm>;✅
// *mrk
//  [700] --------> [][][][][][][][][][][][][][][][][][][]
// 		           700

// Lets see about the size of pointer variable
// #include<stdio.h>
// int main()
// {
//     int *var;
//     char *ch;
//     float *fl;
//     double *dp;
//     printf("\n size of  int pointer : %d", sizeof(var));
//     printf("\n size of float pointer : %d", sizeof(fl));
//     printf("\n size of cahr pointer : %d", sizeof(ch));
//     printf("\n size of double pointer : %d", sizeof(dp));
//    return 0;
// }

// show the  addresh
// #include<stdio.h>
// int main()
// {
//     int x=10;
//     int *p;
//     p=&x;
//     printf("\n value of x=%d", x);
//     printf("\n address of x=%p", p);
//     printf("\n value of p=%d", p);
//     return 0;
// }

// now we have to access the value of x using p
// 	*p		x
// 	[800]--------->	[ 10 ]
//      		       800
// Meaning of *
// 	- In decl: pointer declarator
// 	- In expr: just replace it with "value at address"
//
// 	*p -> value at address p
// 	   --> value at address 800
// 	   ---> 10

// #include <stdio.h>
// int main()
// {
// 	int x=10;
// 	int *p;	// integer pointer (pointer to integer)
// 	p=&x;
// 	printf("\n value of x=%d",x);
// 	printf("\n Address of x=%u",&x);
// 	printf("\n value of p=%u",p);
// 	printf("\n value of x using p=%d",*p);
// 	return 0;
// }

// now we have to access the value of x using p

// **q		        *p		        x
//   [900]	------>	[800]--------->	[ 10 ]
// 	                  900		   800

// 	Meaning of *
// 		- In decl: pointer declarator
// 		- In expr: just replace it with "value at address"

// 		*p -> value at address p
// 		   --> value at address 800
// 		   ---> 10

// 		q -> 900

// 		*q -> value at address q
// 		   --> value at address 900
// 		   ---> 800

// 		**q => *(*q) -> value at address 800
// 			     --> 10

// #include <stdio.h>
// int main()
// {
//     int x = 10;
//     int *p;  // integer pointer (pointer to integer)
//     int **q; // pointer to pointer (pointer to integer pointer)
//     int ***r;
//     p = &x;
//     printf("\n value of x=%d", x);
//     printf("\n Address of x=%u", &x);
//     printf("\n value of p=%u", p);
//     printf("\n value of x using p=%d", *p);
//     q = &p;
//     printf("\n\n address of p: %u \t value of q: %u", &p, q);
//     printf("\n Value of p using q: %u", *q);
//     printf("\n Value of x using q: %d", **q);
//     return 0;
// }

// Now again it is confirmed that once we come to know about an address of location
// it is possible to access the value stored in that location.

// Now we know that in case of array,

// 	suppose

// 		int x[5]={12,67,9,765,34};

// 	     x___0_______1_____2______3_______4_
//  *p	|      |      |     |       |      |
//[500}>|  12  |  67  |  9  |  765  |  34  |
// 		|______|______|_____|_______|______|
//       500

// 		- x[i] gives the value at ith location
// 		- &x[i] gives address of ith location
// 		- x gives base address of an array (i.e. &x[0])

// #include<stdio.h>
// int main()
// {
// 	int i, x[5]={12,67,9,765,34};
//     printf("\n array element are :");
//     for(i=0;i<5;i++)
//     {
//         printf("%7d",x[i]);
//     }
//     printf("\n array element are:");
//     for(i=0;i<5;i++)
//     {
//         printf("%7d",x+i);
//     }
// }

//----------------------------------------------------------------------------------------------

// 🫡🫡🫡🫡🫡🫡🫡
// *===value
// * nhi to address

// we can access the elements using different ways as,
// #include <stdio.h>
// int main()
// {
// 	int x[5]={12,67,9,765,34};
//     	int i;
//     	int *p;
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("%7d",x[i]);
// 	}
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("\t %u",*(x+i));
// 	}
// 	p=x; /// or p=&x[0];
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("\t %u",*(p+i));
// 	}
// 	p=x; /// or p=&x[0];
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("\t %u",*p);
//         	p++;
// 	}
// 	p=x; /// or p=&x[0];
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("\t %u",p[i]);
// 	}
// 	return 0;
// }
// Lets Note that,

// x[i] <--> *(x+i) <--> *(p+i) <--> p[i]

// &x[i] <--> (x+i) <--> (p+i) <--> &p[i]

// ===============================================================================================================================

//---------------------------------- input and display---------------------------

// #include <stdio.h>
// int main()
// {
// 	int x[5],i;
// 	printf("\n enter elements: ");
// 	for(i=0;i<5;i++)
// 	{
// 		scanf("%d",(x+i));
// 	}
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("%7d",*(x+i));
// 	}
// 	return 0;
// }

// -------------------------------input and display - using pointer-----------------------------

// #include<stdio.h>
// int main()
// {
//     int x[5],i;
//     int *p;
//     p=x;
//     printf("\n enter the element :");
//     for(i=0;i<5;i++)
//     {
//         scanf("%d",p);
//         p++;
//     }
//     p=x;
//     printf("\n Array elements are: ");
//     for(i=0;i<5;i++)
//     {
//         printf("%5d",*p);
//         p++;
//     }
//     return 0;
// }

// Now again it is confirmed that once we come to know about an address of location

// it is possible to access the value stored in that location
// #include <stdio.h>
// #include <stdio.h>
// int main()
// {
// 	int x[5],i;
// 	int *p;
// 	p=x;
// 	printf("\n enter elements: ");
// 	for(i=0;i<5;i++)
// 	{
// 		scanf("%d",p);
// 		p++;
// 	}
// 	p=x;
// 	printf("\n Array elements are: ");
// 	for(i=0;i<5;i++)
// 	{
// 		printf("%7d",*p);
// 		p++;
// 	}
// 	return 0;
// }

//----------------------------------------------------------------------------------------------

// WAP to input and display the HSC percentage of N students.
// we need to allocate memory at runtime and for that use malloc()
// syntax:
// 	void* malloc(<no_of_bytes>)
// #include <stdio.h>
// #include <stdlib.h>
// int main()
// {
// 	float *ptr;
// 	int i,cnt;
// 	printf("\n Enter the student count: ");
// 	scanf("%d",&cnt);
// 	ptr=(float*)malloc(cnt*sizeof(float));
// 	printf("\n Enter the marks of %d students: ",cnt);
// 	for(i=0;i<cnt;i++)
// 	{
// 		printf("student %d: ",i+1);
// 		scanf("%f",(ptr+i));
// 	}
// 	printf("\n student list \n");
// 	for(i=0;i<cnt;i++)
// 	{
// 		printf("\n student %d - %0.2f",i+1,*(ptr+i));
// 	}
// 	return 0;
// }

//----------------------------------------------------------------------------------------------

// Enter N Number and find the avg of it.
// #include <stdio.h>
// #include <stdlib.h>
// int main()
// {
// 	int i, cont, total = 0;
// 	int *p;
// 	float avg;
// 	printf("\n Enter the element count : ");
// 	scanf("%d", &cont);
// 	p = (int *)malloc(cont * sizeof(int));
// 	printf("\n enter thr %d no's:", cont);
// 	for (i = 0; i < cont; i++)
// 	{
// 		scanf("%d", (p + i));
// 	}
// 	for (i = 0; i < cont; i++)
// 	{
// 		total = total + *(p + i);
// 	}
// 	avg = (float) total / cont;
// 	printf("\n tatal: %d", total);
// 	printf("\n avg %0.2f", avg);
// 	return 0;
// }

//----------------------------------------------------------------------------------------------

// Enter N Number and find the prime count.
// #include <stdio.h>
// #include <stdlib.h>
// int main()
// {
// 	int i,pcnt=0,n,flg,d;
// 	float avg;
// 	int *p;
// 	printf("\n Enter the element count: ");
// 	scanf("%d",&n);
// 	p=(int*)malloc(n*sizeof(int));
// 	printf("\n Enter the %d nos: ",n);
// 	for(i=0;i<n;i++)
// 	{
// 		scanf("%d",(p+i));
// 	}
// 	for(i=0;i<n;i++)
// 	{
// 		flg=0;
// 		d=2;
// 		while(d<=(*(p+i)/2))
// 		{
// 			if(*(p+i)%d==0)
// 			{
// 				flg=1;
// 				break;
// 			}
// 			d++;
// 		}
// 		if(flg==0)
// 		{
// 			pcnt++;
// 		}
// 	}
// 	printf("\n Prime Count: %d",pcnt);
// 	return 0;
// }

//----------------------------------------------------------------------------------------------

// Create two different collection of integers having N and M elements and find intersection.
// #include<stdio.h>
// #include<stdlib.h>
// int main()
// {
// 	int m,n ,i,j;
// 	int *p,*q;
// 	printf("\n Enter the first count :");
// 	scanf("%d",&m);
// 	p=(int*)malloc(m*sizeof(int));
// 	printf("\n Enter the %d elemets: ",m);
// 	for(i=0;i<m;i++)
// 	{
// 		scanf("%d",(p+i));
// 	}
// 	printf("\n Enter the second count :");
// 	scanf("%d",&n);
// 	q=(int*)malloc(m*sizeof(int));
// 	printf("\n Enter the %d element : ",n);
// 	for(i=0;i<n;i++)
// 	{
// 		scanf("%d",(q+i));
// 	}
// // intersection
// printf("\nthe intersection is:");
// for(i=0;i<m;i++)
// {
// 	for(j=0;j<n;j++)
// 	{
// 		if(*(p+i)==*(q+j))
// 		{
// 			printf("%2d",*(p+i));
// 		}
// 	}
// }
// 	return 0;
// }

//----------------------------------------------------------------------------------------------

// Enter the marks of 4 students and display them. note that every student may have different subject count ?
// #include<stdio.h>
// #include<stdlib.h>
// int main()
// {
// 	int* ap[4];
// 	int sc[4],i,j;
// 	printf("\n Enter the details of 4 students \n");
// 	for(i=0;i<4;i++)
// 	{
// 		printf("\n For student %d \n",i+1);
// 		printf("enter the subject count: ");
// 		scanf("%d",&sc[i]);
// 		ap[i]=(int*)malloc(sc[i]*sizeof(int));
// 		printf("\n Enter the marks obtaind in %d subjects",sc[i]);
// 		for(j=0;j<sc[i];j++)
// 		{
// 			printf("\n Subject %d: ",j+1);
// 			scanf("%d",*(ap+i)+j);
// 		}
// 	}
// 	printf("\n Student list with marks \n");
// 	for(i=0;i<4;i++)
// 	{
// 		printf("\n Student %d: ",i+1);
// 		for(j=0;j<sc[i];j++)
// 		{
// 			printf("%7d",*(*(ap+i)+j));
// 		}
// 	}
// 	return 0;
// }

// Implement selection sort using pointer
// #include<stdio.h>
// #include<stdlib.h>
// int main()
// {
// 	int *p;
// 	int i,j,n,tmp;
// 	printf("Enter the number of elements: ");
// 	scanf("%d",&n);
// 	p=(int*)malloc(n*sizeof(int));
// 	printf("\n enter no's %d:",n);
// 	for(i=0;i<n;i++)
// 	{
// 	   scanf("%d",(p+i));
// 	}
// 	printf("\n before sorting :");
// 	for(i=0;i<n;i++)
// 	{
// 		printf("%6d",*(p+i));
// 	}
// 	//sorting
// 	for(i=0;i<n;i++)
// 	{
// 		for(j=j+1;j<n;j++)
// 		{
// 			if(*(p+i)>*(p+j))
// 			{
// 				tmp=*(p+i);
// 				*(p+i)=*(p+j);
// 				*(p+j)=tmp;
// 			}
// 		}
// 	}
//     printf("\n after short :");
// 	for(i=0;i<n;i++)
// 	{
// 		printf("%6d",*(p+i));
// 	}
// 	return 0;
// }

// ----------------------------------------------------------------------------------------------------------

// pointer to pointer:

// enter marks of N students in M subjects (M may be different for every student)
// #include <stdio.h>
// #include <stdlib.h>
// int main()
// {
// 	int **p, *sub;
// 	int i, j, sc;
// 	printf("\n Enter student count: ");
// 	scanf("%d", &sc);
// 	p = (int **)malloc(sc * sizeof(int *));
// 	sub = (int *)malloc(sc * sizeof(int));
// 	printf("\n Enter the details of %d students\n", sc);
// 	for (i = 0; i < sc; i++)
// 	{
// 		printf("\n student %d: ", i + 1);
// 		printf("\n Enter the subject count: ");
// 		scanf("%d", (sub + i));
// 		*(p + i) = (int *)malloc(*(sub + i) * sizeof(int));
// 		printf("\n Enter the marks of %d subjects\n", *(sub + i));
// 		for (j = 0; j < *(sub + i); j++)
// 		{
// 			printf("\n sub %d: ", j + 1);
// 			scanf("%d", *(p + i) + j);
// 		}
// 	}
// 	printf("\n Details of %d students \n", sc);
// 	for (i = 0; i < sc; i++)
// 	{
// 		printf("\n Student %d: ", i + 1);
// 		for (j = 0; j < *(sub + i); j++)
// 		{
// 			printf("%7d", *(*(p + i) + j));
// 		}
// 		printf("\n");
// 	}
// 	return 0;
// }
// ----------------------------------------------------------------------------------------------------------------------------------------

