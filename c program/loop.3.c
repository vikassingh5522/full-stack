//===========================List of Loop programming exercises=================================

// 1 Write a C program to print all natural numbers from 1 to n.
// #include<stdio.h>
// int main()
// {
//     int no,i;
//     printf(" \n Enter a number: ");
//     scanf("%d",&no);
//     for(int i=1; i<=no;i++)
//     {
//         printf("%d",i);
//     }
//     return 0;
// }

// 2 Write a C program to print all natural numbers in reverse (from n to 1).
//  #include<stdio.h>
//  int main()
//  {
//      int no,i;
//      printf(" \n Enter a number: ");
//      scanf("%d",&no);
//      for(int i=no; i>=1 ;i--)
//      {
//          printf("%d",i);
//      }
//      return 0;
//  }

// 3 Write a C program to print all alphabets from a to z.
// #include<stdio.h>
//  int main()
//  {
//      char ch;
//      for(ch='a';ch<='z';ch++)
//      {
//          printf("%c",ch);
//      }
//      return 0;
//  }

// 4  Write a C program to print all even numbers between 1 to 100.
//  #include<stdio.h>
//  int main()
//  {
//      int i;
//      for(i=2; i<=100; i+=2)
//      {
//          printf("%d",i);
//      }
//      return 0;
//  }

// 5 Write a C program to print all odd numbers between 1 to 100.
//  #include<stdio.h>
//  int main()
//  {
//       int i;
//      for(i=1; i<=100; i+=2)
//      {
//          printf("%d",i);
//      }
//      return 0;
//  }

// 5 Write a C program to find the sum of all natural numbers between 1 to n.
//   #include<stdio.h>
//   int main()
//   {
//      int n ,sum=0;
//      printf("Enter a number:");
//      scanf("%d",&n);
//      for(int i=1; i<=n; i++)
//      {
//         sum+=i;
//      }
//      printf("Sum of natural numbers between 1 to %d is : %d ",n,sum);
//      return 0;
//   }

// 6 Write a C program to find the sum of all even numbers between 1 to n.
//  #include<stdio.h>
//  int main()
//  {
//      int n, sum=0;
//      printf(" \n Enter a number value of n:");
//      scanf("%d",&n);
//      for(int i=2; i<=n; i+=2)
//      {
//          sum=sum+i;
//      }
//     printf(" \n Sum of all even numbers between 1 to %d is: %d", n, sum);

//     return 0;
// }

// 7 Write a C program to find sum of all odd numbers between 1 to n.
// #include<stdio.h>
// int main()
// {
//     int n,sum=0;
//     printf(" \n Enter a number value of n:");
//     scanf("%d",&n);
//     for(int i=1; i<=n; i+=2)
//     {
//         sum=sum+i;
//     }
//     printf(" \n Sum of all odd numbers between 1 to %d is: %d", n, sum);
//     return 0;
// }

// 8 Write a C program to print multiplication table of any number.
// #include<stdio.h>
// int main()
// {
//     int n, i;
//     printf("Enter a number:");
//     scanf("%d",&n);
//     printf(" \n Multiplication table of %d is: \n", n);
//     for(i=0; i<=12; i++)
//     {
//         printf(" \n %d * %d = %d ", n, i, n*i);
//     }
//     return 0;
// }

// 9}Write a C program to count number of digits in a number
// #include <stdio.h>
// int main() {
//     int n, count = 0;
//     printf("Enter a number: ");
//     scanf("%d", &n);
//     if (n == 0) {
//         count = 1;
//     } else {
//         if (n < 0) {
//             n = -n;
//         }
//         int temp = n;
//         while (temp > 0) {
//             temp /= 10;
//             count++;
//         }
//     }
//     printf("Number of digits is: %d\n", count);
//     return 0;
// }

// 9 Write a C program to find first and last digit of a number.
//  #include <stdio.h>
//  int main() {
//     int n, first_digit, last_digit;
//     printf("Enter a number: ");
//     scanf("%d", &n);
//     first_digit = n / 1000;
//     last_digit = n % 10;
//     printf("First digit of the number is: %d\n", first_digit);
//     printf("Last digit of the number is: %d\n", last_digit);
//     return 0;
//  }

// 10  Write a C program to find sum of first and last digit of a number.
// #include <stdio.h>
// int main() {
//     int num, lastDigit, firstDigit, sum;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     lastDigit = num % 10;
//     firstDigit = num;
//     while (firstDigit >= 10) {
//         firstDigit /= 10;
//     }
//     sum = firstDigit + lastDigit;
//     printf("The sum of the first and last digit is: %d\n", sum);
//     return 0;
// }

