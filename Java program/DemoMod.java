// Unlike C/C++, Here in java you can operate the % operator on fractional and -ve values,
// when you operate the % operator on -ve values the sign of ans is taken as the sign of N form N/D.
// class DemoMod


public class DemoMod {
    public static void main(String[] args) 
    {
       int x=-12, y=5, z=-3;
       System.out.println("-%+: "+(x%y));
		System.out.println("-%-: "+(x%z));
		System.out.println("+%-: "+(21%z));
		System.out.println("+%+: "+(33%4));

		System.out.println("+%+: "+(33.5%4));
		System.out.println("+%+: "+(36.5%2.3));
    }
}
