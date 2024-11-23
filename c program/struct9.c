// --------------------------------------------Structure------------------------------------------
// #include<stdio.h>
// struct Color
// {
// 	int r;
// 	int g;
// 	int b;
// };
// int main()
// {
// 	struct Color c1={11,56,89};
// 	printf("\n RGB value of Color:{%d,%d,%d}",c1.r,c1.g,c1.b);
// 	return 0;
// }

//-------------------------------------------------------------------------------------------------------
// #include <stdio.h>
// struct student
// {
//     int regno;
//     int rno;
//     char nm[50];
//     int age;
//     char gen;
//     float per;
// };
// int main()
// {
//     struct student c1 = {1122, 1248, "vikas singh", 28,'m', 88.7};
//     printf(" \n student details: regno :%d \t rno :%d \t nm:%s \t age: %d \t gen: %c \t  per: %lf \t", c1.regno, c1.rno, c1.nm, c1.age, c1.gen, c1.per);
//     return 0;
// }

// /--------------------------------------------------------------------------------------------------------------
// #include<stdio.h>
// struct  student
// {
//    int regno;
//    int no;
//    char name[50];
//    int age;
//    char gender;
//    float per;
// };
// int main()
// {
//      struct  student a1;
//      printf("\n Enter the regno and no of a student:");
//      scanf("%d %d",&a1.regno,&a1.no);
//      printf("\n enter the name:");
//      fflush(stdin);
//      gets(a1.name);
//      printf("\n enter the student age , gender,per:");
//      scanf("%d %c %f",&a1.age,&a1.gender,&a1.per);
//      printf("\n student detail : regno: %d \t, no: %d \t  name: %s \t age:%d \t  gender:%c \t per:%0.2f \t",a1.regno,a1.no,a1.name,a1.age,a1.gender,a1.per);
//      return 0;
// }

//---------------------------------------------------------------------------------------------------------------

// // WAP to input and display the information of 2 books name ,isbn nummber pricw and no of topic in book

// #include <stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// int main()
// {
// 	struct Book b1,b2;
// 	printf("\n Enter the name, isbn,price and topics for book 1: ");
// 	fflush(stdin);
// 	gets(b1.name);
// 	scanf("%d %f %d",&b1.isbn, &b1.price, &b1.not);

// 	printf("\n Enter the name, isbn,price and topics for book 2: ");
// 	fflush(stdin);
// 	gets(b2.name);
// 	scanf("%d %f %d",&b2.isbn, &b2.price, &b2.not);
// 	printf("\n Book 1: Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",b1.name,b1.isbn,b1.price,b1.not);
// 	printf("\n Book 2: Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",b2.name,b2.isbn,b2.price,b2.not);
// 	return 0;
// }

// -----------------------------------------------------------------------------------------------------------------

// passing structure variable to function
// #include<stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// void output (struct Book);
// int main()
// {
// 	struct Book b1,b2;
// 	printf("\n Enter the name, isbn,price and topics for book 1: ");
// 	fflush(stdin);
// 	gets(b1.name);
// 	scanf("%d %f %d",&b1.isbn, &b1.price, &b1.not);
// 	printf("\n Enter the name, isbn,price and topics for book 2: ");
// 	fflush(stdin);
// 	gets(b2.name);
// 	scanf("%d %f %d",&b2.isbn, &b2.price, &b2.not);
//     printf("\n book 1");
// 	output(b1);
// 	printf("\n book 2");
// 	output(b2);
// 	return 0;
// }
// void output (struct Book x)
// {
// 	printf("\n Book 1: Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",x.name,x.isbn,x.price,x.not);
// }

// ---------------------------------------------------------------------------------------------------------------

// Note that any variable, it may be variable of structure, passed by value to function
// so in above case, for input, either we have to return book info or we need to pass by ref.

