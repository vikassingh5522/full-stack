// ======================================List of if...else programming exercises ==================================

// 1} Write a C program to find the maximum between two numbers.
// #include <stdio.h>
// int main()
// {
//     int x, y, max;
//     printf("\n Enter the first number :");
//     scanf("%d", &x);
//     printf("\n Enter the secound number :");
//     scanf("%d", &y);
//     if (x > y)
//     {
//         max = x;
//     }
//     else
//     {
//         max = y;
//     }
//     printf("\n maxium number is : %d ", max);
//     return 0;
// }

// 2} Write a C program to find maximum between three numbers.
//  #include <stdio.h>
//  int main()
//  {
//      int a1, a2, a3, max;
//      printf("\n Enter the first number :");
//      scanf("%d", &a1);
//      printf("\n Enter the secound number :");
//      scanf("%d", &a2);
//      printf("\n Enter the third number :");
//      scanf("%d", &a3);
//      if (a1 > a2 && a1 > a3)
//      {
//          max = a1;
//      }
//      else if (a2 > a1 && a2 > a3)
//      {
//          max = a2;
//      }
//      else
//      {
//          max = a3;
//      }
//      printf("\n maxium number is : %d ", max);
//  }

// 3} Write a C program to check whether a number is negative, positive or zero.
// #include <stdio.h>
// int main()
// {
//     int num;
//     printf("\n Enter the number :");
//     scanf("%d", &num);
//     if (num > 0)
//     {
//         printf("\n number is positive number:");
//     }
//     else if (num < 0)
//     {
//         printf("\n number is negative number: ");
//     }
//     else
//     {
//         printf("\n number is zero:");
//     }
//     return 0;
// }

// 4}Write a C program to check whether a number is divisible by 5 and 11 or not.
// #include <stdio.h>
// int main()
// {
//     int num;
//     printf("\n Enter the number :");
//     scanf("%d", &num);
//     if (num % 5 == 0 && num % 11 == 0)
//     {
//         printf("\n number is divisible by 5 and 11");
//     }
//     else
//     {
//         printf("\n number is not divisible by 5 and 11");
//     }
//     return 0;
// }

// 5} Write a C program to check whether a year is a leap year or not.
// #include <stdio.h>
// int main()
// {
//     int year;
//     printf("\n Enter the year :");
//     scanf("%d", &year);
//     if (year % 4 == 0)
//     {
//         if (year % 100 == 0)
//         {
//             if (year % 400 == 0)
//             {
//                 printf("\n year is a leap year");
//             }
//             else
//             {
//                 printf("\n year is not a leap year");
//             }
//         }
//         else
//         {
//             printf("\n year is a leap year");
//         }
//         else
//         {
//             printf("\n year is not a leap year");
//         }
//         return 0;
//     }

// 6} Write a C program to check whether a character is an alphabet or not.
// #include <stdio.h>
// int main()
// {
//     char ch;
//     printf("\n Enter the character :");
//     scanf("%c", &ch);
//     if (ch >= 'a' && ch <= 'z')
//     {
//         printf("\n character is a small alphabet");
//     }
//     else if (ch >= 'A' && ch <= 'Z')
//     {
//         printf("\n character is a capital alphabet");
//     }
//     else
//     {
//         printf("\n character is not an alphabet");
//     }
//     return 0;
// }

// 7} Write a C program to input any alphabet and check whether it is a vowel or consonant.
// #include <stdio.h>
// int main()
// {
//     char ch;
//     printf("\n Enter the character :");
//     scanf("%c", &ch);
//     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//     {
//         printf("\n character is a vowel");
//     }
//     else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
//     {
//         printf("\n character is a vowel");
//     }
//     else
//     {
//         printf("\n character is a consonant");
//     }
//     return 0;
// }

