package org.zerock;

public class ShortestAndFathestDistance {
    public static void main(String[] args) {
        Point2D[] points = {new Point2D(1, 1), new Point2D(5, 5),
                new Point2D(10, 10), new Point2D(1, 10)};

        Point2D target = new Point2D(9, 9);

        System.out.printf("Among %d points\n", points.length);
        double min = points[0].getDistance(target);
        double max = min;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < points.length; i++) {
            System.out.printf("%d:%s\n", i + 1, points[i]);
            double distance = points[i].getDistance(target);
            if (distance < min) {
                min = distance;
                minIndex = i;
            }
            if (distance > max) {
                max = distance;
                maxIndex = i;
            }
        }
        System.out.printf(">> %d:%s is closest to target %s\n", minIndex+1, points[minIndex], target);
        System.out.printf(">> %d:%s is farthest to target %s\n", maxIndex+1, points[maxIndex], target);
    }
}

// 2차원 좌표 클래스. int 형 field x, y를 가진다.
class Point2D {
    final int x, y;

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point2D p) {
        return Math.hypot(x - p.x, y - p.y); // Math.hypot(x, y) = Math.sqrt(x^2, y^2)
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
