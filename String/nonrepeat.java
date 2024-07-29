import java.util.*;

public class nonrepeat {
//     Problem:  Given a string, print non-repeating characters of the string.



// Example 1:
// Input: string = “google”
// Output: l,e

// Explanation: Non repeating characters are l,e.

// Example 2:
// Input: string = “yahoo”
// Output: y,a,h
// Explanation: Non repeating characters are y,a,h
public static void main(String args[]) {
    String str = "google";
    char arr[] = str.toCharArray();

    HashMap<Character, Integer> hm = new HashMap<>();

    // Count the frequency of each character
    for (int i = 0; i < str.length(); i++) {
        if (hm.containsKey(arr[i])) {
            hm.put(arr[i], hm.get(arr[i]) + 1);
        } else {
            hm.put(arr[i], 1);
        }
    }

    // Print the characters that are not repeating
System.out.println(hm);

Set<Character>keySet=hm.keySet();
for (char c : keySet) {
    if(hm.get(c)==1){
        System.out.print(c+",");
    }
}




   
}
}



