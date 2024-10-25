public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 0;
        for (int y = 0; y < 700; y = y + 1)
            for (int x = 0; x < 800; x = x + 1) {
                plane.teleport(x, y);
                plane.setColor(100, 100, (y / 8) + (x / 8));
                System.out.println("x: " + x);
                plane.square(1);


                {

                }

            }
    }
public void rowofsquares(int y) {

        plane.teleport(1, 300);
        for (int x = 0; x < 800; x = x + 1) {
            plane.teleport(x , y);
            plane.setColor(100,100,(y/8)+(x/8));
            System.out.println("x: " + x);
            plane.square(1);

        }
    }
}