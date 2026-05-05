class Main {
    public static void main(String[] args) {
        
        int[] numbers = {10, 5, 21, 3};

        
        if (numbers.length == 0) {
            System.out.println("The array is empty");
            return;
        }

        
        int largest = numbers[0];
        int smallest = numbers[0];

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