// 11Write a C program to swap first and last digits of a ✅

// 12 Write a C program to calculate sum of digits of a number.
//   #include <stdio.h>
//   int main()
//   {
//      int num, sum = 0;
//      printf("Enter a number: ");
//      scanf("%d", &num);
//      while (num != 0) {
//          sum += num % 10;
//          num /= 10;
//          }
//          printf("Sum of digits of the number is: %d\n", sum);
//          return 0;
//          }

// 13 Write a C program to calculate product of digits of a number.
//  #include <stdio.h>
//  int main()
//  {
//     int num, product = 1;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     while (num != 0) {
//         product *= num % 10;
//         num /= 10;
//     }
//     printf("Product of digits of the number is: %d\n", product);
//     return 0;
// }

// Write a C program to enter a number and print its reverse
// #include<stdio.h>
// int main() {
//     int num, reverse = 0, remainder, original;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     original = num;
//     while (num != 0) {
//         remainder = num % 10;
//         reverse = reverse * 10 + remainder;
//         num /= 10;
//         }
//         printf("The reverse of the number %d is: %d\n", original, reverse);
//         return 0;
//         }

// Write a C program to check whether a number is palindrome or not
// #include <stdio.h>
// int main() {
//     int num, reverse = 0, remainder, original;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     original = num;
//     while (num != 0) {
//         remainder = num % 10;
//         reverse = reverse * 10 + remainder;
//         num /= 10;
//     }
//     if (original == reverse) {
//         printf("%d is a palindrome number.\n", original);
//     }
//     else {
//         printf("%d is not a palindrome number.\n", original);
//         }
//         return 0;
// }

// Write a C program to find frequency of each digit in a given integer.✅
// #include <stdio.h>
// int main() {
//     int num, digit, frequency[10] = {0}, i;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     while (num != 0) {
//         digit = num % 10;
//         frequency[digit]++;
//         num /= 10;
//     }
//     for (i = 0; i < 10; i++) {
//         if (frequency[i] != 0) {
//             printf("Frequency of digit %d is %d\n", i, frequency[i]);
//         }
//     }
//     return 0;
// }

// Write a C program to enter a number and print it in words.✅

// Write a C program to print all ASCII character with their values.
//  #include <stdio.h>
//  int main() {
//     int i;
//     printf("ASCII Values of Alphabets are:\n");
//     for (i = 65; i <= 90; i++) {
//         printf("%c = %d\n", i, i);
//         }
//         printf("\nASCII Values of Small Alphabets are:\n");
//         for (i = 97; i <= 122; i++) {
//             printf("%c = %d\n", i, i);
//             }
//             printf("\nASCII Values of Digits are:\n");
//             for (i = 48; i <= 57; i++) {
//                 printf("%c = %d\n", i, i);
//                 }
//                 return 0;
//  }

// Write a C program to find power of a number using for loop.
//  #include <stdio.h>
//  int main() {
//     int base, exponent, result = 1;
//     printf("Enter base: ");
//     scanf("%d", &base);
//     printf("Enter exponent: ");
//     scanf("%d", &exponent);
//     for (int i = 1; i <= exponent; i++) {
//         result = result * base;
//         }
//         printf("%d^%d = %d\n", base, exponent, result);
//         return 0;
//         }

// Write a C program to find all factors of a number.
//  #include <stdio.h>
//  int main() {
//     int num, i, factors = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 1; i <= num; i++) {
//         if (num % i == 0) {
//             printf("%d ", i);
//             factors++;
//             }
//             }
//             printf("\nTotal factors: %d\n", factors);
//             return 0;
//  }

// Write a C program to calculate factorial of a number.
//   #include <stdio.h>
//   int main() {
//     int num, i, factorial = 1;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 1; i <= num; i++) {
//         factorial = factorial * i;
//         }
//         printf("Factorial of %d = %d\n", num, factorial);
//         return 0;
//   }

// Write a C program to find HCF (GCD) of two numbers. ✅
// #include <stdio.h>
// int main() {
//     int num1, num2, temp;
//     printf("Enter the first number: ");
//     scanf("%d", &num1);
//     printf("Enter the second number: ");
//     scanf("%d", &num2);
//     if (num1 < num2) {
//         temp = num1;
//         num1 = num2;
//         num2 = temp;
//     }
//     while (num2 != 0) {
//         temp = num2;
//         num2 = num1 % num2;
//         num1 = temp;
//     }
//     printf("The HCF (GCD) is: %d\n", num1);
//     return 0;
// }

