class Main {
    public static void main(String[] args) {
        String original = "radar";
        
      String reversed = new StringBuilder(original).reverse().toString();
        
       System.out.println(reversed);
         if (original.equals(reversed)) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not apalindrome");
        }
    }
}
