
public class SwapDemoUsingArray {
    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
        int x = 10, y = 20;

        int[] arr = {x, y};

        System.out.println("\n Before Interchange x=" + arr[0] + "\t y=" + arr[1]);
        swap(arr);
        System.out.println("\n After Interchange x=" + arr[0] + "\t y=" + arr[1]);
    }
}