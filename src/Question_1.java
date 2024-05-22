public class Question_1 {
//    Given a Sorted Array with Distinct Elements, Search for Index of an Element K,
//    if K is not present, return -1.
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
        int k = 12;
        System.out.println("ans Index : "+searchInd(array,k));
    }
    static int searchInd(int[] array,int k){
        int l=0;
        int h =array.length-1;
        while(l<= h){
            int mid = (l + h)/2;
            if(array[mid]==k){
                return mid;
            }
            if(array[mid]>k){
                h = mid -1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}
