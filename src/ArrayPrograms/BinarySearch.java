package ArrayPrograms;

public class BinarySearch {


    public static void main(String[] args) {

    int arr[] = {1,2,3,4,5,6,7,8,9};

    searchNumber(arr,8);
    }

    public static void searchNumber(int arr[], int number){

        int index=-1;
        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (high + low)/2;
            if (arr[mid] == number){
                index = mid;
                break;
            }else if (arr[mid] > number){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        if (index == -1){
            System.out.println("Given number is not present in the array");
        }else {
            System.out.println("Given number is found in array at index =>"+index);
        }

    }



}


