package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(10), new SonyHand(5), new ToshibaLeg(5));
        robot1.action();
        robot1.getPrice();
        Robot robot2 = new Robot(new ToshibaHead(8), new SamsungHand(10), new SonyLeg(8));
        robot2.action();
        robot2.getPrice();
        Robot robot3 = new Robot(new SonyHead(5), new ToshibaHand(4), new SonyLeg(10));
        robot3.action();
        robot3.getPrice();

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Первый робот самый дорогой");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Второй робот самый дорогой");

        } else if (robot3.getPrice() > robot1.getPrice() && robot3.getPrice() > robot2.getPrice()) {
            System.out.println("Третий робот самый дорогой");
        }
    }

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


}


