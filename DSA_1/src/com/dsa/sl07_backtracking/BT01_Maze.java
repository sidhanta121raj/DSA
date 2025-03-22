package com.dsa.sl07_backtracking;

public class BT01_Maze {

	public static void main(String[] args) {
		System.out.println(countPaths(3, 3));
		System.out.println("---------------------------------------------");
		printPaths(3, 3, "");
		System.out.println("---------------------------------------------");
		printPaths1(3, 3, "");
		System.out.println("---------------------------------------------");
		boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

		printPathsWithRestriction(maze, 0, 0, "");
	}

	// When only Left Right allowed
	static int countPaths(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}

		int right = countPaths(r - 1, c);
		int down = countPaths(r, c - 1);

		return right + down;
	}

	// When only Left Right allowed
	static void printPaths(int r, int c, String path) {
		if (r == 1 && c == 1) {
			System.out.println(path);
			return;
		}

		if (r > 1) {
			printPaths(r - 1, c, path + "R");
		}
		if (c > 1) {
			printPaths(r, c - 1, path + "D");
		}
	}

	// When diagonal also allowed
	static void printPaths1(int r, int c, String path) {
		if (r == 1 && c == 1) {
			System.out.println(path);
			return;
		}

		if (r > 1 && c > 1) {
			printPaths1(r - 1, c - 1, path + "D");
		}

		if (r > 1) {
			printPaths1(r - 1, c, path + "H");
		}
		if (c > 1) {
			printPaths1(r, c - 1, path + "V");
		}
	}
	
	// When only Left Right allowed with one restriction or hurdle
	static void printPathsWithRestriction(boolean[][] maze, int r, int c, String path) {
		if (r == maze.length-1 && c == maze[0].length-1) {
			System.out.println(path);
			return;
		}

		if ( ! maze[r][c] ) {
			return;
		}

		if (r < maze.length-1) {
			printPathsWithRestriction(maze, r + 1, c, path + "H");
		}
		if (c < maze[0].length-1) {
			printPathsWithRestriction(maze, r, c + 1, path + "V");
		}
	}
	
	// When all directional path allowed
		static void printAllDirectionalPaths(int r, int c, String path) {
			if (r == 1 && c == 1) {
				System.out.println(path);
				return;
			}

			if (r < 3) {
				printAllDirectionalPaths(r - 1, c, path + "R");
			}
			if (r > 1) {
				printAllDirectionalPaths(r - 1, c, path + "R");
			}
			if (c > 1) {
				printAllDirectionalPaths(r, c - 1, path + "D");
			}
		}

}
