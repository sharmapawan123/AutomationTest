package javaProg_Searching;

public class SearchIntegerInArray {
    public static void main(String[] args) {
        int index = searchValue();
        if(index != -1) {
            System.out.println(index);
        }
        else
        {
            System.out.println("Element Not found");
        }

    }


    public static int searchValue() {
        int[] arr = {12, 13, 14, 15, 16, 15,17};
        int value = 15;
        int i = 0;
        for (i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == value) {
                System.out.println("Element found at " + i);
                return i;
            }
        }
        return -1;
    }
}

