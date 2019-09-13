public class BinaryIterativeSearch implements Practice03Search {

    public BinaryIterativeSearch(){
        return; 
    }

    public String searchName(){
        return "Binary Iterative search";
    }

    public int search(int[] arr, int target){
        //find target and return index if it exists
        int first = 0; 
        int last = arr.length -1; 

        while(first <= last){
            int mid = (first + last)/2; 

            if(arr[mid] == target){
                return mid; 
            }

            if(arr[mid] > target){
                last = mid - 1; 
            }

            if(arr[mid] < target){
                first = mid + 1; 
            }
        }
        return -1; 
    }
}
