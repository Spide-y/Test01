import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        long begin,end;
        int result;
        List a = new ArrayList();
        Random r = new Random();
        System.out.print("请输入要求和得数组长度：");
        Scanner sc = new Scanner(System.in);
        int flag = sc.nextInt();
        for (int i = 0;i<flag;i++){
            a.add(i,random(r.nextInt(2)));
        }

//        Sum sum = new Sum();
//        begin = System.currentTimeMillis();
//        sum.MaxAdd(a);
//        end = System.currentTimeMillis();
//        System.out.println("暴力求解算法的运行时间为:"+(end-begin)+"毫秒");


        Sum2 sum2 = new Sum2();
        begin = System.currentTimeMillis();
        result = sum2.MaxAdd(0,a.size()-1,a);
        end = System.currentTimeMillis();
        System.out.println("最大字段和为:"+result);
        System.out.println("分治算法的运行时间为:"+(end-begin)+"毫秒");

        Sum3 sum3 = new Sum3();
        begin = System.currentTimeMillis();
        result = sum3.MaxAdd(a);
        end = System.currentTimeMillis();
        System.out.println("最大字段和为:"+result);
        System.out.println("动态规划算法的运行时间为:"+(end-begin)+"毫秒");

    }


    public static int random(int a){
        Random r = new Random();
        if (a==0){
            return 0-r.nextInt(100);
        }else {
            return r.nextInt(100);
        }
    }

}
