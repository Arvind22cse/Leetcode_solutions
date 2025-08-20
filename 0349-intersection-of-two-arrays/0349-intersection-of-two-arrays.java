class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer> hs2=new HashSet<Integer>();
        for(int n:nums2){
            if(hs.contains(n)){
                hs2.add(n);
            }
        }
        int[] res=new int[hs2.size()];
        int i=0;
        for(int x:hs2){
            res[i++]=x;
        }
        return res;
    }
}