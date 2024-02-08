package saro;
import java.util.List;
import java.util.ArrayList;

public class path {
	// To store the matrix dimensions
		static int M, N;

	// Function to print the path taken to reach the destination
		// static void printPath(List<Integer> path) {
		// 	// for (int i : path) {
		// 	// 	System.out.print(i + ", ");
		// 	// }
		// 	// System.out.println("List: " + path);
		// }

	// Function to find all possible paths in the matrix from the top-left cell to the bottom-right cell
		static void findPaths(int[][] arr, List<Integer> path, int i, int j) {   // Always M == N == 3
//	        System.out.println("m: " + M + "     n : " + N  + "     i: " + i + "     j: " + j);
	// If it's the bottom-right cell, print the path
			if (i == M - 1 && j == N - 1) {   // i == 2 && j == 2
					path.add(arr[i][j]);
					System.out.println("Path: " + path);// printPath(path);
					path.remove(path.size() - 1);
//					System.out.println("remove: 2==2: " + path);
					return;
			}

	// Boundary cases: Check if we are out of the matrix
			if (i < 0 || i >= M || j < 0 || j >= N) {    //i = 0-2  || j = 0-2
				return;
			}

	// Include the current cell in the path
				path.add(arr[i][j]);
//			System.out.println("add: " + path);

	// Move right in the matrix
			if (j + 1 < N) {
				findPaths(arr, path, i, j + 1);
			}

	// Move down in the matrix
			if (i + 1 < M) {
				findPaths(arr, path, i + 1, j);
			}

	// Backtrack: Remove the current cell from the current path
			path.remove(path.size() - 1);
//			System.out.println("remove: " + path);
		}



	// Driver code
		public static void main(String[] args) {
	// Input matrix
			int[][] arr = {
				{0, 0, 1},
				{0, 0, 1},
				{1, 0, 0}
			};

	// To store the path
			ArrayList<Integer> path = new ArrayList<>();

	// Starting cell (0, 0)
			int i = 0, j = 0;

			M = arr.length;   //M = 3
			N = arr[0].length;   //N = 3

	// Function call
			findPaths(arr, path, i, j);
		}
}
