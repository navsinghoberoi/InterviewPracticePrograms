package ArrayPrograms;

import java.util.*;

public class Union_Intersection_Array {


    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};

        computeUnion(arr1, arr2);
        computeIntersection(arr1, arr2);
    }

    // use set
    public static void computeUnion(int arr1[], int arr2[]) {
        Set<Integer> unionSet = new TreeSet<>();

        for (int number : arr1) {
            unionSet.add(number);
        }
        for (int number : arr2) {
            unionSet.add(number);
        }
        System.out.println("Union of given arrays =>" + unionSet);
    }

    // use list and map
    public static void computeIntersection(int arr1[], int arr2[]) {
        List<Integer> list_all_number = new ArrayList<>();
        for (int number : arr1) {
            list_all_number.add(number);
        }
        for (int number : arr2) {
            list_all_number.add(number);
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection_list = new ArrayList<>();

        for (int number : list_all_number) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }

        for (int key:map.keySet()){
            if (map.get(key)>1){
                intersection_list.add(key);
            }
        }

        System.out.println("Intersection of given arrays =>" + intersection_list);
    }

}
