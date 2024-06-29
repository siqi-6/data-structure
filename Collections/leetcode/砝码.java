package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


// 给出N个不同价格，N个不同数量 ，有多少种组合

public class 砝码 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 注意 hasNext 和 hasNextLine 的区别
            while (in.hasNextInt()) { // 注意 while 处理多个 case
                int a = in.nextInt();
                int[] m = new int[a];
                int[] n = new int[a];
                for (int i = 0; i < a; i++) {
                    m[i]=in.nextInt();
                }
                for (int i = 0; i < a; i++) {
                    n[i]=in.nextInt();
                }
                category(a,m,n);

            }
        }
        public static void category(int a, int[]m ,int[]n){
            HashSet<Integer> set = new HashSet<>();
            set.add(0);
            for (int i = 0; i <a ; i++) {
                ArrayList<Integer> arr = new ArrayList<>(set);
                for (int j = 0; j <=n[i]; j++) {
                    for (int k = 0; k < arr.size(); k++) {
                        set.add(arr.get(k)+j*m[i]);
                    }
                }
            }
            System.out.println(set.size());

        }
}


