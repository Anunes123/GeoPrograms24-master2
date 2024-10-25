public class GradedPicture extends  World {
    public int red;
    public int blue;
    public int green;
//
    public void go() {
        plane.loadBackGround("CharlieBrown.png");
        plane.showBackGround();

        plane.teleport(500, 500);
        plane.pausetime = 1;

        for (int x = 0; x < 1000; x = x + 50) {
            plane.startingAngle(270);
            plane.teleport(x, 800);
            int length = (int) (Math.random() * 301);
            if (length >= 200) {
                System.out.println("Tall Building");
            }
            square(length);
            System.out.println("x: " + x);
        }


        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 254 && green > 254 && blue > 254) {
                    plane.setPixelColor(red / 2, green / 2, blue - 1);
                }
            }
        }

    }
    public void square ( int distance){
                for (int z = 0; z < 2; z = z + 1) {

                    plane.isTrail = true;
                    plane.move(distance);
                    plane.turn(270);
                    plane.move(30);
                    plane.turn(270);
                    System.out.println("z: " + z);

                }


            }
        }


