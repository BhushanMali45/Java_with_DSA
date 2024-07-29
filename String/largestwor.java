public class largestwor {
    
        public static void main(String[] args) {
            System.out.println(largestWord("Google Doc"));  // Output: "Google"
            System.out.println(largestWord("Microsoft Teams"));  // Output: "Microsoft"

            
        }
    
        public static String largestWord(String s) {
            String words[] = s.split(" ");

            String largest = "";

            for (String word : words) {
                if (word.length() > largest.length()) {
                    largest = word;
                }
            }



            
            return largest;
        }
    }

