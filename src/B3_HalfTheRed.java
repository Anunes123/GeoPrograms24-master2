public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.teleport(500,500);
        plane.loadBackGround("city.jpg");
        plane.showBackGround();


        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red >235 && green >235 && blue >235) {
                    plane.setPixelColor(red / 2, green / 4, blue);
                }
            }
        }
    }
}
