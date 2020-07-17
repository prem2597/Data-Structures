import java.util.Arrays;
/**
 * Binary Search
 * @author Prem
 */
 public class BinarySearch {

   public static int indexOf(int[] arr, int key) {
     int low  = 0;
     int high = arr.length - 1;
     while (low <= high) {
       int mid = low + (high - low)/2;
       if (key < arr[mid]) {
         high = mid - 1;
       } else if (key > arr[mid]) {
         low = mid + 1;
       } else {
         return mid;
       }
     }
     return -1;
   }

   public static int rank(int[] arr, int key) {
     return indexOf(arr, key);
   }

   public static void main(String[] args) {
     //
   }
 }
