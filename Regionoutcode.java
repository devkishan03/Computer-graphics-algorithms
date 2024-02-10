public class Regionoutcode {

    int getOutcode(int x, int y, int xmin, int ymin, int xmax, int ymax) {
        int top = 8; // 1000
        int bottom = 4; // 0100
        int right = 2; // 0010
        int left = 1; // 0001
        int outcode = 0; // 0000
        if (x < xmin)
            outcode |= left;
        else if (x > xmax)
            outcode |= right;

        if (y < ymin)
            outcode |= bottom;
        if (y > ymax)
            outcode |= top;

        return outcode;
    }

    public static void main(String[] args) {
        Regionoutcode r = new Regionoutcode();
        int code = r.getOutcode(11, 8, 2, 2, 8, 6);
        System.out.println(Integer.toBinaryString(code));
    }
}
