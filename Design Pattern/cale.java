

// 3. Varargs: Varargs (variable-length arguments) allow you to pass a variable number of 
// 	   arguments to a method. This can be used to simulate default arguments by checking the 
// 	   length of the varargs array.
// // 


class  cale
{
    public int add(int ... n)
    {
        int sum = 0;
        for (int i : n)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        cale c = new cale();
        System.out.println(c.add(1,2,4,5,7,8,9));
        

    }
}