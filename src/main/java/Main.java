import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericsExample A =new GenericsExample();

        String[] a = {"a","b","s"};
        String[] b = {"s","a","b"};
        String[] c = new String[5];
        A.swapArrat(a,b);

        for (String s:a) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s:b) {
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList<String> S = new ArrayList<String>(A.arrayToArrayList(a));

        System.out.println(S);
    }
}
