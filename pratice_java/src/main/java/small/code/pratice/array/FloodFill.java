package small.code.pratice.array;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * 
 * Flood Fill
 * 
 * An image is represented by a 2-D array of integers, each integer representing the 
 * pixel value of the image (from 0 to 65535).
 * 
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of 
 * the flood fill, and a pixel value newColor, "flood fill" the image.
 * 
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 
 * 4-directionally to the starting pixel of the same color as the starting pixel, 
 * plus any pixels connected 4-directionally to those pixels (also with the same 
 * color as the starting pixel), and so on. Replace the color of all of the 
 * aforementioned pixels with the newColor.
 * 
 * At the end, return the modified image.
 * 
 * Example 1:
 * 
 * Input: 
 * image = [[1,1,1],[1,1,0],[1,0,1]]
 * sr = 1, sc = 1, newColor = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * Explanation: 
 * From the center of the image (with position (sr, sc) = (1, 1)), all pixels 
 * connected by a path of the same color as the starting pixel are colored with the new color.
 * Note the bottom corner is not colored 2, because it is not 4-directionally connected
 * to the starting pixel.
 * 
 * Note:
 * The length of image and image[0] will be in the range [1, 50].
 * The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
 * The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
 *
 */
public class FloodFill {
	private static class Point {
		private static final int LEFT = -1, RIGHT = 1, UP = -1, DOWN = 1;
		int sr, sc;
		public Point(int sr, int sc) {
			this.sr = sr;
			this.sc = sc;
		}
		
		public Point moveLeft() {
			return new Point(sr, sc + LEFT);
		}
		
		public Point moveRight() {
			return new Point(sr, sc + RIGHT);
		}
		
		public Point moveUp() {
			return new Point(sr + UP, sc);
		}
		
		public Point moveDown() {
			return new Point(sr + DOWN, sc);
		}
		
		public Point[] getNeighbor() {
			return new Point[] {moveLeft(), moveRight(), moveUp(), moveDown()};
		}
	}
	
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    	int[][] marked = new int[image.length][image[0].length];
        Deque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(sr, sc));
        marked[sr][sc] = 1;
        int filledColor = image[sr][sc];
        while(!queue.isEmpty()) {
        	Point current = queue.pollFirst();
        	image[current.sr][current.sc] = newColor;
        	for(Point point: current.getNeighbor()) {
        		if(isValid(point, image)) {
            		if(image[point.sr][point.sc] == filledColor && marked[point.sr][point.sc] != 1) {
            			queue.add(point);
            			marked[point.sr][point.sc] = 1;
            		} 
            	}
        	}
        }
        return image;
    }
    
    private boolean isValid(Point point, int[][] image) {
    	return point.sr >= 0 && point.sr < image.length && point.sc >= 0 && point.sc < image[0].length;
    }
}
