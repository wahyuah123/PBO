package sortCollection;

public class FindTheLargest {
    int[] findlargest(int[] arr){
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return new int[]{max};
    }
}