// above program with return
// #include<stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// struct Book input(struct Book );
// void output (struct Book);
// int main()
// {
// 	struct Book b1,b2;
// 	b1=input(b1);
// 	b2=input(b2);
//     printf("\n book 1");
// 	output(b1);
// 	printf("\n book 2");
// 	output(b2);
// 	return 0;
// }
// struct Book input(struct Book a)
// {

// 	printf("\n Enter the name, isbn,price and topics for book 1: ");
// 	fflush(stdin);
// 	gets(a.name);
// 	scanf("%d %f %d",&a.isbn, &a.price, &a.not);
// 	return a;
// }
// void output (struct Book x)
// {
// 	printf("\n Book 1: Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",x.name,x.isbn,x.price,x.not);
// }

//--------------------------------------------------------------------------------------------------------------------------------
// Using pointer to structure variable

// when we use the pointer to structure variable, then use -> rather than .

// #include <stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not ;
// };
// void display(struct Book);
// void input(struct Book*);
// int main()
// {
// 	struct Book b1,b2;
//     input(&b1);
//     input(&b2);
// 	printf("\n Book 1:");
//     display(b1);
// 	printf("\n Book 2:");
//     display(b2);
// 	return 0;
// }
// void display(struct Book b)
// {
//     printf(" Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",b.name,b.isbn,b.price,b.not);
// }
// void input(struct Book *b)
// {
//     printf("\n Enter the name, isbn, price and topics for book : ");
// 	fflush(stdin);
// 	gets(b->name);
// 	scanf("%d %f %d",&b->isbn, &b->price, &b->not);
// }

// Note that &b.xxx gives address and b.xxx gives value✅
//  same as  &b->xxx and b->xxx resp. when we use pointer 🫡
// lets see,

// #include <stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// void display(struct Book*);
// void input(struct Book*);
// int main()
// {
// 	struct Book b1,b2;
//     input(&b1);
//     input(&b2);
// 	printf("\n Book 1:");
//     display(&b1);
// 	printf("\n Book 2:");
//     display(&b2);
// 	return 0;
// }
// void display(struct Book *b)
// {
//     printf(" Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",b->name,b->isbn,b->price,b->not);
// }
// void input(struct Book *b)
// {
//     printf("\n Enter the name, isbn, price and topics for book : ");
// 	fflush(stdin);
// 	gets(b->name);
// 	scanf("%d %f %d",&b->isbn, &b->price, &b->not);
// }

//-----------------------------------------------------------------------------------------------------
// Array of structure variables
// bk  0    1    2   3    4
// 	  [  ] [  ] [  ] [  ] [  ]

// 	here individual location is variable of Book Type, so we have to access location as

// 		- bk[i].xxx  for value
// 		- &bk[i].xxx for address

// WAP to input and display the info of 3 books
// #include <stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// int main()
// {
// 	struct Book bk[3];
// 	int i;
// 	for(i=0;i<3;i++)
// 	{
// 		printf("\n Enter the name, isbn, price and topics for book %d \n",i+1);
// 		gets(bk[i].name);
// 		scanf("%d %f %d",&bk[i].isbn, &bk[i].price, &bk[i].not);
// 	}
// 	printf("\n Book List \n");
// 	for(i=0;i<3;i++)
// 	{
// 		printf(" Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",bk[i].name,bk[i].isbn,bk[i].price,bk[i].not);
// 	}
// 	return 0;
// }

//-------------------------------------------------------------------------------------------------------------

// passing the array of structure variable to function
// #include <stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not ;
// };
// void input(struct Book a[3])
// {
// 	int i;
// 	for (i = 0; i < 3; i++)
// 	{
// 		printf("\n Enter the name, isbn, price and topics for book %d \n", i + 1);
// 		fflush(stdin);
// 		gets(a[i].name);
// 		scanf("%d %f %d", &a[i].isbn, &a[i].price, &a[i].not );
// 	}
// }
// void display(struct Book f[3])
// {
// 	int i;
// 	printf("\n Book List \n");
// 	for (i = 0; i < 3; i++)
// 	{
// 		printf("\n Book %d:  Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n", i + 1, f[i].name, f[i].isbn, f[i].price, f[i].not );
// 	}
// }
// void input(struct Book b[3]);
// void display(struct Book b[3]);
// int main()
// {
// 	struct Book bk[3];
// 	input(bk);
// 	display(bk);
// 	return 0;
// }

