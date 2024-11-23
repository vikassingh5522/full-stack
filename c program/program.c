// ==========================================List of basic Operator Programs======================================

// 1} Write a C program to perform input/output of all basic data types.
// #include <stdio.h>
// int main()
// {
//     int x;
//     char ch;
//     float ft;
//     double db;
//     printf("\n Enter one char ,inte and two frac values: ");
//     scanf("%c %d %f %lf", &ch, &x, &ft, &db);
//     printf("\n value of x is: %d", x);
//     printf("\n ch=%c \t ft=%0.3f \n Val of db is %lf", ch, ft, db);
//     return 0;
// }

// 2} Write a C program to enter two numbers and find their sum.
// #include<stdio.h>
// int main()
// {
//     int x, y, sum;
//     printf("Enter two numbers: ");
//     scanf("%d %d", &x, &y);
//     sum=x+y;
//     printf("sum of two number %d:", sum);
//     return 0;
// }

// 3} Write a C program to enter two numbers and perform all arithmetic operations.
//  #include<stdio.h>
//  int main()
//  {
//   int x,y;
//   printf("Enter two numbers: ");
//   scanf("%d %d", &x, &y);
//   printf("\n Addition of two numbers: %d", x+y);
//   printf("\n Subtraction of two numbers: %d", x-y);
//   printf("\n Multiplication of two numbers: %d", x*y);
//   printf("\n Division of two numbers: %f", (float)x/y);
//   printf("\n Modulus of two numbers: %d", x%y);
//      return 0;
//  }

// 4}Write a C program to enter length and breadth of a rectangle and find its perimeter.
// #include<stdio.h>
// int main()
// {
//    float x,y, per;
//    printf("Enter length and breadth of rectangle: ");
//    scanf("%f %f", &x,&y);
//    per=2*(x+y);
//    printf("Perimeter of rectangle is: %f",per);
//    return 0;
// }

// 5}Write a C program to enter length and breadth of a rectangle and find its area. formula = area=x*y
// #include<stdio.h>
// int main()
// {
//     float x,y, area;
//     printf("Enter length and breadth of rectangle: ");
//     scanf("%f %f", &x,&y);
//     area=x*y;
//     printf("Area of rectangle is: %f",area);
//     return 0;
// }

// 6}Write a C program to enter radius of a circle and find its diameter, circumference and area.
// #include<stdio.h>
// int main()
// {
//     float x, dia, cir, area;
//     printf("\n Enter radius of circle: ");
//     scanf("%f", &x);
//     dia=2*x;
//     cir=2*3.14*x;
//     area=3.14*x*x;
//     printf("\n Diameter of circle is: %f",dia);
//     printf("\n Circumference of circle is: %f",cir);
//     printf("\n Area of circle is: %f",area);
//     return 0;
// }

// 7} Write a C program to enter length in centimeter and convert it into meter and kilometer.
// #include<stdio.h>
// int main()
// {
//     float x, m, km;
//     printf("\n Enter length in centimeter: ");
//     scanf("%f", &x);
//     m=x/100;
//     km=x/100000;
//     printf("\n Length in meter is: %f",m);
//     printf("\n Length in kilometer is: %f",km);
//     return 0;
// }

// 8} Write a C program to enter temperature in Celsius and convert it into Fahrenheit  9   formula (x*9/5)+32.
// #include<stdio.h>
// int main()
// {
//     float x, f;
//     printf("\n Enter temperature in Celsius: ");
//     scanf("%f", &x);
//     f=(x*9/5)+32;
//     printf("\n Temperature in Fahrenheit is: %f",f);
//     return 0;
// }

// 9}Write a C program to enter temperature in Fahrenheit and convert to Celsius . formula= (x-32)*5/9
// #include<stdio.h>
// int main()
// {
//     float x, c;
//     printf("\n Enter temperature in Fahrenheit: ");
//     scanf("%f", &x);
//     c=(x-32)*5/9;
//     printf("\n Temperature in Celsius is: %f",c);
//     return 0;
// }

// 10} Write a C program to convert days into years, weeks and days.
// #include<stdio.h>
// int main()
// {
//     int x, y, w, d;
//     printf("\n Enter number of days: ");
//     scanf("%d", &x);
//     y=x/365;
//     w=(x%365)/7;
//     d=(x%365)%7;
//     printf("\n %d days is equal to %d years, %d weeks and %d  days",x,y,w,d);
//     return 0;
// }

// 11} Write a C program to find power of any number x ^ y.
// #include<stdio.h>
// int main()
// {
//     int x, y, i, p=1;
//     printf("\n Enter base number: ");
//     scanf("%d", &x);
//     printf("\n Enter power: ");
//     scanf("%d", &y);
//     for(i=1; i<=y; i++)
//     {
//         p=p*x;
//     }
//     printf("\n %d ^ %d = %d",x,y,p);
//     return 0;
// }

// 12} Write a C program to enter any number and calculate its square root
// #include<stdio.h>
// #include<math.h>
// int main()
// {
//     float x, y;
//     printf("\n Enter any number: ");
//     scanf("%f", &x);
//     y=sqrt(x);
//     printf("\n Square root of %f is: %f",x,y);
//     return 0;
// }

