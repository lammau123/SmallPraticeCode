package small.code.pratice.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

/**
 * Minimum Path Sum
 * 
 * Given a m x n grid filled with non-negative numbers, find a path from top left to 
 * bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * Example:
 * 
 * Input:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 *
 */
public class MinPathSum {
	static class Point {
		private int x;
		private int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public Point move(int stepX, int stepY, Consumer<Point> consumer) {
			consumer.accept(new Point(getX() + stepX, getY()+ stepY));
			return this;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}
	private int[][] copyStructure(int[][] grid){
		int[][] weight = new int[grid.length][];
		for(int row = 0; row < weight.length; row++) {
			weight[row] = new int[grid[0].length];
		}
		
		return init(weight);
	}
	
	private int[][] init(int[][] data) {
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[0].length; col++) {
				data[row][col] = Integer.MAX_VALUE;
			}
		}
		return data;
	}
	
	private Consumer<Point> updateWeight(int[][] grid, int[][] data, Deque<Point> queue, Point prePoint){
		return point -> {
			if(point.getX() < grid.length && point.getY() < grid[0].length) {
				if(data[point.getX()][point.getY()] == Integer.MAX_VALUE) {
					data[point.getX()][point.getY()] = grid[point.getX()][point.getY()] + data[prePoint.getX()][prePoint.getY()];
					queue.push(point);
				} else {
					data[point.getX()][point.getY()] = Math.min(data[point.getX()][point.getY()], data[prePoint.getX()][prePoint.getY()] + grid[point.getX()][point.getY()]);
				}
			}
		};
	} 
	
	private int minPathSum(int[][] grid, int[][] data){
		final int RIGHT = 1, DOWN = 1;
		Deque<Point> queue = new ArrayDeque<>();
		Point startPoint = new Point(0, 0);
		data[startPoint.getX()][startPoint.getY()] = grid[0][0];
		queue.push(startPoint);
		
		while(!queue.isEmpty()) {
			Point point = queue.pollLast();
			point.move(0, RIGHT, updateWeight(grid, data, queue, point));
			point.move(DOWN, 0, updateWeight(grid, data, queue, point));
		}
		
		return data[data.length-1][data[0].length-1];
	}
	
	public int minPathSum(int[][] grid) {
		int[][] data = copyStructure(grid);
		
		return minPathSum(grid, data);
	}
}
