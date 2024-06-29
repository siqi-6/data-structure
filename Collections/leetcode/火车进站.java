package leetcode;

import java.util.*;

// 输入进站的数量以及标号，求栈的进出方法
public class 火车进站 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Set<String> set=new TreeSet<>();
            solve(arr,0,"",new ArrayList(),set);
            for(String s:set)
                System.out.println(s.trim());
        }
        sc.close();
    }

    private static void solve(int[] arr, int index, String res, List<Integer> list, Set<String> set) {
        if(index==arr.length) {
            for(int i=list.size()-1;i>=0;i--) {
                res=res+" "+list.get(i);
            }
            set.add(res);
            return ;
        }
        while(true) {
            List<Integer> tmp=new ArrayList<>(list);
            tmp.add(arr[index]);
            solve(arr,index+1,res,tmp,set);
            if(list.size()==0)
                break;
            res=res+" "+list.remove(list.size()-1);
        }
    }


}
