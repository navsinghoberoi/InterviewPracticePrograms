package ArrayPrograms;

public class SortOddEvenNumbers {


    public static void main(String[] args) {

        int arr[] = {0,1,2,3,4,5,6,7,8};
        sortNumberMethod1(arr);
    }

    // not a good way  [O(n2)]
    public static void sortNumberMethod1(int[] arr){

        int odd_index=0;
        int even_index=0;
        int[] odd = new int[arr.length];
        int[] even = new int[arr.length];

        for (int i=0;i<arr.length;i++){
            if (arr[i]%2 ==0){
                even[even_index++] = arr[i];
            }else {
                odd[odd_index++] = arr[i];
            }
        }

        for (int i = 0; i < odd_index; i++) {
            System.out.print(odd[i] + " ");
        }

        for (int i = 0; i < even_index; i++) {
            System.out.print(even[i] + " ");
        }

    }




}
