package ceshi;

import org.junit.Test;

public class ThreeNum {
     int[] num;
     int target;

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    public ThreeNum(int[] num, int target) {
        this.num = num;
        this.target = target;
    }
    public ThreeNum() {
    }
    @Test
    public  void pointer(ThreeNum t) {
        int[] nums = t.num;
        int target = t.target;

        if (nums == null || nums.length == 0) {
            System.out.println("数组为空");
            return;
        }
        if (nums == null) {
            System.out.println("目标对象为空");
            return;
        }
        int counter = 0;
        int lengths = nums.length-1;
        for (int i = 0; i < lengths; i++) {
            int left = (i + 1);
            int right = lengths;
            int low = (i + 1);
            int high = lengths;
            while (left < right) {
                while (low < high) {
                    if ((nums[i] + nums[low] + nums[high]) == target) {
                        if(counter == 0){
                            System.out.println("三个数下标" + target + "的分别是: " + i +"、" + low + "和" + high);
                            counter++;
                        }

                    }
                    high--;
                }
                high = right--;
                low = ++left;
                while (low < high) {
                    if ((nums[i] + nums[low] + nums[high]) == target) {
                        if(counter == 0){
                            System.out.println("三个数下标" + target + "的分别是: " + i +"、" + low + "和" + high);
                            counter++;
                        }
                    }
                    low++;
                }
                low = left;
                high--;
            }
        }
        if (counter == 0){
            System.out.println("输出为null");
        }
    }
}