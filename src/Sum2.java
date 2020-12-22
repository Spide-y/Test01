import java.util.List;

public class Sum2 {
    public int MaxAdd(int left, int right, List a){
        int sum = 0;
        if (left==right) sum = (int)a.get(left)>0 ? (int)a.get(left):0;
        else {
            int center = (left+right)/2;
            int leftSum = MaxAdd(left,center,a);
            int rightSum = MaxAdd(center+1,right,a);
            int s1 = 0;
            int lefts = 0;
            for (int i = center;i>=left;i--){
                lefts += (int)a.get(i);
                if (lefts>s1) s1 = lefts;
            }
            int s2 = 0;
            int rights = 0;
            for (int i=center+1;i<=right;i++){
                rights += (int)a.get(i);
                if (rights>s2) s2 = rights;
            }
            sum = s1+s2;
            if (sum<leftSum) sum = leftSum;
            if (sum<rightSum) sum = rightSum;
        }
        return sum;
    }
}
