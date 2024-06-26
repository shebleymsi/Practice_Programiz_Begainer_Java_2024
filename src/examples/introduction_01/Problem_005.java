package examples.introduction_01;



public class Problem_005 {
    // Example: Compute Quotient and Remainder
    // dividend(ভাজ্য/লভ্যাংশ); divisor(ভাজক); quotient(ভাগফল); remainder(অবশিষ্ট);
    public static void main(String[] args) {

        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }
}
