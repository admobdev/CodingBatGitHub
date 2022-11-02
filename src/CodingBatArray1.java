public class CodingBatArray1 {
    public static void main(String[] args) {
        /*
        (firstLast6)
        public boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length - 1] == 6) return true;
        return false;
        }
        (sameFirstLast)
        public boolean sameFirstLast(int[] nums) {
        if(nums.length > 0 && nums[0] == nums[nums.length-1]) return true;
        return false;
        }
        (makePi)
        public int[] makePi() {
        int[] x = {3,1,4};
        return x;
        }
        (commonEnd)
        public boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;
        return false;
        }
        (sum3)
        public int sum3(int[] nums) {
        int sum = nums[0] + nums[1] + nums[2]; return sum;
        }
        (rotateLeft3)
        public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = temp;
        return nums;
        // int[] sum = { nums[1],nums[2],nums[0] }; return sum;
        }
        (reverse3)
        public int[] reverse3(int[] nums) {
        int[] sum = {nums[2],nums[1], nums[0]}; return sum;
        }
        (maxEnd3)
        public int[] maxEnd3(int[] nums) {
        int x = Math.max(nums[0] , nums[2]);
        int[] sum = {x,x,x}; return sum;
        }
        (sum2)
        public int sum2(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return nums[0] + nums[1];
        }
        (middleWay)
        public int[] middleWay(int[] a, int[] b) {
        int[] take = { a[1],b[1] };   return take;
        }
        (makeEnds)
        public int[] makeEnds(int[] nums) {
        int[] take = {nums[0],nums[nums.length -1]};  return take;
        }
        (has23)
        public boolean has23(int[] nums) {
        if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) return true;
        return false;
        }
        (no23)
        public boolean no23(int[] nums) {
        if(nums[0] == 2 || nums[1] == 2 ||nums[0] == 3 || nums[1] == 3) return false;
        return true;
        }
        (makeLast)
        public int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length -1] = nums[nums.length-1]; return arr;
        }
        (double23)
        public boolean double23(int[] nums) {
        if(nums.length == 2 && nums[0] == 2 && nums[1] == 2 ||
        nums.length == 2 && nums[0] == 3 && nums[1] == 3) return true;
        return false;
        }
        (fix23)
        public int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3) nums[1] = 0;
        if(nums[1] == 2 && nums[2] == 3) nums[2] = 0;
        return  new int[] {nums[0],nums[1],nums[2]};
        }
        (start1)
        public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length > 0 && a[0] == 1) count++;
        if(b.length > 0 && b[0] == 1) count++;
        return count;
        }
        (biggerTwo)
        public int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] < b[0] + b[1]) return b;  return a;
        }
        (makeMiddle)
        public int[] makeMiddle(int[] nums) {
        return new int[] {nums[nums.length /2 -1] , nums[nums.length / 2]};
        }
        (plusTwo)
        public int[] plusTwo(int[] a, int[] b) {
        int[] nums = { a[0],a[1],b[0],b[1] }; return nums;
        }
        (swapEnds)
        public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] =nums[nums.length -1];
        nums[nums.length-1] = temp; return nums;
        }
        (midThree)
        public int[] midThree(int[] nums) {
        int[] arr = new int[3];
        int mid = nums.length / 2;
        arr[0] = nums[mid-1];
        arr[1] = nums[mid];
        arr[2] = nums[mid+1];
        return arr;
        //  return new int[] { nums[nums.length / 2-1 ] ,nums[nums.length / 2 ],
        //  nums[nums.length / 2 + 1 ] };
        }
        (maxTriple)
        public int maxTriple(int[] nums) {
        int result = 0; int a = nums[0];
        int b= nums[((nums.length+1)/2) -1];
        int c = nums[nums.length -1];
        if (a>b && a>c) result = a;
        if (b>a && b>c) result = b;
        if (c>a && c>b) result = c;
        return result;
        }
        (frontPiece)
        public int[] frontPiece(int[] nums) {
        int[] arr;
        if(nums.length < 2)
        arr = new int[nums.length];
        else
        arr = new int[2];
        if(nums.length > 0)
        arr[0] = nums[0];
        if(nums.length > 1)
        arr[1] = nums[1];
        return arr;
        }
        (unlucky1)
        public boolean unlucky1(int[] nums) {
        int arr = nums.length;
        if(arr > 2 && nums[0] == 1 && nums[1] == 3) return true;
        else if(arr >= 3 && nums[1] == 1 && nums[2] == 3) return true;
        else if(arr >= 2 &&  nums[arr -2] == 1 && nums[arr -1] == 3) return true;
        return false;
        }
        (make2)
        public int[] make2(int[] a, int[] b) {
        int[] c = new int[2];
        if(a.length >= 2){
        c[0] = a[0];
        c[1] = a[1];
        }else if(a.length == 1){
        c[0] = a[0];
        c[1] = b[0];
        }else{
        c[0] = b[0];
        c[1] = b[1];
        }
        return c;
        }
        (front11)
        public int[] front11(int[] a, int[] b) {
        if(a.length > 0 && b.length > 0) return new int[] {a[0], b[0]};
        else if(a.length > 0) return new int[] {a[0]};
        else if(b.length > 0) return new int[] {b[0]};
        return new int[0];
        }

       That's all...  :)

         */
    }
}