// Write a C program to find LCM of two numbers.✅

// Write a C program to check whether a number is Prime number or not.
// #include <stdio.h>
// int main() {
//     int num, i, flag = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 2; i <= num / 2; i++) {
//         if (num % i == 0) {
//             flag = 1;
//             break;
//         }
//     }
//     if (flag == 0) {
//         printf("%d is a prime number.\n", num);
//     } else {
//         printf("%d is not a prime number.\n", num);
//     }
//     return 0;
// }

// Write a C program to print all Prime numbers between 1 to n.
// #include <stdio.h>
// int main() {
//     int num, i, flag = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 2; i <= num; i++) {
//         flag = 0;
//         for (int j = 2; j <= i / 2; j++) {
//             if (i % j == 0) {
//                 flag = 1;
//                 break;
//             }
//         }
//         if (flag == 0) {
//             printf("%d ", i);
//         }
//     }
//     return 0;
// }

// Write a C program to find sum of all prime numbers between 1 to n.
// #include <stdio.h>
// int main() {
//     int num, i, flag = 0, sum = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 2; i <= num; i++) {
//         flag = 0;
//         for (int j = 2; j <= i / 2; j++) {
//             if (i % j == 0) {
//                 flag = 1;
//                 break;
//             }
//         }
//         if (flag == 0) {
//             sum += i;
//         }
//     }
//     printf("Sum of all prime numbers between 1 to %d is: %d\n", num, sum);
//     return 0;
// }

// Write a C program to find all prime factors of a number.
// #include <stdio.h>
// int main() {
//     int num, i, flag = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 2; i <= num; i++) {
//         flag = 0;
//         for (int j = 2; j <= i / 2; j++) {
//             if (i % j == 0) {
//                 printf("%d ", j);
//                 flag = 1;
//                 break;
//             }
//         }
//         if (flag == 0) {
//             printf("%d ", i);
//         }
//     }
//     return 0;
// }

// Write a C program to check whether a number is Armstrong number or not. ✅
// #include <stdio.h>
// int main() {
//     int num, temp, sum = 0, digit, i = 1;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     temp = num;
//     while (temp != 0) {
//         digit = temp % 10;
//         sum += digit * digit * digit;
//         temp /= 10;
//     }
//     if (sum == num) {
//         printf("%d is an Armstrong number.\n", num);
//     } else {
//         printf("%d is not an Armstrong number.\n", num);
//     }
//     return 0;
// }

// Write a C program to print all Armstrong numbers between 1 to n.✅
// #include <stdio.h>
// #include <math.h>
// int main() {
//     int num, i, sum, digit, temp, n, digits;
//     printf("Enter a number: ");
//     scanf("%d", &n);
//     for (i = 1; i <= n; i++) {
//         sum = 0;
//         temp = i;
//         digits = (int)log10(i) + 1;
//         while (temp != 0) {
//             digit = temp % 10;
//             sum += pow(digit, digits);
//             temp /= 10;
//         }
//         if (sum == i) {
//             printf("%d ", i);
//         }
//     }
//     return 0;
// }

// Write a C program to check whether a number is Perfect number or not.👍✅
// #include <stdio.h>
// int main() {
//     int num, i, sum = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 1; i < num; i++) {
//         if (num % i == 0) {
//             sum += i;
//         }
//     }
//     if (sum == num) {
//         printf("%d is a Perfect number.\n", num);
//     } else {
//         printf("%d is not a Perfect number.\n", num);
//     }
//     return 0;
// }

// Write a C program to print all Perfect numbers between 1 to n. => out put 6 28 496 8128
// #include <stdio.h>
// int main() {
//     int num, i, sum = 0;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 1; i <= num; i++) {
//         sum = 0;
//         for (int j = 1; j < i; j++) {
//             if (i % j == 0) {
//                 sum += j;
//             }
//         }
//         if (sum == i) {
//             printf("%d ", i);
//         }
//     }
//     return 0;
// }

// Write a C program to check whether a number is Strong number or not.✅
// #include <stdio.h>
// int main() {
//     int num, i, sum = 0, temp, digit;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     temp = num;
//     while (temp != 0) {
//         digit = temp % 10;
//         sum += digit * digit * digit;
//         temp /= 10;
//     }
//     if (sum == num) {
//         printf("%d is a Strong number.\n", num);
//     } else {
//         printf("%d is not a Strong number.\n", num);
//     }
//     return 0;
// }

