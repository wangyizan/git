package ceshi;

import org.junit.Test;

class ceshi2 {
    @Test
        public static void main(String[] args){
            ThreeNum a = new ThreeNum();
            int[] num = {-1,-2,3,5,6,8,1,2,3,4,7,9};
            int A = 90;
            finger(num,A);
        }
    public static void finger(int[] nums, int target) {
        if (nums == null) {
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




