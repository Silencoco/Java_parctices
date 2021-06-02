package anything;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Supplier;

/*
    求数组元素最大值
 */
public class MaxNum_Comparator {
    public static Integer getInteger(Supplier<Integer> supplier){
        return supplier.get();
    }
    public static Comparator<Integer> compare(){
        return (a,b)->b-a;
    }

    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {16,2,54,-55,3,4,5,6,9};
        for (int i:arr
             ) {
            System.out.print(i+"\t");
        }
        System.out.println();
        //通过升序排序，然后取最后一个值
        Arrays.sort(arr);//sort只能排序int 型的数组
        for (int i:arr
        ) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println(arr[arr.length-1]);
    }
}
