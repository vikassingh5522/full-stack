// --------------------------------------------------    List of star pattern programming exercises---------------------------------

// 1.Square Star Pattern
// *****
// *****
// *****
// *****
// *****
// #include<stdio.h>
// int main()
// {
//     int i,j;
//     for(i=0;i<5;i++)
//     {
//         for(j=0; j<5;j++)
//         {
//            printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// 2.Hollow Square Star Pattern
// *****
// *   *
// *   *
// *   *
// *****
// #include<stdio.h>
// int main()
// {
//     int i,j;
//     for(i=0;i<=4;i++)
//     {
//         for(j=0; j<=4;j++)
//         {
//             if(i==0 || i==4 || j==0 || j==4 )
//             {
//                 printf("*");
//             }
//             else{
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
// }

//    Hollow Square Star Pattern with
// Diagonal
// *****
// ** **
// * * *
// ** **
// *****
// #include <stdio.h>
// int main()
// {
//     int i, j,n;
//     printf("\n Enter the no of stare : ");
//     scanf("%d",&n);
//     for (i = 0; i < n; i++)
//     {
//         for(j=0; j<n;j++)
//         {
//             if( i==0 || i==n-1 || j==0 ||j==n-1)
//             {
//                 printf("*");
//             }
//             else if(i==j)
//             {
//                 printf("*");
//             }
//             else if(j==n-i-1)
//             {
//                 printf("*");
//             }
//             else{
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
// }

// Rhombus Star Pattern
//     *****
//    *****
//   *****
//  *****
// *****
// #include <stdio.h>
// int main()
// {
//     int i, j, n;
//     printf("\n Enter the no of stare : ");
//     scanf("%d",&n);
//     for(int i=0 ; i<n; i++)
//     {
//         for(int j=0; j<n-i; j++)
//         {
//          printf(" ");
//         }
//         for(int j=0; j<n; j++)
//         {
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// 5.Hollow Rhombus Star Pattern
//      *****
//     *   *
//    *   *
//   *   *
//  *****
// #include <stdio.h>
// int main() {
//     int i, j, n;
//     printf("\n Enter the no of stare : ");
//     scanf("%d",&n);
//     for (i = 0; i <= n; i++) {
//         for (j = 0; j <= n - i; j++) {
//             printf(" ");
//         }
//         for (j = 0; j <= n; j++) {
           
//             if (i == 0 || i == n || j == 0 || j == n) {
//                 printf("*");
//             } else {
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }


// 6.Mirrored Rhombus Star Pattern
// *****
//  *****
//   *****
//    *****
//     *****
// #include<stdio.h>
// int main()
// {
//     int i,j, n;
//     printf("\n Enter the no of stare : ");
//     scanf("%d",&n);
//     for(int i=0 ; i<n; i++)
//     {
//         for(int j=0; j<n+i; j++)
//         {
//          printf(" ");
//         }
//         for(int j=0; j<n; j++)
//         {
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// 7.Hollow Mirrored Rhombus Star
// Pattern
// *****
//  *  *
//   *  *
//    *  *
//     *****
// #include <stdio.h>
// int main() {
//     int i, j, n;
//     printf("\n Enter the no of stare : ");
//     scanf("%d",&n);
//     for (i = 0; i <= n; i++) {
//         for (j = 0; j <= n + i; j++) {
//             printf(" ");
//         }
//         for (j = 0; j <= n; j++) {
//             if (i == 0 || i == n || j == 0 || j == n) {
//                 printf("*");
//             } else {
//                 printf(" ");
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }

// 8.Right Triangle Star Pattern
// * 
// **
// ***
// ****
// *****
// #include <stdio.h>
// int main() {
//     int i, j, n;
//     printf("\n Enter the no of stare : ");
//     scanf("%d",&n);
//     for (i = 0; i < n; i++) 
//     {
//         for (j = 0; j < i; j++) 
//         {
//             printf("*");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// Right Triangle Star Pattern
// * 
// **
// * *
// *  *
// *****