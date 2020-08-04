package leetcode.Arrays;

import java.util.*;

public class IntersectionOfArrays {


    public static void main(String[] args) {
        int arr1[] = {-2147483648,1,2,3};
        int arr2[] = {1,-2147483648,-2147483648};
/*        int result[] = intersect(arr1, arr2);
        System.out.println(Arrays.toString(result));*/

        int[] result = intersect1(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }


    public static int[] intersect1(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = processArray(arr1);
        Map<Integer, Integer> map2 = processArray(arr2);
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> smallerMap;
        Map<Integer, Integer> largerMap;

        // storing map on which iteration should be done [smaller size]
        if (map1.size() >= map2.size()) {
            smallerMap = map2;
            largerMap = map1;
        } else {
            smallerMap = map1;
            largerMap = map2;
        }

        for (int i = 0; i < smallerMap.size(); i++) {
            for (int j = 0; j < largerMap.size(); j++) {
                if (smallerMap.get(i).equals(largerMap.get(j))) {
                    list.add(largerMap.get(j));
                    largerMap.put(j,-1);    // to avoid duplicate entries in list
                    break;
                }
            }
        }

        //   System.out.println("Resultant list => "+list);
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static Map<Integer, Integer> processArray(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(i)) {
                map.put(i, arr[i]);
            }
        }
        System.out.println(map);
        return map;
    }


    public static int[] intersect(int[] arr1, int[] arr2) {
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        if (lengthArr1 - lengthArr2 > 0) {
            for (int i = 0; i < lengthArr1; i++) {
                if (arr1[i] == arr2[counter]) {// 1st matching element found in both arrays
                    list.add(arr1[i]);
                    counter++;
                    while (arr1[i + counter] == arr2[counter] && (i + counter) < lengthArr1) {
                        list.add(arr2[counter]);
                        if (list.size() == arr2.length) {
                            // save result
                            int result[] = new int[list.size()];
                            for (int z = 0; z < result.length; z++) {
                                result[z] = list.get(z);
                            }
                            return result;
                        }
                    }
                }
            }
        } else if (lengthArr1 - lengthArr2 < 0) {
            for (int i = 0; i < lengthArr2; i++) {
                if (arr2[i] == arr1[counter]) {// 1st matching element found in both arrays
                    list.add(arr2[i]);
                    counter++;
                    while (arr2[i + counter] == arr1[counter] && (i + counter) < lengthArr2) {
                        list.add(arr1[counter]);
                        counter++;
                        if (list.size() == arr1.length) {
                            // save result
                            int result[] = new int[list.size()];
                            for (int z = 0; z < result.length; z++) {
                                result[z] = list.get(z);
                            }
                            return result;
                        }
                    }
                }
            }
        }
        return new int[]{};
    }

}
