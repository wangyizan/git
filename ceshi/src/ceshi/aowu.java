package ceshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ceshi {
    private static int count;
        public static void main(String[] args){
            int[] num = {-1,-2,3,5,6,8,1,23,4,7,9};
//            System.out.println(arrayToString(num,"初始数组"));
//            QuickSort(num,0,num.length - 1);
//            System.out.println(arrayToString(num,"结果数组"));
            finger(num,0);

        }
    /**
     * 双指针法
     * @param nums
     * @param target
     */
    public static void finger(int[] nums, int target) {
        if (nums == null) {
            return;
        }

        // 记录数组的长度
        int lengths = nums.length-1;

        // 先固定一个值，要么固定最左边的值，要么固定最右边的值
        for (int i = 0; i < lengths; i++) {

            int left = (i + 1); // 左指针
            int right = lengths; // 右指针

            int low = (i + 1); // 临时左指针
            int high = lengths; // 临时右指针

            // 当左指针小于右指针的时候，就不需要循环了
            while (left < right) {

                // 比较临时指针
                while (low < high) {
                    if ((nums[i] + nums[low] + nums[high]) == target) {
                        System.out.println("三个数下标" + target + "的分别是: " + i +"、" + low + "和" + high);
                    }
                    high--; // 相当于从右往左一直找数
                }

                high = right--; // 循环找完一遍数之后，把临时右指针还原，右指针减1
                low = ++left; // 因为临时左指针第一个元素已经比较完，所有临时左指针加1，左指针也加1

                while (low < high) {
                    if ((nums[i] + nums[low] + nums[high]) == target) {
                        System.out.println("三个数下标" + target + "的分别是: " + i +"、" + low + "和" + high);
                    }
                    low++; // 相当于从左往右一直找数
                }

                low = left; // 循环找完一遍数之后，把临时左指针还原，下次循环使用
                high--; // 临时右指针也减1，下次循环使用
            }
        }
    }
//        public static List<List<Integer>> threeSum(int[] nums) {
//            List<List<Integer>> ans = new ArrayList();
//            int len = nums.length;
//            if(nums == null || len < 3) return ans;
//            Arrays.sort(nums); // 排序
//            for (int i = 0; i < len ; i++) {
//                if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
//                if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
//                int L = i+1;
//                int R = len-1;
//                while(L < R){
//                    int sum = nums[i] + nums[L] + nums[R];
//                    if(sum == 0){
//                        ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
//                        while (L<R && nums[L] == nums[L+1]) L++; // 去重
//                        while (L<R && nums[R] == nums[R-1]) R--; // 去重
//                        L++;
//                        R--;
//                    }
//                    else if (sum < 0) L++;
//                    else if (sum > 0) R--;
//                }
//            }
//            return ans;
//        }
    }

//        private static String arrayToString(int[] arr,String name){
//            String str = "数组为（"+name+"）；";
//            for(int a :arr){
//                str += a +"\t";
//            }
//            return str;
//        }
//
//        private static void QuickSort(int[] num, int left ,int right){
//
//            if(left >= right){
//                return;
//            }
//            int key = num[left];
//            int i = left;
//            int j = right;
//            while(i<j){
//                while(num[j] >= key && i<j){
//                    j--;
//                }
//                while(num[i] <= key && i<j){
//                    i++;
//                }
//                if(i<j){
//                    int temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }
//            }
//            num[left] = num[i];
//            num[i] = key;
//            count++;
//            QuickSort(num,left,i-1);
//            QuickSort(num,i+1,right);
//        }



