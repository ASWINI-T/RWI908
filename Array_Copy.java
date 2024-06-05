package day12;

public class Array_Copy {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = new int[a1.length];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = a1[i];
        }

        System.out.println("Copied array:");
        for (int num : a2) {
            System.out.print(num + " ");
        }
    }
}

