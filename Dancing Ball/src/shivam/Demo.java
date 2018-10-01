package shivam;



import javax.swing.*;
import java.awt.*;

public class Demo {
    private static  int xVel;
    private static int yVel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        frame.add(p);
        frame.setSize(500, 500);

        frame.setVisible(true);

        frame.setResizable(true);


        Demo d1=new Demo();


        try {

            Thread.sleep(500);

        } catch (InterruptedException e) {



        }



        Graphics g = p.getGraphics();



        int xCord = 0;

        int yCord = 0;



        while (true) {

            try {

                Thread.sleep(10);

            } catch (InterruptedException e) {

                }


                if (xCord >= 400) {
                xCord = 400;
                Demo.xVel = -1;

                }

                if (yCord >= 350) {
                yCord = 350;
                Demo.yVel = -1;
                }

                if (xCord <= 0) {
                xCord = 0;
                Demo.xVel = 1;

                }

                if (yCord <= 0) {
                yCord = 0;
                Demo.yVel = 1;

                }

            xCord=xCord+Demo.xVel;

            yCord=yCord+Demo.yVel;

            g.clearRect(0, 0, 500, 500);

            g.setColor(Color.green);

            g.fillArc(xCord, yCord, 100, 100, 0, 360);

        }

    }

}