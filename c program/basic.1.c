#include <stdio.h>
int main()
{
	// 1 pro
	//  int y= 450;
	//  char ch = ' V ';
	//  float ft = 5.62;
	//  double db = 45.454545;
	//  printf("\n vlaueof y :%d", y);
	//  printf("\n ch=%c \t ft=%5.62f  \n val of db %lf", ch,ft,db);

	// 2 pro
	//   {
	//     it x;
	//     char ch;
	//     float ft;
	//     double db;
	//     printf("\n Enter one character,integer and two fractional values: ");
	//     scanf("%c %d %f %lf",&ch,&x,&ft,&db);
	//     printf("\n value of x is: %d",x);
	//     printf("\n ch=%c \t ft=%0.3f \n Val of db is %lf",ch,ft,db);n
	//     return 0;
	// }
	// {
	//     int x;
	//     char ch;
	//     float ft;
	//     double db;
	//     printf("\n Enter one integer and two fractional values: ");
	//     scanf("%d %f %lf",&x,&ft,&db);
	//     printf("\n Enter the character: ");
	//     fflush(stdin); // Try to run with and without this instruction
	//     scanf("%c",&ch);
	//     printf("\n value of x is: %d",x);
	//     printf("\n ch=%c \t ft=%0.2f \n Val of db is %lf",ch,ft,db);
	//     return 0;
	// }

	// 3 pro
	// int a, b , tem;
	// printf("\n enter the any 2 number:");
	// scanf("%d %d", &a ,&b);
	// printf(" \n brfore interchange a=%d  &&  b=%d", a,b);
	// tem=a;
	// a=b;
	// b=tem;
	// printf("\n after interchange value 0f a=% &&  b=%d", a,b);

	// 4 pro
	// int c1, c2, c3, tem;
	// printf("\n enter the any 3 char:");
	// scanf("%c %c %c", &c1, &c2, &c3);
	// printf("\n char are : %c ,%c, %c", c1, c2, c3);
	// tem = c3;
	// c3 = c2;
	// c2 = c1;
	// c1 = tem;
	// printf("\n char is revers maaner %c %c %c", c1, c2, c3);

	// 5 pro
	// int x, y;
	// printf("\n enter the any 2 number: ");
	// scanf("%d %d", &x, &y);
	// printf("\n before interchange value of x:%d and y:%d", x,y);
	// x = x + y;
	// y = x - y;
	// x = x - y;
	// printf("\n After Interchange Values of x: %d and y: %d", x, y);

	//  6 pro
	// {
	// 	int x=4,y=9,z;
	// 	z=-x;
	// 	printf("\n x=%d \t y=%d \t z=%d",x,y,z); // 4 9 -4
	// 	x++;
	// 	--y;
	// 	printf("\n x=%d \t y=%d \t z=%d",x,y,z); // 5 8 -4
	// 	z = ++x + y-- ;
	// 	printf("\n x=%d \t y=%d \t z=%d",x,y,z); // 6  7  14
	// 	return 0;
	// }

	// 7 pro
	// {
	// 	int x = 13, y = 5;
	// 	float z;
	// 	z = x / y;
	// 	printf("\n z is %f", z);
	// 	// to get the correct ans, we should convert any one or both N/D to float
	// 	// only at the time of calculation and which is done by type casting as shown
	// 	z = (float)x / y;
	// 	printf("\n z is %f", z);
	// 	z = x / (float)y;
	// 	printf("\n z is %f", z);
	// 	z = (float)x / (float)y;
	// 	printf("\n z is %f", z);
	// }

	// 8 pro
	// {
	// 	int x, y;
	// 	float z, ans;
	// 	printf("\n enter the any 2 nummber ");
	// 	scanf("%d %d ", &x, &y);
	// 	z = ((float)y / 2 * 10);
	// 	ans = (x * x * x) - z;
	// 	printf("\n ans is %f", ans);
	// }

	// 9 pro
	//    formula: 	si = ( p * r * n ) / 100 ;
	// int p, n;
	// float si, r;
	// printf("\n enter the values of p r and n: ");
	// scanf("%d %f %d", &p, &r, &n);
	// si = (p * r * n) / 100;
	// printf("\n si is: %f", si);

	// 10pro
	// float cesius, fehrenhite;
	// printf("Enter the temp in fehrenhite: ");
	// scanf("%f", &fehrenhite);
	// cesius = (fehrenhite - 32) / 1.8;
	// printf("temp in cesius is: %f", cesius);

	// 11pro
	//  int no,rem,sum=0;
	//  printf("\n enter the any 3 digit no: ");
	//  scanf("%d",&no);
	//  rem=no%10;
	//  sum=sum+rem;
	//  no=no/10;
	//  rem=no%10;
	//  sum=sum+rem;
	//  no=no/10;
	//  rem=no%10;
	//  sum=sum+rem;
	//  no=no/10;
	//  printf("\n additiol pf all digits:%d",sum);

	// 12 pro
	// int no,rem,rev=0;
	// printf("\n Enter any 3 digit number: ");
	// scanf("%d",&no); // 148
	// rem=no%10; // 8
	// rev=(rev*10)+rem; // 8
	// no=no/10; //14
	// rem=no%10; // 4
	// rev=(rev*10)+rem; // 84
	// no=no/10; // 1
	// rem=no%10; // 1
	// rev=(rev*10)+rem; //841
	// no=no/10; // 0
	// printf("\n Reverse Number is: %d",rev);

	// 13 pro
	// int x = 4, y = 12;
	// int ans;
	// ans = (x > y);
	// printf("\n Ans of (x>y) is %d", ans);
	// ans = (x != y);
	// printf("\n Ans of (x!=y) is %d", ans);
	// printf("\n (x%%2==0) is %d", (x % 2 == 0));
	// printf("\n y>x is %d", (y > x));
	// printf("\n (x==y) is %d ", (x == y));

	// 14 pro
	// int x=4,y=12;
	// int z;
	// printf("\n (x>y)&&(y<100) is %d",(x>y)&&(y<100)); //0
	// printf("\n (x!=y)&&(y<100) is %d",(x!=y)&&(y<100)); //1
	// printf("\n\n (x>y)||(y<100) is %d",(x>y)||(y<100)); //1
	// printf("\n (x>y)||(y<10) is %d",(x>y)||(y<10)); //0
	// printf("\n\n !(x%%2==0) is %d",!(x%2==0)); //0
	// printf("\n !(y%%5==0) is %d",!(y%5==0)); //1

	// 15 pro
	//  int n1,n2;
	// printf("\n Enter any two nos: ");
	// scanf("%d %d",&n1,&n2);
	// (n1>n2) ?
	// printf("\n n1: %d is max",n1):
	// printf("\n n2: %d is max",n2) ;

	// 16pro
	// int n1, n2, mx;
	// printf("\n Enter any two nos: ");
	// scanf("%d %d", &n1, &n2);
	// mx = (n1 > n2) ? n1 : n2;
	// printf("\n Max Number: %d", mx);

	// 17 pro
	// float a, b, c, tot, dis;
	// printf("\n Enter the price of 3 items: ");
	// scanf("%f %f %f", &a, &b, &c);
	// tot = a + b + c;
	// (tot > 1000) ? (dis = tot * 0.07) : (dis = tot * 0.03);
	// printf("\n Total Bill: %0.2f", tot);
	// printf("\n Discount: %0.2f", dis);
	// printf("\n Pay Rs: %0.2f", (tot - dis));

	// 18pro
	// int no;
	// printf("\n Enter any number: ");
	// scanf("%d",&no);
	// if(no%2==0)
	// {
	// 	printf("\n no: %d is even",no);
	// }
	// if(no%2!=0)
	// {
	// 	printf("\n no: %d is odd",no);
	// }

	// 19 pro
	// float p1,p2,p3,tot,dis=0.0;
	// printf("\n Enter the price of 3 items: ");
	// scanf("%f %f %f",&p1,&p2,&p3);
	// tot=p1+p2+p3;
	// if(tot>500)
	// {
	//     dis=tot*0.07;
	// }
	// printf("\n Total Bill: %f",tot);
	// printf("\n Discount: %f",dis);
	// printf("\n Pay Rs: %0.2f",(tot-dis));

	// 20 pro
	//    int no;
	// 	printf("\n Emter the no: ");
	// 	scanf("%d",&no);
	// 	if(no%2==0)
	// 	{
	// 		printf("\n No: %d is Even",no);
	// 	}
	// 	else
	// 	{
	// 		printf("\n No: %d is Odd",no);
	// 	}

	// 21 pro
	// float p1,p2,p3,tot,dis=0.0;
	// printf("\n Enter the price of 3 items: ");
	// scanf("%f %f %f",&p1,&p2,&p3);
	// tot=p1+p2+p3;
	// if(tot>500)
	// {
	//     printf("Discount is 7%%");
	//     dis=tot*0.07;
	// }
	// else
	// {
	//     printf("Discount is 3%%");
	//     dis=tot*0.03;
	// }
	// printf("\n Total Bill: %f",tot);
	// printf("\n Discount: %f",dis);
	// printf("\n Pay Rs: %0.2f",(tot-dis));

	// 22 pro
	// int no, ans;
	// printf("\n Enter the number: ");
	// scanf("%d", &no);
	// if (no < 10)
	// {
	// 	printf("\n Number is less than 10");
	// 	ans = no * 5;
	// }
	// else
	// {
	// 	printf("\n Number is not less than 10");
	// 	ans = no - 100;
	// }
	// printf("\n Result is: %d", ans);

	// 23 pro
	//  int p,c,m,tot;
	//  float per;
	//  printf("\n Enter the marks obtained in phy, chem and maths: ");
	//  scanf("%d %d %d",&p,&c,&m);
	//  if(p>=35 && c>=35 && m>=35)
	//  {
	//  	tot=p+c+m;
	//  	per=tot/3.0;
	//  	printf("\n Student Result: Pass \n PCM Total: %d \t Percentage: %f",tot,per);
	//  }
	//  else
	//  {
	//  	printf("\n Student Result: Fail");
	//  }

	// 24 pro
	//    int n1,n2,n3;
	// 	printf("\n Enter any 3 nos: ");
	// 	scanf("%d %d %d",&n1,&n2,&n3);
	// 	if(n1>n2)
	// 	{
	// 		if(n1>n3)
	// 		{
	// 			printf("\n N1: %d is max",n1);
	// 		}
	// 		else
	// 		{
	// 			printf("\n N3: %d is max",n3);
	// 		}
	// 	}
	// 	else
	// 	{
	// 		if(n2>n3)
	// 		{
	// 			printf("\n N2: %d is max",n2);
	// 		}
	// 		else
	// 		{
	// 			printf("\n N3: %d is Max",n3);
	// 		}
	// 	}

	// 25 pro
	//    int no;
	//     printf("\nEnter the no: ");
	//     scanf("%d",&no);
	//     if(no%3==0)
	//     {
	//         if(no%5==0)
	//         {
	//             printf("\n No is div by Both 3 and 5");
	//         }
	//         else
	//         {
	//             printf("\n No is div by 3 only");
	//         }
	//     }
	//     else
	//     {
	//         if(no%5==0)
	//         {
	//             printf("\n No is div by 5 only");
	//         }
	//         else
	//         {
	//             printf("\n No is not div by both 3 and 5");
	//         }
	//     }

	// 26 pro
	// char ch;
	// printf("\n Enter any character: ");
	// scanf("%c", &ch);
	// if (ch >= 'A' && ch <= 'Z') //  if(ch>=65 && ch<=90)
	// {
	// 	printf("\n Entered character is: UCASE");
	// }
	// else
	// {
	// 	if (ch >= 'a' && ch <= 'z')
	// 	{
	// 		printf("\n Entered character is: LCASE");
	// 	}
	// 	else
	// 	{
	// 		if (ch >= '0' && ch <= '9')
	// 		{
	// 			printf("\n Entered character is: DIGIT");
	// 		}
	// 		else
	// 		{
	// 			printf("\n Entered character is: SPECIAL SYMBOL");
	// 		}
	// 	}
	// }

	// 27 PRO
	// int x, y;
	// printf("\n Enter the co-ordinates : ");
	// scanf("%d %d", &x, &y);
	// if (x > 0 && y > 0)
	// {
	// 	printf("\n The point (%d,%d) lies in first quadrant", x, y);
	// }
	// else if (x < 0 && y > 0)
	// {
	// 	printf("\n The point (%d,%d) lies in second quadrant", x, y);
	// }
	// else if (x < 0 && y < 0)
	// {
	// 	printf("\n The point (%d,%d) lies in third quadrant", x, y);
	// }
	// else if (x > 0 && y < 0)
	// {
	// 	printf("\n The point (%d,%d) lies in fourth quadrant", x, y);
	// }
	// else if(x==0 && y==0)
	// {
	// 	printf("\n The point (%d,%d) lies on origin", x, y);
	// }
	// else if ( x!=0 && y==0)
	// {
	// 	printf("\n point is present on x axis");
	// }
	// else
	// {
	// 	printf("\n point is present on y axis");
	// }

	// 28 pro
	// int no, opt;
	// printf("\n Enter any number: ");
	// scanf("%d", &no);
	// printf("\n --------- Menu --------\n");
	// printf("\nCheck the no is positive or negative \t check no is div by 5 or not:");
	// printf("\n select the option");
	// scanf("%d", &opt);
	// if (opt == 1)
	// {
	// 	if (no == 0)
	// 	{
	// 		printf("\n number is zero");
	// 	}
	// 	else
	// 	{
	// 		if (no >= 0)
	// 		{
	// 			printf("\n it is postive number ");
	// 		}
	// 		else
	// 		{
	// 			printf("\n it negative number ");
	// 		}
	// 	}
	// }
	// else if (opt == 2)
	// {
	// 	if (no % 5 == 0)
	// 	{
	// 		printf("\n number is div by 5");
	// 	}
	// 	else
	// 	{
	// 		printf("\n number is not div by 5");
	// 	}
	// }
	// else{
	// 	printf("\n incorrect option");
	// }

	// 29 pro
	// char ch;
	// printf("\n Enter the character: ");
	// ch = getchar();
	// if (ch >= 65 && ch <= 90)
	// {
	// 	printf("Entered character: UCASE");
	// }
	// else if (ch >= 97 && ch <= 122)
	// {
	// 	printf("Entered character: LCASE");
	// }
	// else if (ch >= 48 && ch <= 57)
	// {
	// 	printf("Entered character: DIGIT");
	// }
	// else
	// {
	// 	printf("Entered character: Special Symbol");
	// }

	// 30 pro
	// int sal;
	// printf("\n Enter the salary: ");
	// scanf("%d", &sal);
	// if (sal < 1000)
	// {
	// 	printf("\n it is worker");
	// }
	// else if (sal < 3000)
	// {
	// 	printf("\n it is sr");
	// }
	// else if (sal < 5000)
	// {
	// 	printf("\n it is dr");
	// }
	// else if (sal < 7000)
	// {
	// 	printf("\n it is jr");
	// }
	// else if ("\n <8000")
	// {
	// 	printf("\n it is hr");
	// }
	// else
	// {
	// 	printf("it is ceo");
	// }

	// 31 pro  lop
	//   int i;
	//   for(i=0;i<=10; i++)
	//   {
	//  	printf("\n love u");
	//   }
	// int t;
	// for (t = 50; t < 75; t = t + 5)
	// {
	// 	printf("\n Hello");
	// }
	// printf("\n End of loop");

	// 32pro
	// int i;
	// for(i=5;i>0;i--)
	// {
	//     printf("\n Hello");
	// }
	// printf("\n End of loop");

	// 33 pro
	//  int no;
	//  printf("\n List Of Multi. of 3 and 5 From 1-100:");
	//  for(no=1;no<=100;no++)
	//  {
	//      if(no%3==0 && no%5==0)
	//      {
	//          printf("%6d",no);
	//      }
	//  }
	//  printf("\n End of program");

	// 34 pro
	// int i,no,sum=0;
	// for(i=0;i<5;i++)
	// {
	//    printf("\n Enter No: ");
	//     scanf("%d",&no);
	//     sum=sum+no;
	// }
	// printf("\n Addition is: %d",sum);

	// 35pro
	//    int no,rem,sum;
	//     printf("\n Enter any no: ");
	//     scanf("%d",&no);
	//     for( sum=0 ;no!=0; no=no/10 )
	//     {
	//         rem=no%10;
	//         sum=sum+rem;
	//     }
	//     printf("\n Addition of all digits: %d",sum);

	// 36pro
	//  int no,cont,rem;
	//  printf("\n Enter any no: ");
	//  scanf("%d",&no);
	//  for (cont=0; no!=0;no=no/10)
	//  {
	// 	rem=no%10;
	// 	if(rem%2==0)
	// 	{
	// 		cont++;
	// 	}
	//  }
	//  printf("\n Count of even digits: %d",cont);

	// 37pro
	// 	int no,max,rem;
	// 	printf("\n Enter any no: ");
	// 	scanf("%d",&no);
	// 	for(max=0; no>0; no=no/10)
	// 	{
	// 		rem=no%10;
	// 		if(rem>max)
	// 		{
	// 			max=rem;
	// 		}
	// 	}
	//    printf("\n max digit is %d", max);

	// 38pro
	// int no, rem, es, os;
	// printf("\n Enter the no: ");
	// scanf("%d", &no);
	// for (es = 0, os = 0; no != 0 ; no = no / 10)
	// {
	// 	rem = no % 10;
	// 	if (rem % 2 == 0)
	// 	{
	// 		es = es + rem;
	// 	}
	// 	else
	// 	{
	// 		os = os + rem;
	// 	}
	// }
	// printf("\n Even Sum: %d \t Odd Sum: %d", es, os);

	// 39pro
	//  int no,s1,s2,flg=0,rem;
	//  printf("\n Enter the any no: ");
	//  scanf("%d",&no);
	//  for(s1=0,s2=0;no!=0;no=no/10)
	//  {
	//  	rem=no%10;
	//  	if(flg==0)
	//  	{
	//  		s1=s1+rem;
	//  		flg=1;
	//  	}
	//  	else
	//  	{
	//  		s2=s2+rem;
	//  		flg=0;
	//  	}
	//  }
	//  printf("\n Sum of first digit: %d \t Sum of second digit: %d",s1,s2);

	// 40pro while
	//    int k;
	//    printf("\n list of num 1 to 10 no's ");
	//    k=1;
	//    while (k<=10)
	//    {
	// 	printf("\n %d",k);
	// 	k++;
	//    }

	//  41
	// int no, m, i, ans;
	// printf("\n Enter the any no: ");
	// scanf("%d", &no);
	// i = 0;
	// m = 1;
	// while (i < 12)
	// {
	// 	ans = no * m;
	// 	m++;
	// 	printf("\n %d", ans);
	// 	i++;
	// }

	// 42
	//    int no,fact,i;
	//    printf("\n Enter the any no: ");
	//    scanf("%d",&no);
	//    i=1;
	//   fact=1;
	//   while(i<=no)
	//   {
	// 	fact=fact*i;
	// 	i++;
	//   }
	//   printf("\n Factorial of %d is %d",no,fact);
	// or
	// int no, fact, i;
	// printf("\n Enter the No: ");
	// scanf("%d", &no);
	// i = 1;
	// fact = 1;
	// while (no > 1)
	// {
	// 	fact = fact * no;
	// 	no--;
	// }
	// printf("\n Factorial is: %d", fact);

	// 43
	// int no;
	// printf("\n Enter the any no: ");
	// scanf("%d", &no);
	//  no= 1;
	//  while (no<=10)
	//  {
	// 	printf("\n %d \t %d \t %d", no,no*no,no*no*no);
	// 	no++;
	//  }

	// 44
	// int no,tmp,dg,flg,rem;
    // printf("\n Enter the no: ");
    // scanf("%d",&no);
    // tmp=no;
    // printf("\n Missing Digits: ");
    // for(dg=0;dg<10;dg++)
    // {
    //     no=tmp;
    //     flg=0;
    //     while(no!=0)
    //     {
    //         rem=no%10;
    //         no=no/10;
    //         if(rem==dg)
    //         {
    //             flg=1;
    //             break;
    //         }
    //     }
    //     if(flg==0)
    //         printf("%5d",dg);
    // }

   //45
    // int no,dc,tmp,rem,a,i,sum;
    // printf("\n List of Armstrong No: ");
    // no=10;
    // while(no<=10000)
    // {
    //     tmp=no;
    //     for(dc=0;no!=0;no=no/10,dc++);
    //     //printf("\n Digit Count: %d",dc);
    //     sum=0;
    //     no=tmp;
    //     while(no!=0)
    //     {
    //         rem=no%10;
    //         no=no/10;
    //         a=1;
    //         i=0;
    //         while(i<dc)
    //         {
    //             a=a*rem;
    //             i++;
    //         }
    //         sum=sum+a;
    //     }
    //     no=tmp;
    //     if(tmp==sum)
    //             printf("%5d",tmp);
    //     no++;
    // }

  





























	return 0;
}