//-------------------------------------------------------------------------------------------------------------
// / passing the pointer structure variables to function

// 	// Enter the info. of N Books and display the list. (access using array notations)

// 	*bk
// 	 [  ] -----> [][][][]... cnt
// #include <stdio.h>
// #include <stdlib.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not ;
// };
// int main()
// {
// 	int count, i;
// 	struct Book *vs;
// 	printf("\n Enter the count :");
// 	scanf("%d", &count);
// 	vs = (struct Book *)malloc(count * sizeof(struct Book));
// 	// access using array notation
// 	for (i = 0; i < count; i++)
// 	{
// 		printf("\n Enter the name, isbn, price and topics for book %d \n", i + 1);
// 		fflush(stdin);
// 		gets(vs[i].name);
// 		scanf("%d %f %d", &vs[i].isbn, &vs[i].price, &vs[i].not );
// 	}
// 	printf("\n Book List \n");
// 	for (i = 0; i < count; i++)
// 	{
// 		printf(" Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n", vs[i].name, vs[i].isbn, vs[i].price, vs[i].not );
// 	}
// 	return 0;
// }

//------------------------------------------------------------------------------------------------------

// access using Pointer notations
// *bk
//  [300] -----> [][][][]... cnt
//              300

// bk:      300
// (bk+i):  address of ith location

// (bk+i)-> xxx   (value at ith location)
// &(bk+i)-> xxx   (Address of ith location)

// #include <stdio.h>
// #include <stdlib.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// int main()
// {
// 	int count,i;
// 	struct Book *bk;
// 	printf("\n Enter the book count :");
// 	scanf("%d",&count);
// 	bk=(struct Book*)malloc(count*sizeof(struct Book));
// 	for(i=0;i<count;i++)
// 	{
// 		printf("\n Enter the name isbn price Topic book %d:",i+1);
// 		fflush(stdin);
// 		gets((bk+i)->name);
// 		scanf("%d %f %d",&(bk+i)->isbn,&(bk+i)->price,&(bk+i)->not);
//    }
//     printf("\n Book list \n ");
// 	for(i=0; i<count; i++)
// 	{
// 		printf("Name: %s \t ISBN no: %d \n Price:%0.2f \t Topics: %d\n",(bk+i)->name,(bk+i)->isbn,(bk+i)->price,(bk+i)->not);
// 	}
// 	return 0;
// }

// -------------------------------------------------------------------------------------------------------------
// returning array
// #include <stdio.h>
// #include<stdlib.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// int cnt=0;
// void input(struct Book b[5])
// {
//     int i;
// 	for(i=0;i<3;i++)
// 	{
// 		printf("\n Enter the name, isbn, price and topics for book %d \n",i+1);
// 		fflush(stdin);
// 		gets(b[i].name);
// 		scanf("%d %f %d",&b[i].isbn, &b[i].price, &b[i].not);
// 	}
// }
// void display( struct Book b[5])
// {
//     int i;
//     printf("\n Book List \n");
// 	for(i=0;i<3;i++)
// 	{
// 		printf("\n Book %d:  Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",i+1, b[i].name,b[i].isbn,b[i].price,b[i].not);
// 	}
// }
// struct Book* getprocemaxthan100(struct Book b[5])
// {
// 	int i,j;
// 	static struct Book *t;
//     for(i=0;i<3;i++)
//     {
//         if(b[i].price>100)
//             cnt++;
//     }
//     t=(struct Book*)malloc(cnt*sizeof(struct Book));
// 	for(i=0,j=0;i<3;i++)
// 	{
// 	    if(b[i].price>100)
//             t[j++]=b[i];
// 	}
// 	return t;
// }
// int main()
// {
//     int i;
// 	struct Book bk[5];
// 	struct Book *p;

