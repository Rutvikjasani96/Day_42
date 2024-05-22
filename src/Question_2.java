public class Question_2 {
//    given a sorted array, find floor of a given number k.
//    floor : greatest ele<=k in arr[]
    public static void main(String[] args) {
        int[] array = {-5, 2, 3, 6, 9, 10, 11, 14, 18};
        int k = 10;
        System.out.println("ans : "+findFloor(array,k));
    }
    static int findFloor(int[] array,int k){
        int l =0,h=array.length-1,ans=-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(array[mid]==k){
                return k;
            }else if(array[mid]>k){
                h = mid-1;
            }else{
                ans = array[mid];
                l = mid+1;
            }
        }
        return ans;
    }
}