// 8} Write a C program to input any character and check whether it is alphabet, digit or special character.
// #include <stdio.h>
// int main()
// {
//     char ch;
//     printf("\n Enter the character :");
//     scanf("%c", &ch);
//     if (ch >= 'a' && ch <= 'z')
//     {
//         printf("\n character is a small alphabet");
//     }
//     else if (ch >= 'A' && ch <= 'Z')
//     {
//         printf("\n character is a capital alphabet");
//     }
//     else if (ch >= '0' && ch <= '9')
//     {
//         printf("\n character is a digit");
//     }
//     else
//     {
//         printf("\n character is a special character");
//     }
//     return 0;
// }

// 9}Write a C program to check whether a character is uppercase or lowercase alphabet.
// #include<stdio.h>
// int main()
// {
//     char ch;
//     printf("\n Enter the character :");
//     scanf("%c", &ch);
//     if (ch >= 'a' && ch <= 'z')
//     {
//         printf("\n character is a small alphabet");
//     }
//     else if (ch >= 'A' && ch <= 'Z')
//     {
//         printf("\n character is a capital alphabet");
//     }
//     else
//     {
//         printf("\n character is not an alphabet");
//     }
//     return 0;
// }

// 10}Write a C program to input week number and print week day.
// #include<stdio.h>
// int main()
// {
//     int week;
//     printf("\n Enter the week number :");
//     scanf("%d", &week);
//     if(week==1)
//     {
//         printf("\n week day is Sunday");
//     }
//     else if(week==2)
//     {
//         printf("\n week day is Monday");
//     }
//     else if(week==3)
//     {
//         printf("\n week day is Tuesday");
//     }
//     else if(week==4)
//     {
//         printf("\n week day is Wednesday");
//     }
//     else if(week==5)
//     {
//         printf("\n week day is Thursday");
//     }
//     else if(week==6)
//     {
//         printf("\n week day is Friday");
//     }
//     else if(week==7)
//     {
//         printf("\n week day is Saturday");
//     }
//     else if(week==8)
//     {
//         printf("\n week day is Sunday");
//     }
//     else
//     {
//         printf("\n invalid week number");
//     }
// }

// 11} Write a C program to input month number and print number of days in that month.
// #include <stdio.h>
// int main()
// {
//     int month;
//     printf("\n Enter the month number :");
//     scanf("%d", &month);
//     if (month == 1)
//     {
//         printf("\n January has 31 days");
//     }
//     else if (month == 2)
//     {
//         printf("\n February has 28 days");
//     }
//     else if (month == 3)
//     {
//         printf("\n March has 31 days");
//     }
//     else if (month == 4)
//     {
//         printf("\n April has 30 days");
//     }
//     else if (month == 5)
//     {
//         printf("\n May has 31 days");
//     }
//     else if (month == 6)
//     {
//         printf("\n june has 30 days");
//     }
//     else if (month == 7)
//     {
//         printf("\n july has 31 days");
//     }
//     else if (month == 8)
//     {
//         printf("\n August has 31 days");
//     }
//     else if (month == 9)
//     {
//         printf("\n September has 30 days");
//     }
//     else if (month == 10)
//     {
//         printf("\n October has 31 days");
//     }
//     else if (month == 11)
//     {
//         printf("\n November has 30 days");
//     }
//     else if (month == 12)
//     {
//         printf("\n December has 31 days");
//     }
// }

// 12}Write a C program to count total number of notes in given amount.
// #include <stdio.h>
// int main()
// {
//     int amount, no0, no1, no2, no3, no4, no5, no6, no7, no8;
//     printf("Enter the amount :");
//     scanf("%d", &amount);
//     if (amount > 1000)
//     {
//         no0 = amount / 1000;
//         printf("\n No 1000 notes are : %d", no0);
//         amount = amount % 1000;
//     }
//     if (amount > 500)
//     {
//         no1 = amount / 500;
//         printf("\n No 500 notes are : %d", no1);
//         amount = amount % 500;
//     }
//     if (amount > 200)
//     {
//         no2 = amount / 200;
//         amount = amount % 200;
//         printf("\n No 200 notes are : %d", no2);
//     }
//     if (amount > 100)
//     {
//         no3 = amount / 100;
//         printf("\n No 100 notes are : %d", no3);
//         amount = amount % 100;
//     }
//     if (amount > 50)
//     {
//         no4 = amount / 50;
//         printf("\n No 50 notes are : %d", no4);
//         amount = amount % 50;
//     }
//     if (amount > 10)
//     {
//         no5 = amount / 10;
//         printf("\n No 10 notes are : %d", no5);
//         amount = amount % 10;
//     }
//     if (amount > 5)
//     {
//         no6 = amount / 5;
//         printf("\n No 10 notes are : %d", no6);
//         amount = amount % 5;
//     }
//     if (amount > 1)
//     {
//         no7 = amount / 1;
//         printf("\n No 1 notes are :%d", no7);
//         amount = amount % 1;
//     }
//     return 0;
// }