// 	input(bk);
//     display(bk);

// 	p=getprocemaxthan100(bk);
//     printf("\n\n Book List having price greater than 100 \n");
// 	for(i=0;i<cnt;i++)
// 	{
// 		printf("\n Book %d:  Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",i+1, (p+i)->name,(p+i)->isbn,(p+i)->price,(p+i)->not);
// 	}
// 	return 0;
// }
// ---------------------------------------------------------------------------------------------------

// returning pointer


// #include <stdio.h>
// struct Book
// {
// 	char name[50];
// 	int isbn;
// 	float price;
// 	int not;
// };
// int cnt=0;
// void input(struct Book b[3])
// {
//     int i;
// 	for(i=0;i<3;i++)
// 	{
// 		printf("\n Enter the name, isbn, price and topics for book %d \n",i+1);
// 		fflush(stdin);
// 		gets(b[i].name);
// 		scanf("%d %f %d",&b[i].isbn, &b[i].price, &b[i].not);
// 	}
// }
// void display( struct Book b[3])
// {
//     int i;
//     printf("\n Book List \n");
// 	for(i=0;i<3;i++)
// 	{
// 		printf("\n Book %d:  Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",i+1, b[i].name,b[i].isbn,b[i].price,b[i].not);
// 	}
// }
// struct Book* getprocemaxthan100(struct Book b[3])
// {
// 	int i,j;
// 	static struct Book *t;
//     for(i=0;i<3;i++)
//     {
//         if(b[i].price>100)
//             cnt++;
//     }
//     t=(struct Book*)malloc(cnt*sizeof(struct Book));
// 	for(i=0,j=0;i<3;i++)
// 	{
// 	    if(b[i].price>100)
//             t[j++]=b[i];
// 	}
// 	return t;
// }
// int main()
// {
//     int i;
// 	struct Book bk[3];
// 	struct Book *p;

// 	input(bk);
//     display(bk);

// 	p=getprocemaxthan100(bk);
//     printf("\n\n Book List having price greater than 100 \n");
// 	for(i=0;i<cnt;i++)
// 	{
// 		printf("\n Book %d:  Name: %s \t ISBN NO: %d \n Price: %0.2f \t Topics: %d\n",i+1, (p+i)->name,(p+i)->isbn,(p+i)->price,(p+i)->not);
// 	}
// 	return 0;
// }

// //--------------------------------------------------------------------------------------------

// 	//  Array as a member of structure

// struct student
// {
// 	int rno;
// 	int mrk[3];
// 	float per;
// };

// int main()
// {
// 	// variable
// 	int i,tot=0;
// 	struct student s;

// 	printf("\n Enter the student details");
// 	printf("\n Enter the rno: ");
// 	scanf("%d",&s.rno);
// 	printf("\n Enter the marks in 3 subjects: ");
// 	for(i=0;i<3;i++)
// 	{
// 		scanf("%d",&s.mrk[i]);
// 		tot=tot+s.mrk[i];
// 	}
// 	s.per=tot/3.0;

// 	printf("\n --------- Student Details --------- \n");
// 	printf("RNO: %d \t Percentage: %0.2f",s.rno,s.per);
// 	printf("\n Marks: ");
// 	for(i=0;i<3;i++)
// 	{
// 		printf("%5d",s.mrk[i]);
// 	}
// 	return 0;
// }

// //-----------------------------------------------------------------------------------------------

// 	/// array of structure variables when array as a member

// #include <stdio.h>
// struct student
// {
// 	int rno;
// 	int mrk[3];
// 	float per;
// };

