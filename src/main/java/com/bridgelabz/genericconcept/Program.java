package com.bridgelabz.genericconcept;

public class Program {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int top = 0, bottom = 4 - 1, left = 0, right = 4 - 1, z;
        System.out.print("spiral order: ");

        while (top <= bottom && left <= right) {
            for (z = left; z <= right; z++) {
                System.out.print(a[top][z] + ", ");
            }
            top++;
            for (z = top; z <= bottom; z++)
                System.out.print(a[z][right] + ", ");
            right--;
            for (z = right; z >= left; z--)
                System.out.print(a[bottom][z] + ", ");
            bottom--;
            for (z = bottom; z >= top; z--)
                System.out.print(a[z][left] + ", ");
            left++;
        }
    }
}
