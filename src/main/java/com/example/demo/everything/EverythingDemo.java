package com.example.demo.everything;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @描述:demoEverything
 * @Author:zhuangxinan
 * @Date:2021/2/20 14:35
 */
public class EverythingDemo {
    public static void main(String[] args) {
        //Pattern和Matcher类
        boolean b = Pattern.matches("abc","abc");
        if(b){
            System.out.println("yes");
        }

        //自动装箱对性能的影响
        Long sum = 0L;
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1 + "ms");
        System.out.println(sum);

        long sum2 = 0L;
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2 + "ms");
        System.out.println(sum2);

        //sort()的JDK源码实现
        int[] a = new int[3];
        Arrays.sort(a);

        //ArrayList的remove()
        ArrayList<Integer> list = new ArrayList<>();
        list.remove(sum);
    }
}