// int main()
// {
// 	// variable
// 	int i,j,tot;
// 	struct student s[2];

// 	printf("\n Enter the student details");
// 	for(i=0;i<2;i++)
// 	{
// 		printf("\n Enter the rno of student %d: ",i+1);
// 		scanf("%d",&s[i].rno);
// 		printf("\n Enter the marks in 3 subjects: ");
// 		tot=0;
// 		for(j=0;j<3;j++)
// 		{
// 			scanf("%d",&s[i].mrk[j]);
// 			tot=tot+s[i].mrk[j];
// 		}
// 		s[i].per=tot/3.0;
// 	}
// 	printf("\n --------- Student Details --------- \n");
// 	printf("\n Enter the student details");
// 	for(i=0;i<2;i++)
// 	{
// 		printf("\n\n student %d: \nRNO: %d \t Percentage: %0.2f",i+1,s[i].rno,s[i].per);
// 		printf("\n Marks: ");
// 		for(j=0;j<3;j++)
// 		{
// 			printf("%5d",s[i].mrk[j]);
// 		}
// 	}
// 	return 0;
// }

// //-----------------------------------------------------------------------------------------------

// 	/// pointer to structure variables when array as a member.

// ///-----------------------------------------------------------------------------------------------

// 	// Implementation of stacks using structure
	
// #include <stdio.h>
// #define SIZE 5
// struct stack
// {
// 	int ar[SIZE];
// 	int top;
// };
// int main()
// {
// 	struct stack s1,s2;
// 	int opt;

// 	s1.top=-1;
// 	s2.top=-1;
// 	while(1)
// 	{
// 		printf("\n ------------- Menu ------------\n");
// 		printf("\n 1.Push \n 2.pop \n 3.stop");
// 		printf("\n Enter your option: ");
// 		scanf("%d",&opt);
// 		switch(opt)
// 		{
// 			case 1:
// 				printf("\n choose 1 for stack1 and 2 for stack2: ");
// 				scanf("%d",&opt);
// 				if(opt==1)
// 				{
// 					if(s1.top<(SIZE-1))
// 					{
// 						printf("\n Enter the number: ");
// 						s1.top++;
// 						scanf("%d",&s1.ar[s1.top]);
// 					}
// 					else
// 					{
// 						printf("\n Stack is Full");
// 					}
// 				}
// 				if(opt==2)
// 				{
// 					if(s2.top<(SIZE-1))
// 					{
// 						printf("\n Enter the number: ");
// 						s2.top++;
// 						scanf("%d",&s2.ar[s2.top]);
// 					}
// 					else
// 					{
// 						printf("\n Stack is Full");
// 					}
// 				}
// 				break;
// 			case 2:
// 				printf("\n choose 1 for stack1 and 2 for stack2: ");
// 				scanf("%d",&opt);
// 				if(opt==1)
// 				{
// 					if(s1.top!=-1)
// 					{
// 						printf("After pop operation: %d",s1.ar[s1.top]);
// 						s1.top--;
// 					}
// 					else
// 					{
// 						printf("\n Stack is empty");
// 					}
// 				}
// 				if(opt==2)
// 				{
// 					if(s2.top!=-1)
// 					{
// 						printf("After pop operation: %d",s2.ar[s2.top]);
// 						s2.top--;
// 					}
// 					else
// 					{
// 						printf("\n Stack is empty");
// 					}
// 				}
// 				break;
// 			case 3:
// 				exit(0);
// 			default:
// 				printf("\n Incorrect Option");
// 		}
// 	}
// }

// //----------------------------------------------------------------------------------------------

// 	/// variable structure variables when pointer as a member.
// 	/// Array of structure variables when pointer as a member.
// 	/// pointer to structure variables when pointer as a member.

// //----------------------------------------------------------------------------------------------

// 	// variable of another structure as a member of structure

