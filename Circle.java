public class Circle {

    void drawCircle(int x0, int y0, int radious) {
        int x = x0;
        int y = y0 + radious;
        int p = 1 - radious;

        while (x <= y) {
            System.out.println("putpixel(x:" + x + " y:" + y + "),p:" + p);
            // putpixel(x,y);
            if (p < 0) {
                p = p + 2 * x + 3;
                x++;
            } else {
                p = p + 2 * (x - y) + 5;
                x++;
                y--;
            }
        }

    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.drawCircle(2, 3, 8);
    }

}
