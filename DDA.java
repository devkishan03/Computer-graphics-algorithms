public class DDA {
    public void drawLine(double x1, double y1, double x2, double y2) {
        double x = x1;
        double y = y1;
        double dy = y2 - y1;
        double dx = x2 - x1;
        double m = dy / dx;
        while (x <= x2 || y <= y2) {
            System.out.println("X:" + x + " Y:" + y + ",putPixel(x:" + Math.round(x) + ",y:" + Math.round(y) + ")");
            if (m < 1) {
                x++;
                y = y + m;
            } else if (m > 1) {
                y++;
                x = x + (1 / m);
            } else {
                x++;
                y++;
            }
        }
    }

    public static void main(String[] args) {
        DDA d = new DDA();
        d.drawLine(2, 2, 7, 5);
    }
}
