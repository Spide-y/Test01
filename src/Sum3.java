import java.util.List;

public class Sum3 {
    public int MaxAdd(List a) {
        int n = a.size();
        int sum = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (b > 0) b += (int) a.get(i);
            else b = (int) a.get(i);
            if (b > sum) sum = b;
        }
        return sum;
    }
}
