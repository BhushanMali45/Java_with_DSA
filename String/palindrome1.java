
public class palindrome {

    public static boolean ispalindrome(String str)
{
    for(int i=0;i<str.length();i++){//2
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-1-i)){
return false;
        }
    }
    return true;

}    public static void main(String args[]){
        String str="bbbhh";
    System.out.println( ispalindrome(str));
    }
}
