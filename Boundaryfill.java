public class Boundaryfill {

    public void fillBoundary(int x, int y, int fillcolour, int boundarycolour) {

        int colour; // =getpixel(x,y);
        if ((colour != fillcolour) && (colour != boundarycolour)) {

            // putpixel(x,y,fillcolour);
            fillBoundary(x + 1, y, fillcolour, boundarycolour);
            fillBoundary(x - 1, y, fillcolour, boundarycolour);
            fillBoundary(x, y + 1, fillcolour, boundarycolour);
            fillBoundary(x, y - 1, fillcolour, boundarycolour);

            fillBoundary(x + 1, y + 1, fillcolour, boundarycolour);
            fillBoundary(x + 1, y - 1, fillcolour, boundarycolour);
            fillBoundary(x - 1, y + 1, fillcolour, boundarycolour);
            fillBoundary(x - 1, y - 1, fillcolour, boundarycolour);
        }

    }

    public static void main(String[] args) {
        Boundaryfill b = new Boundaryfill();
        b.fillBoundary(0, 0, 0, 0);
    }
}