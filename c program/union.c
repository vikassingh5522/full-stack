// --------------------------------------------------------------- Union in C ----------------------------------------------------------------------------

// Union:  It is same as that of structure, only differewnce is that structure holds all members
// 		at a time and union holds any one. The memory allocated for variable of union is equala
// 		to highest memory holder member in the union.
// e.g.

// struct Demo			union Demo
// {				{
// 	int x;				int x;
// 	char ch;			char ch;
// 	double db;			double db;
// 	float t;			float t;
// };				};

// struct Demo v1;			union Demo v2

//   v1				            v2
//     _____________________	 _______
//    |___|__|________|____|	|______|
//  	17 bytes		  8 bytes
// -----------------------------------------------------------------------------------------------------------
// #include <stdio.h>
// union Demo
// {
// 	int x;
// 	float y;
// 	double db;
// 	char ch;
// };
// int main()
// {
// 	union Demo v2;
// 	printf("\n Memory allocated for v2 is %d bytes",sizeof(v2));
// 	return 0;
// }
// -----------------------------------------------------------------------------------------------------------

// Enter the different union members and display
// #include <stdio.h>
// union Demo
// {
// 	int x;
// 	float y;
// 	double db;
// 	char ch;
// };

// int main()
// {
// 	union Demo v2;
// 	printf("\n Enter the char value: ");
//     	scanf("%c",&v2.ch);
// 	printf("\n Enter the int value: ");
//     	scanf("%d",&v2.x);
// 	printf("\n Enter the float value: ");
//     	scanf("%f",&v2.y);
// 	printf("\n Enter the double value: ");
//     	scanf("%lf",&v2.db);
//     	printf("\n ch is: %c",v2.ch);
//     	printf("\n x is: %d",v2.x);
//     	printf("\n y is: %f",v2.y);
//     	printf("\n db is: %lf",v2.db);
// 	return 0;
// }
//  ========= output =======
//  Enter the char value: A

//  Enter the int value: 12

//  Enter the float value: 6.7

//  Enter the double value: 435.674

//  ch is: ►
//  x is: -1271310320
//  y is: -0.000000
//  db is: 435.674000

// -----------------------------------------------------------------------------------------------------------------------------------------------
// lets get correct result

// #include <stdio.h>
// union Demo
// {
// 	int x;
// 	float y;
// 	double db;
// 	char ch;
// };

// int main()
// {
// 	union Demo v2;

// 	printf("\n Enter the char value: ");
//     	scanf("%c",&v2.ch);
//     	printf("\n ch is: %c",v2.ch);

// 	printf("\n Enter the int value: ");
//     	scanf("%d",&v2.x);
//     	printf("\n x is: %d",v2.x);

// 	printf("\n Enter the float value: ");
//    	scanf("%f",&v2.y);
//    	printf("\n y is: %f",v2.y);

// 	printf("\n Enter the double value: ");
//     	scanf("%lf",&v2.db);
//     	printf("\n db is: %lf",v2.db);

// 	return 0;
// }

//  ---- output --------

//  Enter the char value: Q

//  ch is: Q
//  Enter the int value: 230

//  x is: 230
//  Enter the float value: 4.5

//  y is: 4.500000
//  Enter the double value: 56.7865

//  db is: 56.786500

// -----------------------------------------------------------------------------------------------------------------------------------
// ----------------- Enum in C ----------------------

// Enums are used to decl. multiple constants.✅

// In C, Thre are following ways of constant decl.✅

// 		1. using the const keyword
// 		2. using #define
// 		3. using enums
// 1. using the const keyword:

// 		const int x=10;		const char ch='q';

// 		in above cases, we are not allowed to change the values, if we attempt, the
// 		compiler will generate an error message.

// 	2. using #define:

// 		#define SIZE 100;

// 		Here also the value of SIZE remains 100, we cant alter it.

// ---------------------------------------------------------------------------------------------------------------
// #include <stdio.h>
// #define SIZE 100
// int main()
// {
// 	const char ch='q';

// 	printf("\n ch: %c",ch);
// 	printf("\n size: %d",SIZE);

// 	// SIZE=300;    // error
// 	// ch='r';      // error

// 	return 0;
// }
// ---------------------------------------------------------------------------------------------------------------------------

	// 3. using enums: The enums are used to decl, multiple constant at a time.

	// 	e.g.
	// 		enum{red, green, blue, black};		enum{red, green=5, blue, black=10,pink};

	// 		red =0					red=0
	// 		green =1				green=5
	// 		blue =2					blue=6
	// 		black =3				black=10
	// 							    pink=11

// int main()
// {
// 	enum{red, green, blue, black};		
	
// 	printf("red: %d \t green: %d \t blue: %d \t black: %d",red,green,blue,black);

// 	return 0;
// }

//-----------------------------------------------------------------
// int main()
// {
// 	enum{red, green=5, blue, black=10,pink};
		
	
// 	printf("red: %d \t green: %d \t blue: %d \t black: %d \t pink: %d",red,green,blue,black,pink);

// 	return 0;
// }