// Write a C program to print all Strong numbers between 1 to n.=> output 1 153 370 371 407
// #include <stdio.h>
// int main() {
//     int num, i, sum = 0, temp, digit;
//     printf("Enter a number: ");
//     scanf("%d", &num);
//     for (i = 1; i <= num; i++) {
//         temp = i;
//         sum = 0;
//         while (temp != 0) {
//             digit = temp % 10;
//             sum += digit * digit * digit;
//             temp /= 10;
//         }
//         if (sum == i) {
//             printf("%d ", i);
//         }
//     }
//     return 0;
// }

// Write a C program to print Fibonacci series up to n terms.
// #include <stdio.h>
// int main() {
//     int n, i, t1 = 0, t2 = 1, next;
//     printf("Enter the number of terms: ");
//     scanf("%d", &n);
//     printf("Fibonacci Series: %d %d", t1, t2);
//     for (i = 3; i <= n; i++) {
//         next = t1 + t2;
//         t1 = t2;
//         t2 = next;
//         printf("%d ", next);
//     }
//     return 0;
// }

// ----------------------------------binary number ------------------------

// Write a C program to find one's complement of a binary number.✅
// #include <stdio.h>
// int main() {
//     int num, i, bit;
//     printf("Enter a binary number: ");
//     scanf("%d", &num);
//     for (i = 41; i >= 0; i--) {
//         bit = (num >> i) & 1;
//         if (bit == 0) {
//             printf("1");
//         }
//         else {
//             printf("0");
//         }
//     }
//     return 0;
// }

// Write a C program to find two's complement of a binary number.
// #include <stdio.h>
// int main()
// {
//     int num, i, bit, sum = 0;
//     printf("Enter a binary number: ");
//     scanf("%d", &num);
//     for (i = 41; i >= 0; i--)
//     {
//         bit = (num >> i) & 1;
//         if (bit == 0)
//         {
//             sum += 1;
//         }
//         else
//         {
//             sum += 2;
//         }
//     }
//     printf("%d", sum);
//     return 0;
// }

// Write a C program to convert Binary to Octal number system.
//  #include <stdio.h>
//  #include <math.h>
//  int main() {
//     int num, i, bit, octal = 0, power = 0;
//     printf("Enter a binary number: ");
//     scanf("%d", &num);
//     for (i = 41; i >= 0; i--) {
//         bit = (num >> i) & 1;
//         octal += bit * (int)pow(2, power);
//         power++;
//         }
//         printf("%d", octal);
//         return 0;
//  }

// Write a C program to convert Binary to Decimal number system.
// #include <stdio.h>
// int main()
// {
//     int num, i, bit, decimal = 0;
//     printf("Enter a binary number: ");
//     scanf("%d", &num);
//     for (i = 41; i >= 0; i--)
//     {
//         bit = (num >> i) & 1;
//         decimal += bit * (int)pow(2, i);
//     }
//     printf("%d", decimal);
//     return 0;
// }

// Write a C program to convert Binary to Hexadecimal number system.
// #include <stdio.h>
// #include <math.h>
// int main()
// {
//     int num, i, bit, hex = 0, power = 0;
//     printf("Enter a binary number: ");
//     scanf("%d", &num);
//     for (i = 41; i >= 0; i--)
//     {
//         bit = (num >> i) & 1;
//         hex += bit * (int)pow(16, power);
//         power++;
//     }
//     printf("%d", hex);
//     return 0;
// }

// Write a C program to convert Octal to Binary number system.

// Write a C program to convert Octal to Decimal number system.
// Write a C program to convert Octal to Hexadecimal number system.
// Write a C program to convert Decimal to Binary number system.
// Write a C program to convert Decimal to Octal number system.
// Write a C program to convert Decimal to Hexadecimal number system.
// Write a C program to convert Hexadecimal to Binary number system.
// Write a C program to convert Hexadecimal to Octal number system.
// Write a C program to convert Hexadecimal to Decimal number system.

// Write a C program to print Pascal triangle upto n rows.💡🫡
#include <stdio.h>
int main()
{
    int n, i, j, k, c = 1;
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        for (j = 0; j <= i; j++)
        {
            if (j == 0 || j == i)
            {
                printf("%d ", c);
            }
            else
            {
                printf("%d ", c);
                c = c * (i - j + 1) / j;
            }
            }
        printf("\n");
    }
    return 0;
}


