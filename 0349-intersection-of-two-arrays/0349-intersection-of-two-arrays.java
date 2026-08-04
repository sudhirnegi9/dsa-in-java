class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

       HashSet<Integer> num1 = new HashSet<>();
       HashSet<Integer> num2 = new HashSet<>();
        for(int n1 : nums1){
            num1.add(n1);
        }
        for(int n2 : nums2){
            num2.add(n2);
        }

        HashSet<Integer> intersection = new HashSet<>(num1);
        intersection.retainAll(num2);
        int i=0;
        int[] result = new int[intersection.size()]; 
        for(int r : intersection){
            result[i] = r;
            i++;
        }

        return result;

    }
}