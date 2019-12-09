package com.kishor.algos;
/**
 * Given upper left most co-ordinate and bottom right most co-ordinates of two
 * rectangles, this program finds if they have intersection of area. Test cases
 * covered,
 * <ol>
 * <li>Normal Overlapping</li>
 * <li>Inner Rectangle</li>
 * <li>Same Rectangle</li>
 * <li>Inner Rectangles shared one common width/length</li>
 * <li>Not Intersecting rectangles</li>
 * </ol>
 * 
 * @author kvasant
 * 
 */
public class RectangleIntersection {

	public static void main(String asp[]) {
		Rectangle p = new Rectangle(5, 10, 10, 5);
		Rectangle q = new Rectangle(10, 10, 15, 5);

		if (p.finfIfIntersected(p, q)) {
			System.out.println("Matched");
		} else {

			if (p.finfIfIntersected(q, p)) {
				System.out.println("Matched");
			} else {
				System.out.println("Not Matched");
			}

		}
	}
}

class Rectangle {
	int x1, y1, x2, y2;

	Rectangle(int tx1, int ty1, int bx2, int by2) {
		this.x1 = tx1;
		this.y1 = ty1;
		this.x2 = bx2;
		this.y2 = by2;
	}

	boolean finfIfIntersected(Rectangle p, Rectangle q) {
		if (((p.x1 <= q.x1 && q.x1 <= p.x2) && !(p.x1 == q.x1 && p.x2 == q.x2)
				&& (p.y2 <= q.y1 && q.y1 <= p.y1) && !(p.y1 == q.y1 && p.y2 == q.y2))
				|| ((p.x1 == q.x1 && p.x2 == q.x2) && (p.y1 == q.y1 && p.y2 == q.y2))) {
			return true;
		}
		return false;
	}
}