// 13} Write a C program to enter two angles of a triangle and find the third angle
// #include<stdio.h>
// int main ()
// {
//     int a, b, c;
//     printf("\n Enter first angle: ");
//     scanf("%d", &a);
//     printf("\n Enter second angle: ");
//     scanf("%d", &b);
//     c=180-(a+b);
//     printf("\n Third angle is: %d",c);
//     return 0;
// }

// 14} Write a C program to enter base and height of a triangle and find its area.
// #include <stdio.h>
// int main()
// {
//     int b, h, a;
//     printf("\n Enter base of triangle: ");
//     scanf("%d", &b);
//     printf("\n Enter height of triangle: ");
//     scanf("%d", &h);
//     a = (b * h) / 2;
//     printf("\n Area of triangle is: %d", a);
//     return 0;
// }

// 15} Write a C program to calculate area of an equilateral triangle.
// #include <stdio.h>
// #include<math.h>
// int main()
// {
//     int s, a;
//     printf("\n Enter side of equilateral triangle: ");
//     scanf("%d", &s);
//     a = (s * s * sqrt(3)) / 4;
//     printf("\n Area of equilateral triangle is: %d", a);
//     return 0;
// }

// 16}Write a C program to enter marks of five subjects and calculate total, average and percentage.
// #include<stdio.h>
// int main()
// {
//     int m1, m2, m3, m4, m5, t, a, p;
//     printf("\n Enter marks of five subjects: ");
//     scanf("%d%d%d%d%d", &m1, &m2, &m3, &m4, &m5);
//     t = m1 + m2 + m3 + m4 + m5;
//     a = t / 5;
//     p = (t * 100) / 500;
//     printf("\n Total marks: %d", t);
//     printf("\n Average marks: %d", a);
//     printf("\n Percentage: %d", p);
//     return 0;
// }

// 17 Write a C program to enter P, T, R and calculate Simple Interest. formula SI = P × R × T / 100
// #include<stdio.h>
// int main()
// {
//     int p, t, r, si;
//     printf("\n Enter principal: ");
//     scanf("%d", &p);
//     printf("\n Enter time: ");
//     scanf("%d", &t);
//     printf("\n Enter rate: ");
//     scanf("%d", &r);
//     si = (p * t * r) / 100;
//     printf("\n Simple Interest is: %d", si);
//     return 0;
// }

// 18 Write a C program to enter P, T, R and calculate Compound Interest  A = P(1 + r/n)^nt
// #include <stdio.h>
// #include <math.h>
// int main()
// {
//     int p, t, r, ci, n;
//     printf("\n Enter principal:");
//     scanf("%d", &p);
//     printf("\n Enter time:");
//     scanf("%d", &t);
//     printf("\n Enter rate:");
//     scanf("%d", &r);
//     ci = ci = p * (1 + (r / n)) ^ n * t;
//     printf("\n Compound Interest is: %d", ci);
//     return 0;
// }

// =========================================List of conditional operators programming exercises============================================

// 1}Write a C program to find maximum between two numbers using conditional operator.
// #include<stdio.h>
// int main()
// {
//     int a, b;
//     printf("\n Enter first number:");
//     scanf("%d", &a);
//     printf("\n Enter second number:");
//     scanf("%d", &b);
//     printf("\n Maximum between %d and %d is: %d", a, b, (a > b) ? a : b);
//     return 0;
// }

// 2} Write a C program to find maximum between three numbers using conditional operator.
//  #include <stdio.h>
//  int main()
//  {
//      int a, b, c;
//      printf("\n Enter first number:");
//      scanf("%d", &a);
//      printf("\n Enter second number:");
//      scanf("%d", &b);
//      printf("\n Enter third number:");
//      scanf("%d", &c);
//      printf("\n Maximum between %d, %d and %d is: %d", a , b, c, (a > b) ? (a > c ? a : c)  : (b > c ? b : c));
//      return 0;
//  }

// 3}Write a C program to check whether a number is even or odd using conditional operator.
// #include <stdio.h>
// int main()
// {
//     int n;
//     printf("\n Enter a number :");
//     scanf("%d", &n);
//     (n % 2 == 0) ? printf("\n %d is even number") : printf(" \n  %d numner is is odd ");
//     return 0;
// }

// 4}Write a C program to check whether year is leap year or not using conditional operator.
#include<stdio.h>
int main()
{
    int year;
    printf("\n Enter a year:");
    scanf("%d", &year);
    (year % 4 == 0 && year % 100 != 0) || (
        year % 400 == 0) ? printf("\n %d is a leap year")
        : printf("\n %d is not a leap year");
        return 0;
}

// 5}Write a C program to check whether character is an alphabet or not using a conditional operator
// #include <stdio.h>
// int main()
// {
//     char ch;
//     printf("\n Enter a character:");
//     scanf("%c", &ch);
//     (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ? printf("\n %c is an alphabet") : printf("\n  %c is not an alphabet");
//     return 0;
// }
