import java.util.ArrayList;
import java.util.List;

public class Sum {


    public void MaxAdd(List a){
        int besti = 0,bestj = 0;
        int max = 0;
        for(int i=0;i<a.size();i++){
            int sum = 0;
            for(int j=i;j<a.size();j++){
                sum += (int)a.get(j);
                if (sum > max){
                    max = sum;
                    besti = i;
                    bestj = j;
                }
            }
        }
        System.out.println("最大字段和为:"+max);
        System.out.println("该字段为:"+besti+"-"+bestj);
    }
}