// #include <stdio.h>
// #include <stdio.h>
// struct Date
// {
//     int dd;
//     int mm;
//     int yyyy;
// };
// struct student
// {
// 	int rno;
//     struct Date exdt;
// 	int mrk[3];
// 	float per;
// };

// int main()
// {
// 	int i,j,tot;
// 	struct student s[2];

// 	printf("\n Enter the student details");
// 	for(i=0;i<2;i++)
// 	{
// 		printf("\n Enter the rno of student %d: ",i+1);
// 		scanf("%d",&s[i].rno);
// 		printf("\n Enter the Exam Date: ");
// 		scanf("%d %d %d",&s[i].exdt.dd, &s[i].exdt.mm, &s[i].exdt.yyyy );
// 		printf("\n Enter the marks in 3 subjects: ");
// 		tot=0;
// 		for(j=0;j<3;j++)
// 		{
// 			scanf("%d",&s[i].mrk[j]);
// 			tot=tot+s[i].mrk[j];
// 		}
// 		s[i].per=tot/3.0;
// 	}
// 	printf("\n --------- Student Details --------- \n");
// 	printf("\n Enter the student details");
// 	for(i=0;i<2;i++)
// 	{
// 		printf("\n\n student %d: \nRNO: %d \t Percentage: %0.2f",i+1,s[i].rno,s[i].per);
// 		printf("\n Exam Date: %d-%d-%d",s[i].exdt.dd, s[i].exdt.mm, s[i].exdt.yyyy);
// 		printf("\n Marks: ");
// 		for(j=0;j<3;j++)
// 		{
// 			printf("%5d",s[i].mrk[j]);
// 		}
// 	}
// 	return 0;
// }

// //--------------------------------------------------------------------------------------------

// 	// variable and pointer of structure when variable of another structure as a member of structure
// 	// variable, array and pointer of structure when array/pointer of another structure as a member of structure

// //---------------------------------------------------------------------------------------------

// 	// self referable structure

// #include<stdio.h>
// struct student
// {
// 	int altno;
// 	float hsc;
// 	float cet;
// 	struct student *next;
// };
// void main()
// {
// 	struct student *start, *last, *tmp;
// 	int opt;
// 	start=NULL;
// 	while(1)
// 	{
// 		printf("\n ---------- Menu ----------\n");
// 		printf("\n 1.Insert \n 2.Display \n 3.Stop");
// 		printf("\n Select your option: ");
// 		scanf("%d",&opt);

// 		switch(opt)
// 		{
// 			case 1:
// 				tmp=(struct student*)malloc(sizeof(struct student));
// 				printf("\n Enter the alt no, hsc percentage and cet marks of student: ");
// 				scanf("%d %f %f",&tmp->altno,&tmp->hsc,&tmp->cet);
// 				tmp->next=NULL;
// 				if(start==NULL)
// 				{
// 					start=tmp;
// 					last=tmp;
// 				}
// 				else
// 				{
// 					last->next=tmp;
// 					last=tmp;
// 				}
// 				break;
// 			case 2:
// 				tmp=start;
// 				while(tmp)
// 				{
// 					printf("\n Alt No: %d \t HSC Marks: %0.2f \t CET Marks: %0.2f",tmp->altno,tmp->hsc,tmp->cet);
// 					tmp=tmp->next;
// 				}
// 				break;
// 			case 3:
// 				exit(0);
// 			default:
// 				printf("\n Incorrect Option...!!!");
// 		}

// 	}
// }


// //------------------------------------------------------------------------------------------------------------------------------
	
// 	// Implementing (insert-HW) and Delete Operations

// #include<stdio.h>
// #include<stdlib.h>
// struct Node
// {
// 	int data;
// 	struct Node *next;
// };
// int main()
// {
// 	struct Node *start, *last, *tmp, *t;
// 	int i, opt,cnt=0,pos, val;
// 	start=NULL;
// 	while(1)
// 	{
// 		printf("\n ======= Menu ======== \n");
// 		printf("\n 1.insert \n 2.delete \n 3.display \n 4.stop");

