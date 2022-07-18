import java.io.*;

public class ConvertNtoDecimal {
    public String convert(String X, String N) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(N);
        int A = Integer.parseInt(X, n);
        return Integer.toString(A);
    }

    public static void main(String[] args) {
        ConvertNtoDecimal a = new ConvertNtoDecimal();
        System.out.println(a.convert("101101110", "2"));
    }
}