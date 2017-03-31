import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author
 */
public class MatrixPuzzle {
	
	public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the dimensions of the value matrix");
		int length = nextInt();
		int breadth = nextInt();
		int[][] points = new int[length][breadth];
		System.out.println("Enter the matrix");
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < breadth; j++) {
				points[i][j] = nextInt();
			}
		}
		int[] startpt = new int[2];
		int[] endpt = new int[2];

		System.out.println("Enter the starting point");
		for (int i = 0; i < 2; i++) {
			startpt[i] = nextInt();
		}
		System.out.println("Enter the coordinates of end point");
		for (int i = 0; i < 2; i++) {
			endpt[i] = nextInt();
		}

		boolean value = findPath(points, startpt, endpt);

		if (value)
			System.out.println("There exist a path");
		else
			System.out.println("There exist no path");

	}

	static Stack<int[]> accesspoints = new Stack<int[]>();

	public static boolean findPath(int[][] points, int[] startpt, int[] endpt) {

		int[][] pointsvisited = new int[points.length][points[0].length];

		accesspoints.add(startpt);
		visitpoint(points, pointsvisited, startpt);

		for (int[] coord : accesspoints) {
			if ((coord[0] == endpt[0]) && (coord[1] == endpt[1]))
				return true;
		}

		return false;

	}

	public static void visitpoint(int[][] points, int[][] pointsvisited,
			int[] currentpoint) {
		if (currentpoint[0] < 0 || currentpoint[0] >= points.length
				|| currentpoint[1] < 0 || currentpoint[1] >= points[0].length
				|| pointsvisited[currentpoint[0]][currentpoint[1]] == 1
				|| points[currentpoint[0]][currentpoint[1]] == 1) {
			return;
		}

		pointsvisited[currentpoint[0]][currentpoint[1]] = 1;
		accesspoints.add(currentpoint);
		visitpoint(points, pointsvisited, new int[] { currentpoint[0] + 1,
				currentpoint[1] });
		visitpoint(points, pointsvisited, new int[] { currentpoint[0] - 1,
				currentpoint[1] });
		visitpoint(points, pointsvisited, new int[] { currentpoint[0],
				currentpoint[1] + 1 });
		visitpoint(points, pointsvisited, new int[] { currentpoint[0],
				currentpoint[1] - 1 });

	}

	static BufferedReader br;
	static StringTokenizer st;



	public static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	public static String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = br.readLine();
			if (line == null)
				return line;

			st = new StringTokenizer(line.replaceAll("", " "));
		}
		return st.nextToken();
	}

}