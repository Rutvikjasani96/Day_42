public class Question_4 {
//    Given N Distinct Elements,
//    Return any peak element an element is said to be peak if greater than the adjacent elements.
    public static void main(String[] args) {
        int[] array = {-1, 6, 2, 5, 7, 4, 8};
        System.out.println(findPeak(array));
    }
    static int findPeak(int[] array){
        int l=1,h= array.length-2;
        if(array[0]>array[1]){
            return array[0];
        }
        if(array[array.length-1]>array[array.length-2]){
            return array[array.length-1];
        }
        while(l<=h){
            int mid = (l+h)/2;
            if(array[mid]>array[mid-1] && array[mid]>array[mid+1]){
                return array[mid];
            }else if(array[mid]<array[mid+1]){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return 0;
    }
}
