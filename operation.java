public class operation {
    public static void main(String[] args) {
        int x = 2;
        int y = x++ + ++x;
        int z = ++y  + --x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