// 13}Write a C program to input angles of a triangle and check whether triangle is valid or not.
// #include <stdio.h>
// int main()
// {
//     int a, b, c;
//     printf("\nEnter the first angle of triangle: ");
//     scanf("%d", &a);
//     printf("\nEnter the second angle of triangle :");
//     scanf("%d", &b);
//     printf("\nEnter the third angle of triangle :");
//     scanf("%d", &c);
//     if (a + b + c == 180 && a > 0 && b > 0 && c > 0)
//     {
//         printf("\n Triangle is valid");
//     }
//     else
//     {
//         printf("\n Triangle is not valid");
//     }
//     return 0;
// }

// 14}Write a C program to input all sides of a triangle and check whether triangle is valid or not.
// #include <stdio.h>
// int main()
// {
//     int a, b, c;
//     printf("\nEnter the first side of triangle:");
//     scanf("%d", &a);
//     printf("\nEnter the second side of triangle:");
//     scanf("%d", &b);
//     printf("\nEnter the third side of triangle:");
//     scanf("%d", &c);
//     if (a + b > c && a + c > b && b + c > a)
//     {
//         printf("\n Triangle is valid");
//     }
//     else
//     {
//         printf("\n Triangle is not valid");
//     }
//     return 0;
// }

// 15}Write a C program to check whether the triangle is equilateral, isosceles or scalene triangle
// #include<stdio.h>
// int main()
// {
//     int a, b, c;
//     printf("\nEnter the first side of triangle:");
//     scanf("%d", &a);
//     printf("\nEnter the second side of triangle:");
//     scanf("%d", &b);
//     printf("\nEnter the third side of triangle:");
//     scanf("%d", &c);
//     if (a == b && b == c)
//     {
//         printf("\n Triangle is equilateral");
//     }
//     else if (a == b || b == c || c == a)
//     {
//         printf("\n Triangle is isosceles");
//     }
//     else
//     {
//         printf("\n Triangle is scalene");
//     }
//     return 0;
// }

// 16}Write a C program to find all roots of a quadratic equation.
// #include<stdio.h>
// #include<math.h>
// int main()
// {
//     float a, b, c, d, r1, r2;
//     printf("\n Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
//     printf("\n Enter a:");
//     scanf("%f", &a);
//     printf("\nEnter b:");
//     scanf("%f", &b);
//     printf("\nEnter c:");
//     scanf("%f", &c);
//     d = b * b - 4 * a * c;
//     if (d > 0)
//     {
//         r1 = (-b + sqrt(d)) / (2 * a);
//     }
//     else if (d == 0)
//     {
//         r1 = -b / (2 * a);
//     }
//     else
//     {
//         r1 = (-b - sqrt(d)) / (2 * a);
//     }
//     if (d > 0)
//     {
//         r2 = (-b - sqrt(d)) / (2 * a);
//     }
//     else if (d == 0)
//     {
//         r2 = r1;
//     }
//     else
//     {
//         r2 = (-b + sqrt(d)) / (2 * a);
//     }
//     printf("\nRoots of the equation are %f and %f", r1, r2 );
//     return 0;
// }

// 17}Write a C program to calculate profit or loss.
// #include <stdio.h>
// int main()
// {
//     float cost, selling_price, profit, loss;
//     printf("\nEnter the cost price:");
//     scanf("%f", &cost);
//     printf("\nEnter the selling price:");
//     scanf("%f", &selling_price);
//     if (selling_price > cost)
//     {
//         profit = selling_price - cost;
//         printf("\nProfit is %.2f", profit);
//     }
//     else if (selling_price < cost)
//     {
//         loss = cost - selling_price;
//     }
//     else
//     {
//         printf("\nNo profit or loss");
//     }
//     return 0;
// }

