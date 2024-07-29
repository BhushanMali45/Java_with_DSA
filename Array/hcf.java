public class hcf {

    public static int hcf(int a, int b) {
        int smaller = Math.min(a, b);//lahan number
        int hcf = 1;

        for (int i = 1; i <= smaller; i++) { //1 te smaller print
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String args[]) {
        int a = 70;
        int b = 15;
        System.out.println("HCF: " + hcf(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}
