public class Question_3 {
//    Given a sorted array of N elements, find the frequency of a given element k.
    public static void main(String[] args) {
        int[] array = {-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 8, 10, 10, 15, 16, 17, 18};
        int k = 5;
        System.out.println("ans : "+findFreq(array,k));
    }
    static int findFreq(int[] array,int k){
        return findLastOcc(array,k) - findFirstOcc(array,k) + 1;
    }
    static int findFirstOcc(int[] array,int k){
        int l=0,h= array.length-1,ans=-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(array[mid]==k){
                ans = mid;
                h = mid-1;
            }else if(array[mid]>k){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    static int findLastOcc(int[] array,int k){
        int l=0,h= array.length-1,ans=-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(array[mid]==k){
                ans = mid;
                l = mid+1;
            }else if(array[mid]>k){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