//         printf("\n select your option: ");
// 		scanf("%d",&opt);
// 		switch(opt)
// 		{
// 			case 1:
// 				tmp=(struct Node*)malloc(sizeof(struct Node));
// 				printf("\n Enter the Data: ");
// 				scanf("%d",&tmp->data);
// 				tmp->next=NULL;
// 				if(start==NULL)
// 				{
// 					start=tmp;
// 					last=tmp;
// 				}
// 				else
// 				{
// 					last->next=tmp;
// 					last=tmp;
// 				}
// 				cnt++;
// 				break;
//             case 2:
//                     printf("\n ---- Sub-Menu ----\n");
//                     printf("\n 1.Delete From Start \n 2.From Last \n 3.From Position \n 4.using Value");
//                     printf("\n select option: ");
//                     scanf("%d",&opt);
//                     if(opt==1)
//                     {
//                         tmp=start;
//                         start=tmp->next; // start=start->next;
//                         free(tmp);
//                         cnt--;
//                     }
//                     else if(opt==2)
//                     {
//                         tmp=start;
//                         while(tmp->next!=last)
//                         {
//                             tmp=tmp->next;
//                         }
//                         tmp->next=NULL;
//                         free(last);
//                         last=tmp;

//                         cnt--;
//                     }
//                     else if(opt==3)
//                     {
//                         printf("\n Enter the Node Position: ");
//                         scanf("%d",&pos);
//                         if(pos>cnt)
//                         {
//                             printf("\n Improper Position");
//                         }
//                         else
//                         {
//                             if(pos==1)
//                             {
//                                 tmp=start;
//                                 start=tmp->next; // start=start->next;
//                                 free(tmp);
//                             }
//                             else if(pos==cnt)
//                             {
//                                 tmp=start;
//                                 while(tmp->next!=last)
//                                 {
//                                     tmp=tmp->next;
//                                 }
//                                 tmp->next=NULL;
//                                 free(last);
//                                 last=tmp;
//                             }
//                             else
//                             {
//                                 tmp=start;
//                                 i=1;
//                                 while(i<(pos-1))
//                                 {
//                                     tmp=tmp->next;
//                                     i++;
//                                 }
//                                 t=tmp->next;
//                                 tmp->next=t->next;
//                                 free(t);
//                             }
//                         }
//                         cnt--;
//                     }
//                     else if(opt==4)
//                     {
//                         printf("\n Enter the value: ");
//                         scanf("%d",&val);
//                         if(start->data==val)
//                         {
//                                 tmp=start;
//                                 start=tmp->next; // start=start->next;
//                                 free(tmp);
//                         }
//                         else if(last->data==val)
//                         {
//                                 tmp=start;
//                                 while(tmp->next!=last)
//                                 {
//                                     tmp=tmp->next;
//                                 }
//                                 tmp->next=NULL;
//                                 free(last);
//                                 last=tmp;
//                         }
//                         else
//                         {
//                             tmp=start;
//                             while(tmp->data!=val)
//                             {
//                                 t=tmp;
//                                 tmp=tmp->next;
//                             }
//                             t->next=tmp->next;
//                             free(tmp);
//                         }
//                         cnt--;
//                     }
//                     else
//                     {
//                         printf("\n Incorrect Option: ");
//                     }
//                 break;
// 			case 3:
// 			    printf("\n Node Count: %d\n",cnt);
// 				tmp=start;
// 				while(tmp)
// 				{
// 					printf("%7d",tmp->data);
// 					tmp=tmp->next;
// 				}
// 				break;
// 			case 4:
// 				exit(0);
// 			default:
// 				printf("\n Incorrect Option...!!!");
// 		}
// 	}
// 	return 0;
// }















