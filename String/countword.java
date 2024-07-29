public class countword{
    public static void main(String args[]){
        String str="I am Bhushan";


        // Split the string into words and print each word
        String[] words = str.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
int space=1;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)== ' '){
              space+=1;
        }
       }
       System.out.println(space);
    }
}



// import java.io.*;
// import java.util.*;

// class Main {

//   // Driver code
//   public static void main(String[] args) {
//     String str = "HI AMY AND JAY";
//     System.out.println("Number of words are " + countWords(str));
//   }

//   public static int countWords(String s) {
//     String[] words = s.split(" ");
//     return words.length;
//   }
// }