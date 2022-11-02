public class CodingBatArray2 {
    public static void main(String[] args) {
        /*
        (countEvens)
        public int countEvens(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        if(nums[i] % 2 == 0) count++;
        return count;
        }
        (bigDiff)
        public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
        min = Math.min(min,nums[i]);
        max = Math.max(max,nums[i]);
        }
        return max - min;
        }
        (centeredAverage)
        public int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
        sum+=nums[i];
        min = Math.min(min,nums[i]);
        max = Math.max(max,nums[i]);
        }
        return (sum - min - max) / (nums.length - 2 );
        }
        (sum13)
        public int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
        if(nums[i] == 13){
        i += 1;
        continue;}
        sum += nums[i];
        }
        return sum;
        }
        (sum67)
        public int sum67(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length; i++){
        if(nums[i]==6){
        while(nums[i]!=7)
        i++;
        continue;
        }else{
        sum+=nums[i];
        }
        }return sum;
        }
        (has22)
        public boolean has22(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++)
        if(nums[i] == 2 && nums[i+1] == 2){ return true;}
        return false;
        }
        (lucky13)
        public boolean lucky13(int[] nums) {
        for(int i=0; i<nums.length; i++)
        if(nums[i] == 1 || nums[i] == 3) return false;
        return true;
        }
        (sum28)
        public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        if(nums[i] == 2) sum+=nums[i];
        return sum == 8;
        }
        (more14)
        public boolean more14(int[] nums) {
        int ct1 = 0;
        int ct4 = 0;
        for(int i=0; i<nums.length; i++) {
        if(nums[i] == 1) ct1++;
        if(nums[i] == 4) ct4++; }
        return ct1 > ct4;
        }
        (fizzArray)
        public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        arr[i] = i;
        return arr;
        }
        (only14)
        public boolean only14(int[] nums) {
        for(int i=0; i<nums.length; i++)
        if(nums[i] != 1 && nums[i] != 4) return false;
        return true;
        }
        (fizzArray2)
        public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for(int i = 0; i < n; i++)
        arr[i] = String.valueOf(i);
        return arr;
        }
        (no14)
        public boolean no14(int[] nums) {
        boolean a = false;
        boolean b = false;
        for(int i=0; i<nums.length; i++){
        if( nums[i] == 1)  a = true;
        if( nums[i] == 4)  b = true; }
        return !a || !b;
        }
        (isEverywhere)
        public boolean isEverywhere(int[] nums, int val) {
        for(int i=0; i<nums.length-1; i++)
        if(nums[i] != val && nums[i + 1] !=val) return false;
        return true;
        }
        (either24)
        public boolean either24(int[] nums) {
        int ct1 = 0;
        int ct2 = 0;
        for(int i=0; i<nums.length-1; i++) {
        if(nums[i] == 2 && nums[i+1] == 2) ct1++;
        if(nums[i] == 4 && nums[i+1] == 4) ct2++; }
        return ct1 != ct2;
        }
        (matchUp)
        public int matchUp(int[] nums1, int[] nums2) {
        int ct = 0;
        for(int i=0; i<nums1.length; i++) {
        if(Math.abs(nums1[i] - nums2[i]) == 1 || Math.abs(nums1[i] - nums2[i]) == 2) ct++; }
        return ct;
        }
        (has77)
        public boolean has77(int[] nums) {
        for(int i=0; i<nums.length -1; i++){
        if(nums[i] == 7 && nums[i+1] == 7 ) return true;}
        for(int i=0; i<nums.length -2; i++){
        if(nums[i] == 7 && nums[i+2] == 7) return true; }
        return false;
        }
        (has12)
        public boolean has12(int[] nums) {
        boolean f1 = false;
        for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 1)   f1 = true;
        if(f1 && nums[i] == 2)  return true;
        }
        return false;
        }
        (modThree)
        public boolean modThree(int[] nums) {
        for(int i=0; i<=nums.length -3; i++)
        if(nums[i] % 2 == nums[i+1] % 2 &&  nums[i] % 2 == nums[i+2] % 2) return true;
        return false;
        }
        (haveThree)
        public boolean haveThree(int[] nums) {
        int count = 0;
        if(nums.length >= 1 && nums[0] == 3)
        count++;
        for(int i = 1; i < nums.length; i++) {
        if(nums[i - 1] == 3 && nums[i] == 3)
        return false;
        if(nums[i] == 3)
        count++;
        }
        return count == 3;
        }
        (twoTwo)
        public boolean twoTwo(int[] nums) {
        for (int i=0; i<nums.length; i++){
        if (nums[i] != 2) continue;
        if (i >= 1 && nums[i-1] == 2)
        continue;
        if (i < (nums.length-1) && nums[i+1] == 2)
        continue;
        return false;  }
        return true;
        }
        (sameEnds)
        public boolean sameEnds(int[] nums, int len) {
        for(int i=0; i<len; i++)
        if(!(nums[i] == nums[nums.length - len + i])) return  false;
        return true;
        }
        (tripleUp)
        public boolean tripleUp(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++)
        if(nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2] )
        return true;
        return false;
        }
        (fizzArray3)
        public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        for(int i = start; i < end; i++)
        arr[i - start] = i;
        return arr;
        }
        (shiftLeft)
        public int[] shiftLeft(int[] nums) {
        if(nums.length < 1) return nums;
        int first = nums[0];
        for(int i = 1; i < nums.length; i++)
        nums[i - 1] = nums[i];
      nums[nums.length - 1] = first;
        return nums;
        }
        (tenRun)
        public int[] tenRun(int[] nums) {
        int current;
        int i = 0;
        while(i < nums.length && nums[i] % 10 != 0)
        i++;
        if(i >= nums.length)
        return nums;
        current = nums[i];
        i++;
        while(i < nums.length) {
        if(nums[i] % 10 == 0)
        current = nums[i];
        else
        nums[i] = current;
        i++;
        }
        return nums;
        }
        (pre4)
        public int[] pre4(int[] nums) {
        int i = 0;
        while(nums[i] != 4)
        i++;
        int[] arr = new int[i];
        for(int j = 0; j < i; j++)
        arr[j] = nums[j];
        return arr;
        }
        (post4)
        public int[] post4(int[] nums) {
        int i = nums.length - 1;
        while(nums[i] != 4)
        i--;
        int[] arr = new int[nums.length - i - 1];
        for(int j = 0; j < arr.length; j++)
        arr[j] = nums[i + j + 1];
        return arr;
        }
        (notAlone)
        public int[] notAlone(int[] nums, int val) {
        int[] arr = new int[nums.length];
        if(nums.length >= 1) {
        arr[0] = nums[0];
        arr[arr.length-1] = nums[nums.length-1];
        }
        for(int i = 1; i <= nums.length - 2; i++) {
        if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1])
        arr[i] = Math.max(nums[i-1], nums[i+1]);
        else
        arr[i] = nums[i];
        }
        return arr;
        }
        (zeroFront)
        public int[] zeroFront(int[] nums) {
        if(nums.length == 0)
        return nums;
        int i = 0;
        while(nums[i] == 0)
        i++;
        for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] == 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        }
        }
        return nums;
        }
        (withoutTen)
        public int[] withoutTen(int[] nums) {
        int i = 0;
        while(i < nums.length && nums[i] != 10)
        i++;
        for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] != 10) {
        nums[i] = nums[j];
        nums[j] = 10;
        i++;
        }
        }
        for( ; i < nums.length; i++)
        nums[i] = 0;
        return nums;
        }
        (zeroMax)
        public int[] zeroMax(int[] nums) {
        int i = nums.length - 1;
        while(i >= 0 && nums[i] % 2 == 0)
        i--;
        for(int j = i - 1; j >= 0; j--) {
        if(nums[j] == 0)
        nums[j] = nums[i];
        if(nums[j] % 2 == 1 && nums[j] > nums[i])
        i = j;
        }
        return nums;
        }
        (evenOdd)
        public int[] evenOdd(int[] nums) {
        int i = 0;
        while(i < nums.length && nums[i] % 2 == 0)
        i++;
        for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] % 2 == 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        }
        }
        return nums;
        }
        (fizzBuzz)
        public String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];
        for(int i = start; i < end; i++) {
        if(i % 15 == 0) {
        arr[i - start] = "FizzBuzz";
        } else if(i % 3 == 0) {
        arr[i - start] = "Fizz";
        } else if(i % 5 == 0) {
        arr[i - start] = "Buzz";
        } else {
        arr[i - start] = String.valueOf(i);
        }
        }
        return arr;
        }

        That's all...  :)

        
         */
    }
}
