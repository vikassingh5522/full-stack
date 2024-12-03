// Multi-dimentional Array: Collection of references to another arrays.

// 	<data_type> [][]<ar_ name>;	-->	int [][]ar;

// 						  ar
// 						   [ ]

// 	memory allocation:

// 	<data_type> [][]<ar_ name> = new <data_type>[rows][cols] ;

// 	case 1:	int [][]ar = new int[3][];

// 			ar
// 			[  ] -------->  [ ]
// 					[ ]
// 					[ ]

// 	case 2:	int [][]ar = new int[3][4];

// 			ar
// 			[  ] -------->  [ ]------>[][][][]
// 					[ ]------>[][][][]
// 					[ ]------>[][][][]

// init. of 2D Array:

import java.util.*;

class Init2dArray {
    public static void main(String[] args) {
      
        int [][] x = {{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,4,5}};

        System.out.println("\n Array elements are");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(" "+x[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n elments are");
        for(int i=0;i<x.length; i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(" "+x[i][j]);
            }
            System.out.println();
        }

    }
}