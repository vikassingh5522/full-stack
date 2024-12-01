import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoIf {

    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int a = 0;

        System.out.println("Enter the value of a: ");
        a = Integer.parseInt(br.readLine());
        if (a % 7 == 0) {
            System.out.println("Entered no is div by 7 ");
        }
        if (a % 7 != 0) {
            System.out.println("Entered no is not div by 7 ");
        }

    }
}
