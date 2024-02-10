public class Midpointcirclealgo {

    public void drawCircle(int x0, int y0, int radious) {
        int x = x0;
        int y = y0 + radious;
        int p = 1 - radious;
        System.out.println("writepixles(x:" + x + ",y:" + y + ")" + ",p:" + p);

        while (x <= y) {
            if (p < 0) {
                p = p + 2 * x + 3;
            } else {
                p = p + 2 * (x - y) + 5;
                y--;
            }
            x++;

            System.out.print("writepixles(x:" + x + ",y:" + y + ")");
            System.out.println(",p:" + p);
        }

    }

    public static void main(String[] args) {
        Midpointcirclealgo m = new Midpointcirclealgo();
        m.drawCircle(3, 2, 8);
    }

}
