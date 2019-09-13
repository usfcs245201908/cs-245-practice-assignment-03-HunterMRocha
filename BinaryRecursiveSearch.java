public class BinaryRecursiveSearch implements Practice03Search {

    public BinaryRecursiveSearch(){
        return; 
    }

    public String searchName(){
        return "Binary recursive search";
    }

    public int search(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        return BinarySearch(arr, target, low, high);
    }

    public int BinarySearch(int[] arr, int target, int low, int high){ 

        int mid = (low + high)/2;
        if(arr[mid] == target){
            return mid; 
        }
        else if(target > arr[mid]){
            BinarySearch(arr, target, mid+1, high);
        }
        else{
            BinarySearch(arr, target, low, mid-1);
        }
        return -1;

    }
}