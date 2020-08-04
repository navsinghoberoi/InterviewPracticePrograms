package ArrayPrograms;

public class secondLargetNumber {

    public static void main(String[] args) {
        int[] arr = {5, 2, 11, 4, 20};
        findTwoLargestNumber(arr);
    }

    public static void findTwoLargestNumber(int[] arr) {

        int largest = arr[0];
        int second_largest = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("Largest number =>" + largest);
        System.out.println("Second largest number =>" + second_largest);
    }


}
