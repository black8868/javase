package cn.com.xiaoyao.array;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.array
 * @ClassName: ArrayFor
 * @Author: zhangkaixuan
 * @Description:
 * @Date: 2020/5/15
 * @Version: 1.0
 */
public class ArrayFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        int x;
        x = in.nextInt();
        while (x != -1)
        {
            if (x>0 && x<=9)
            {
                numbers[x]++;
            }
            x= in.nextInt();
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(i+":"+numbers[i]);
        }

        HashMap<String,String> map = new HashMap<>();
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }


    }



}
