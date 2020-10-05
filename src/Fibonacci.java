public class Fibonacci {
    public static void main(String args[]) {
        int arr[] = new int[20];
        System.out.print("Sucesión de Fibonacci: ");
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                c = a + b;
                arr[i] = c;
            } else {
                c = a + b;
                arr[i] = c;
                a = b;
                b = c;
            }
        }
        for (int h = 0; h < 20; h++) {
            System.out.print(arr[h]);
            System.out.println(" "+" ");
        }
    }
}
