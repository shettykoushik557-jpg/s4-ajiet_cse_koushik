class Main {
    public static void main(String[] args) {
        int number = 2562006;=
        int reversedNumber = 0;
        
        System.out.println("Original Number: " + number);
        
       
        while (number != 0) {
            int remainder = number % 10;         
            reversedNumber = reversedNumber * 10 + remainder; 
            number = number / 10;                 
        }
        
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
