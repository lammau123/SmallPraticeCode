package small.code.pratice.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumIslands {
	private static char PASSED = '2', LAND = '1';
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
	
	static class Direction{
		private static int LEFT = -1, RIGHT = +1, UP = -1, DOWN = +1, STAY = 0;
		private Point point;
		
		public static Direction of(Point point) {
			return new Direction(point);
		}
		
		private Direction(Point point){
			this.point = point;
		}
		
		Direction moveLeft(Consumer<Point> consumer) {
			point.move(STAY, LEFT, consumer);
			return this;
		}
		
		Direction moveRight(Consumer<Point> consumer) {
			point.move(STAY, RIGHT, consumer);
			return this;
		}
		
		Direction moveUp(Consumer<Point> consumer) {
			point.move(UP, STAY, consumer);
			return this;
		}
		
		Direction moveDown(Consumer<Point> consumer) {
			point.move(DOWN, STAY, consumer);
			return this;
		}
	}
	
	private boolean isLand(Point point, char[][]grid) {
		if(point.getX() >= 0 && point.getX() < grid.length &&
			point.getY() >= 0 && point.getY() < grid[point.getX()].length
			&& grid[point.getX()][point.getY()] == LAND) {
			return true;
		}
		
		return false;
	}
	
	private Consumer<Point> markAndAddLand(Deque<Point> stack, char[][]grid) {
		return point -> {
			if(isLand(point, grid)) {
				stack.push(point);
				grid[point.getX()][point.getY()] = PASSED;
			}
		};
	}
	
	private void markLand(char[][]grid, Point _point) {
		Deque<Point> stack = new ArrayDeque<Point>();
		grid[_point.getX()][_point.getY()] = PASSED;
		stack.push(_point);
		
		while(!stack.isEmpty()) {
			Point point = stack.pop();	
			Direction.of(point).moveLeft(markAndAddLand(stack, grid))
								.moveDown(markAndAddLand(stack, grid))
								.moveRight(markAndAddLand(stack, grid))
								.moveUp(markAndAddLand(stack, grid));
			
		}
	}
	
	public int numIslands(char[][] grid) {
		int numOfLands = 0;
        for(int row = 0; row < grid.length; row++) {
        	for(int col = 0; col < grid[row].length; col++) {
        		Point point = new Point(row, col);
        		if(isLand(point, grid)) {
        			markLand(grid, point);
        			numOfLands += 1;
        		}
        	}
        }
        
        return numOfLands;
    }
}
