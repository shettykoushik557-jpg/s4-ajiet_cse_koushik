class Main {
    public static void main(String[] args) {
        String str = "k o u s h i k";
        String result = str.replaceAll("\\s+", "");
        
        System.out.println("Original: " + str);
        System.out.println("Without spaces: " + result);
    }
}

