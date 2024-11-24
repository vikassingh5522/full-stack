// // Array in Java

// It is ordered collection of indexed elements having same data type which are
// conti. arranged in the memory.

// Decl. Syntax:

//     <data_type> <arr_nm>[];		<data_type> []<arr_nm>;	

//     e.g.
//     int ar[];			int []ar;

// * Note 
//     - In this decl, <element_count> is absent.
//     - Above decl. creates the reference only.(same as pointer variable in C)

//     In above both cases,

//     ar
//      [  ]


// To allocate the memnory we need to use new keyword as..

//     - Syntax
//         <data_type> []<arr_nm> = new <data_type>[<size>];

//         e.g.
//             int []ar = new int[5];

//         ar
//         [   ] ----------------> [] [] [] [] []

// * Note that, Here in java array gains the dynamic memory space(like pointer in C), and
//   new keyword used to allocate the memory for it.

// // Init of array in java

// It is simple and same as we have seen in the C-C++, except [] does not contains the SIZE.

// e.g.
//     int []x = {12,45,83,42,39};

//     x            0    1    2    3    4 
//     [ ] ------> [12] [45] [83] [42] [39]

// // WAP to init and display the array.


class InitArray
{
    
        public static void main(String []args)
	{
		int []x = {12,45,83,42,39,78};

		System.out.println("\n1. Array elements are: ");
		for(int i=0 ; i<6 ; i++)
		{
			System.out.print("   "+x[i]);
		}

		System.out.println("\n2. Array elements are: ");
		for(int i=0 ; i<x.length ; i++)
		{
			System.out.print("  "+x[i]);
		}

		// using for-each loop
		System.out.println("\n3. Array elements are: ");
		for(int val : x)
		{
			System.out.print("   "+val);
		}
	}
    }
