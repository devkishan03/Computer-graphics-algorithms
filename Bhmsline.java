public class Bhmsline {

    public void drawLine(double x1, double y1, double x2, double y2) {
        double x = x1;
        double y = y1;
        double dy = (y2 - y1);
        double dx = (x2 - x1);
        double m = dy / dx;
        double p;

        if (m < 1) {
            p = (2 * dy) - dx;
        } else {
            p = (2 * dx) - dy;
        }
        while (x <= x2 && y <= y2) {
            System.out.print(" P_old: " + p);
            System.out.print(" X: " + x + " Y: " + y);
            // putpixel(x,y)
            if (m < 1 && p < 0) {
                p = p + (2 * dy);
                x++;
            } else if (m < 1 && p >= 0) {
                p = p + 2 * (dy - dx);
                x++;
                y++;
            } else if (m > 1 && p < 0) {
                p = p + (2 * dx);
                y++;
            } else if (m > 1 && p >= 0) {
                p = p + 2 * (dx - dy);
                y++;
                x++;
            }
            System.out.println(" P_new: " + p);
        }

    }

    public static void main(String[] args) {
        Bhmsline b = new Bhmsline();
        b.drawLine(2, 1, 6, 9);
    }
}
