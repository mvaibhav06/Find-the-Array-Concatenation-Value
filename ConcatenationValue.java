import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcatenationValue {
    public static long findTheArrayConcVal(int[] nums) {
        long out = 0;

        int i = 0;
        int j = nums.length-1;

        while(i<=j){
            if(i==j){
                out += nums[i];
                break;
            }
            int a = nums[i];
            int b = nums[j];
            List<Integer> myList = new ArrayList<>();

            while(b > 0){
                int temp = b%10;
                myList.add(temp);
                b = b/10;
            }
            Collections.reverse(myList);
            for(int p : myList){
                a = (a*10) + p;
            }
            out += a;
            i++;
            j--;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(nums));
    }
}
