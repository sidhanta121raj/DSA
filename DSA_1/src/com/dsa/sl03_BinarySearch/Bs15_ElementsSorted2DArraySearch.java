package com.dsa.sl03_BinarySearch;

import java.util.Arrays;

public class Bs15_ElementsSorted2DArraySearch {

	public static void main(String[] args) {
		int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
        System.out.println(Arrays.toString(flattenedSearch(arr, 9)));
	}

    static int[] search(int[][] matrix, int target) {
    	
    	if (matrix.length == 0){
            return new int[] {-1,-1};
        }
    	
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        
        if (totalRows == 1) {
            return binarySearch(matrix, 0, 0, totalCols-1, target);
        }

        int rStart = 0;
        int rEnd = totalRows - 1;
        int cMid = totalCols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }
            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][totalCols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, totalCols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, totalCols - 1, target);
        }
    }
    
 // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cMid] == target) {
                return new int[]{row, cMid};
            }
            if (matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    
    static int[] flattenedSearch(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return new int[]{mid / cols, mid % cols}; // Found
            } else if (midElement > target) {
                right = mid - 1; // Move left
            } else {
                left = mid + 1; // Move right
            }
        }
        return new int[]{-1, -1}; // Not found
    }

}
