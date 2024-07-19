package sortCollection;


public class FindTheSmallest {
    int[] findsmallest(int[] arr){
        int i;

        // Initialize maximum element
        int min = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return new int[]{min};
    }

}
