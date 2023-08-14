public class snakepattern {

    public static void main(String[] args) {
        String str = "a10b3c2";

        for (int i = 0; i < str.length(); i++) {
            int num;
            if (Character.isDigit(str.charAt(i))) {
                num = str.charAt(i) - '0'; // Convert char to int

                int j = i + 1;
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    int var = str.charAt(j) - '0'; // Convert char to int
                    num = num * 10 + var;
                    j++;
                }
                print(num, str, i - 1); // Pass the correct index to the print function
            }
        }
    }

    private static void print(int n, String s, int i) {
        for (int j = 0; j < n; j++) {
            System.out.print(s.charAt(i));
        }
    }
}
