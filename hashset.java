import java.util.HashSet;
public class Main{
    public static void main(String[]args){
        HashSet <Integer> ai=new HashSet<>();
        ai.add(2);
        ai.add(20);
        ai.add(2);
        System.out.println(ai);
        System.out.println("Size: "+ai.size());
        System.out.println(ai.contains(2));
        ai.remove(20);
        System.out.println(ai);
        
    }
    
}
