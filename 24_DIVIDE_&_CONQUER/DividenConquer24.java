public class DividenConquer24 {


    // public static void printArr(int arr[]){
    //     for( int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }



    // public static void mergeSort(int arr[], int si, int ei){
    //     if(si >= ei){
    //         return;
    //     }

    //     //kam
    //     int mid = si + (ei - si)/2; //(si + ei)/2     mid
    //     mergeSort(arr, si, mid);    //left
    //     mergeSort(arr, mid+1, ei);  //right
    //     merge(arr, si, mid, ei);

    // }


    // public static void merge(int arr[], int si, int mid, int ei){
    //     //left(0,3)=4, right(4,6)=3 -> 6-0+1=7
    //     int temp[]= new int[ei - si + 1];
    //     int i = si;      //iterator for left part
    //     int j = mid+1;   //iterator for right part
    //     int k = 0;       //iterator for temp part

    //     while(i <= mid && j <= ei){
    //        if(arr[i] < arr[j]){
    //         temp[k] = arr[i];
    //         i++; 
    //        } else {
    //         temp[k] = arr[j];
    //         j++;
    //        }
    //        k++;
    //     }
    //     //left part
    //     while(i <= mid){
    //         temp[k++] = arr[i++];
    //     }

    //     //right part
    //     while(j <= ei){
    //         temp[k++] = arr[j++];
    //     }

    //     //copy temp to original arr
    //     for (k=0, i=si; k<temp.length; k++, i++){
    //         arr[i] = temp[k];
    //     }
    // }

    

    // public static void main(String args[]){
    //     int arr[]={6, 3, 9, 5, 2, -2};
    //     mergeSort (arr, 0, arr.length-1);
    //     printArr(arr);
    // }









    // public static void printArr(int arr[]){
    //     for (int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    // public static void quickSort(int arr[], int si, int ei){
    //     if (si >= ei){
    //         return;
    //     }
    //     // Partition the array and get the pivot index
    //     int pIdx = partition(arr, si, ei);
    //     quickSort(arr, si, pIdx - 1); // left
    //     quickSort(arr, pIdx + 1, ei); // right
    // }

    // public static int partition(int arr[], int si, int ei){
    //     int pivot = arr[ei];
    //     int i = si - 1; // to make place for elements smaller than pivot

    //     for (int j = si; j < ei; j++){
    //         if (arr[j] <= pivot){
    //             i++;
    //             // Swap arr[i] and arr[j]
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     // Place the pivot in the correct position
    //     i++;
    //     int temp = arr[i];
    //     arr[i] = arr[ei];
    //     arr[ei] = temp;

    //     return i;
    // }

    // public static void main(String args[]){
    //     int arr[] = {6, 3, 9, 8, 2, 5};
    //     quickSort(arr, 0, arr.length - 1);
    //     printArr(arr);
    // }






    // public static int search(int arr[], int tar, int si, int ei){

    //     if (si > ei){
    //         return -1;
    //     }

    //     //kam
    //     int mid = si + (ei-si)/2;  //(si-ei)/2

    //     //case found
    //     if(arr[mid] == tar){
    //         return mid;
    //     }

    //     //mid on L1
    //     if(arr[si] <= arr[mid]){

    //         //case a :left
    //         if(arr[si] <= tar && tar <= arr[mid]){
    //             return search(arr, tar, si, mid-1);

    //         } else {

    //             //case b : right
    //             return search(arr, tar, mid +1, ei);
    //         }
    //     }


    //     //mid on L2
    //     else{
    //         //case c : right
    //         if(arr[mid] <= tar && tar <= arr[ei]){
    //             return search(arr, tar, mid +1, ei);

    //         } else{
    //             //case d : left
    //             return search(arr, tar, si, mid -1);
    //         }
    //     }
    // }


    // public static void main(String args[]){
    //     int arr[] = {4, 5, 6, 7, 0, 1, 2};
    //     int target = 0;  //OUTPUT -> 4
    //     int tarIdx = search (arr, target, 0, arr.length-1);
    //     System.out.println(tarIdx);
    // }






    /*          Practise Question          */


    
    //Q1
    // public static String[] mergeSort(String[] arr, int lo, int hi) {
    //     if (lo == hi) {
    //         String[] A = {arr[lo]};
    //         return A;
    //     }
    //     int mid = lo + (hi - lo) / 2;
    //     String[] arr1 = mergeSort(arr, lo, mid);
    //     String[] arr2 = mergeSort(arr, mid + 1, hi);
    //     String[] arr3 = merge(arr1, arr2);
    //     return arr3;
    // }

    // static String[] merge(String[] arr1, String[] arr2) {
    //     int m = arr1.length;
    //     int n = arr2.length;
    //     String[] arr3 = new String[m + n];
    //     int idx = 0;
    //     int i = 0;
    //     int j = 0;

    //     while (i < m && j < n) {
    //         if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
    //             arr3[idx] = arr1[i];
    //             i++;
    //         } else {
    //             arr3[idx] = arr2[j];
    //             j++;
    //         }
    //         idx++;
    //     }

    //     while (i < m) {
    //         arr3[idx] = arr1[i];
    //         i++;
    //         idx++;
    //     }

    //     while (j < n) {
    //         arr3[idx] = arr2[j];
    //         j++;
    //         idx++;
    //     }

    //     return arr3;
    // }

    // // Return true if str1 appears before str2 in alphabetical order
    // static boolean isAlphabeticallySmaller(String str1, String str2) {
    //     return str1.compareTo(str2) < 0;
    // }

    // public static void main(String[] args) {
    //     String[] arr = {"sun", "earth", "mars", "mercury"};
    //     String[] sortedArr = mergeSort(arr, 0, arr.length - 1);
    //     for (String s : sortedArr) {
    //         System.out.println(s);
    //     }
    // }





    //Q2

    //Approach 1- Brute Force Approach

    // public static int majorityElement(int[] nums) {
    //     int majorityCount = nums.length / 2;

    //     for (int i = 0; i < nums.length; i++) {
    //         int count = 0;
    //         for (int j = 0; j < nums.length; j++) {
    //             if (nums[j] == nums[i]) {
    //                 count += 1;
    //             }
    //         }
    //         if (count > majorityCount) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int nums[] = {2, 2, 1, 1, 1, 2, 2};
    //     System.out.println(majorityElement(nums));
    // }






    //Divide & Conquer

    // private static int countInRange(int[] nums, int num, int lo, int hi) {
    //     int count = 0;
    //     for (int i = lo; i <= hi; i++) {
    //         if (nums[i] == num) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // private static int majorityElementRec(int[] nums, int lo, int hi) {
    //     if (lo == hi) {
    //         return nums[lo];
    //     }

    //     int mid = (hi - lo) / 2 + lo;
    //     int left = majorityElementRec(nums, lo, mid);
    //     int right = majorityElementRec(nums, mid + 1, hi);

    //     if (left == right) {
    //         return left;
    //     }

    //     int leftCount = countInRange(nums, left, lo, hi);
    //     int rightCount = countInRange(nums, right, lo, hi);

    //     return leftCount > rightCount ? left : right;
    // }

    // public static int majorityElement(int[] nums) {
    //     return majorityElementRec(nums, 0, nums.length - 1);
    // }

    // public static void main(String[] args) {
    //     int nums[] = {2, 2, 1, 1, 1, 2, 2};
    //     System.out.println(majorityElement(nums));
    // }






    //Q3

    //Approach 1: Brute Force

    // public static int getInvCount(int arr[]) {
    //     int n = arr.length;
    //     int invCount = 0;
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[i] > arr[j]) {
    //                 invCount++;
    //             }
    //         }
    //     }
    //     return invCount;
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1, 20, 6, 4, 5};
    //     System.out.println("Inversion Count = " + getInvCount(arr));
    // }





    //Approach 2: Modified Merge Sort

    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                k++;
                j++;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    private static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;

            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);

            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }

    public static int getInversions(int arr[]) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count = " + getInversions(arr));
    }







}
