package examples.introduction_01;

public class Problem_006_01 {
    //Example 1: Swap two numbers using temporary variable
    //A N M BAZLURR RAHMAN

    public static void main(String[] args) {
        temporarySwap();
    }

    public static void temporarySwap() {
        int a = 5, b = 10;

        int temp = a;
        a=b;
        b = temp;

        System.out.println("a is : "+ a);
        System.out.println("b is : "+ b);

    }


}
