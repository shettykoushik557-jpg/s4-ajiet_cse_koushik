class Main {
    public static void main(String[] args) {
        String str = "koushik";
        Map<Character, Integer> charMap = new HashMap<>();

        
        for (char ch : str.toCharArray()) {
           
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        System.out.println("Duplicate characters in \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }
}
