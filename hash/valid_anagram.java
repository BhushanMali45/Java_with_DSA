import java.util.*;

public class heap4 {

  //valid anagram

  public static boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> map = new HashMap<>();


    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }


//t loop chalel
    for (int i = 0; i < t.length(); i++) {
      char ch = s.charAt(i);

      if (map.get(ch) != null) {
        if (map.get(ch) == 1) {
          map.remove(ch);
        } else {
          map.put(ch, map.get(ch) - 1);
        }
      }
    }



    return map.isEmpty();
  }



  public static void main(String args[]) {
    String s = "race";
    String t = "care";
    System.out.println(isAnagram(s, t));
  }
}
