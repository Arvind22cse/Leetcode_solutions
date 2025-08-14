class Solution {
    public String reverseWords(String s) {
        String [] arr=s.split(" ");
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String a=arr[i];
            int n2=a.length();
            for(int j=n2-1;j>=0;j--){
                sb.append(arr[i].charAt(j));
            }
            if(i==arr.length-1){
                break;
            }
            sb.append(" ");
        }

return sb.toString();
    }
}