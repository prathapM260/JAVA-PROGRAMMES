
class doInsideWhile{
    public static void main(String[] args) {
        int m = 0;
        while (m < 2) {
            System.out.println("Outer While Loop: " + m);
            int n = 0;

            do {
                System.out.println(" Inner Do-While Loop: " + n);
                n = n + 1;
            } while (n < 2);
            m = m + 1;
        }
    }
}