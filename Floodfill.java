public class Floodfill {

    public void fillflood(int x, int y, int old_colour, int new_colour) {
        if (getpixel(x, y) == old_colour) {
            putpixel(x, y, new_colour);

            fillflood(x + 1, y, old_colour, new_colour);
            fillflood(x - 1, y, old_colour, new_colour);
            fillflood(x, y + 1, old_colour, new_colour);
            fillflood(x, y - 1, old_colour, new_colour);

            fillflood(x + 1, y + 1, old_colour, new_colour);
            fillflood(x + 1, y - 1, old_colour, new_colour);
            fillflood(x - 1, y + 1, old_colour, new_colour);
            fillflood(x - 1, y - 1, old_colour, new_colour);
        }
    }

    public static void main(String[] args) {
        Floodfill f = new Floodfill();
        f.fillflood(0, 0, 0, 0);
    }
}
