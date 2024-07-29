import java.util.*;

public class calfreq {
   
    // Problem Statement: Given a string, calculate the frequency of characters in a string.
    
    // Example 1:
    // Input: takeuforward
    // Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 
    // Explanation: Count of every character of string is printed. 
    public static void main(String args[]){
        String str="takeuforward";
        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }

        System.out.println(hm);

     

            
        
    }

}
