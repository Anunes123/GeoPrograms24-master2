public class A1_HowToMove extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;
        plane.startingAngle(0);
        plane.teleport(96,328);

        plane.isTrail = true;


houses();

    }

    public void houses() {
        int dis= 20;
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();
        plane.isTrail = false;
        plane.move(dis);
        plane.isTrail = true;
        house();

    }
        public void house() {

        int size= 100;
        plane.setColor((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
            plane.trailWidth=(int)(Math.random()*10)+1;
            plane.move(size);
            plane.turn(90);
            plane.move(size);
            plane.turn(90);
            plane.move(size);
            plane.turn(90);
            plane.move(size);
            plane.isTrail=false;
            plane.turn(180);
            plane.move(size);
            plane.isTrail=true;
            plane.turn(-45);
            plane.move(75);
            plane.turn(-90);
            plane.move(67);
            plane.turn(-45);
            plane.move(size);
            plane.turn(90);
        }
    }
