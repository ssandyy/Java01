package javajan;

public class Test {
    public static void main(String[] args) {
        String name = "chatgpt";
        int n = name.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(name.charAt((j + i) % n));
            }
            System.out.println();
        }
    }
}
