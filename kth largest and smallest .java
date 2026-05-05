import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] numbers = {45, 10, -12, 9, 4, 89};
        int k = 2; 
       
        Arrays.sort(numbers);
       
        if (k > 0 && k <= numbers.length) {
            int kthSmallest = numbers[k - 1]; 
            int kthLargest = numbers[numbers.length - k];

            System.out.println(k + "nd Smallest: " + kthSmallest);
            System.out.println(k + "nd Largest: " + kthLargest);
        } else {
            System.out.println("Invalid value of K");
        }
    }
}
        
        