// 18} Write a C program to input marks of five subjects Physics, Chemistry, Biology,
//  Mathematics and Computer. Calculate percentage and grade according to
//  following:
//  Percentage >= 90% : Grade A
//  Percentage >= 80% : Grade B
//  Percentage >= 70% : Grade C
//  Percentage >= 60% : Grade D
//  Percentage >= 40% : Grade E
//  Percentage < 40% : Grade F
//  #include <stdio.h>
//  int main()
//  {
//      float phy,chem,biol,math,comp,avg;
//      printf("\nEnter the marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer:");
//      scanf("%f %f %f %f %f",&phy,&chem,&biol,&math,&comp);
//      avg = (phy + chem + biol + math + comp) / 5;
//      printf("\nAverage percentage is %.2f",avg);
//      if (avg >= 90)
//      {
//          printf("\nGrade A");
//      }
//      else if (avg >= 80)
//      {
//          printf("\nGrade B");
//      }
//      else if (avg >= 70)
//      {
//          printf("\nGrade C");
//      }
//      else if (avg >= 60)
//      {
//          printf("\nGrade D");
//      }
//      else if( avg >= 40)
//      {
//          printf("\nGrade E");
//      }
//      else if( avg>=40)
//      {
//          printf("\nGrade F");
//      }
//      return 0;
//  }

// 19} Write a C program to input basic salary of an employee and calculate its Gross
//  salary according to the following:
//  Basic Salary <= 10000 : HRA = 20%, DA = 80%
//  Basic Salary <= 20000 : HRA = 25%, DA = 90%
//  Basic Salary > 20000 : HRA = 30%, DA = 95%
// #include <stdio.h>
// int main()
// {
//     float bs, gs, hra, da;
//     printf("\nEnter the basic salary of an employee:");
//     scanf("%f", &bs);
//     if (bs <= 10000)
//     {
//         hra = bs * 0.20;
//         da = bs * 0.80;
//     }
//     else if (bs <= 20000)
//     {
//         hra = bs * 0.25;
//         da = bs * 0.90;
//     }
//     else if (bs > 20000)
//     {
//         hra = bs * 0.30;
//         da = bs * 0.95;
//     }
//     else
//     {
//         printf("\nInvalid input");
//     }
//     gs = bs + hra + da;
//     printf("\nGross Salary = %.2f", gs);
//     return 0;
// }

// Write a C program to input electricity unit charges and calculate total electricity bill
// according to the given condition: For the first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill

// Enter the no thw keyboard and display menu to perform following operations
//	option 1 - to check the number is positive or negative.
//	option 2 - to check number is divisible by 5 or not.
//	option 3 - to check number is even or odd.
#include <stdio.h>
int main()
{
    int no, opt;
    printf("\n Enter any number: ");
    scanf("%d", &no);
    printf("\n --------- Menu --------\n");
    printf("\n 1.to check the number is positive or negative \n 2.To check the number is divisible by 5 or not \n3. to check number is even or odd. ");
    printf("\n Select your option: ");
    scanf("%d", &opt);
    if (opt == 1)
    {
        if (no == 0)
        {
            printf("\n Number is Zero");
        }
        else
        {
            if (no > 0)
            {
                printf("\n Number is Positive");
            }
            else
            {
                printf("\n Number is Negative");
            }
        }
    }
    else
    {
        if (opt == 2)
        {
            if (no % 5 == 0)
            {
                printf("\n Entered number is div by 5");
            }
            else
            {
                printf("\n Entered number is not div by 5");
            }
        }
        else
        {
            printf("\n Incorrect Option");
        }
    }
    if(opt == 3){
        if(no % 2 == 0){
            printf("\n Number is Even");
        }
        else{
            printf("\n Number is Odd");
        }

    }
    return 0;
}
