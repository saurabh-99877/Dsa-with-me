public class ShortestPath {
    public static float getPath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'N')
                y++;
            else if (c == 'S')
                y--;
            else if (c == 'E')
                x++;
            else
                x--;
        }

        return (float)Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(getPath(s));
    }
}
