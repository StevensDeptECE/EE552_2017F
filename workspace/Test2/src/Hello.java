
public class Hello {
    public static int countEvenDigits(int num) {
        int count = 0;
        while (num >= 0) {
            if (num % 2 == 0) {
            	count++; 
            }
            num = num/10; // peel off the number
        }
        return count;
    }
  
    public static void main(String[] args) {
        System.out.println(countEvenDigits(234));
    }
}

