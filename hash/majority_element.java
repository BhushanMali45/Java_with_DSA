import java.util.*;

public class hash3 {

  //majority element
  ///imp

  public static void main(String args[]) {

    int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
    HashMap<Integer, Integer> map = new HashMap<>();

    
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
      // hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
     

    }
    System.out.println(map);
    Set<Integer> keySet = map.keySet();

    for (Integer key : keySet) {
      if (map.get(key) > arr.length / 3) {
        System.out.println(key);
      }
    }
    // for (Integer key: hm.keySet()) {
    //     if(hm.get(key) >arr.length/3) {
    //         System.out.println(key);
    //     }
    // }

  }
}
