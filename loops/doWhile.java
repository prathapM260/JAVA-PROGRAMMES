
class doWhile {
    public static void main(String[] args) {
        int n = 4;
        int counter = 0;

        do {
            n = n + 1;
            System.out.println(n);
            counter = counter + 1;
        } while (counter < 3);
    }
}