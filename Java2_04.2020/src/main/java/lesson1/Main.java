package lesson1;

import lesson1.*;

public class Main {
    public static void main (String[]args) {
        // Определение участников
        Cat cat1 = new Cat("Барсик");
        System.out.println("Участник " + cat1.name + " Бег " + cat1.maxRun + " Прыжок " + cat1.maxJump);

        Human human1 = new Human("Боб");
        System.out.println("Участник " + human1.name + " Бег " + human1.maxRun + " Прыжок " + human1.maxJump);

        Robot robot1 = new Robot("R2d2");
        System.out.println("Участник " + robot1.name + " Бег " + robot1.maxRun + " Прыжок " + robot1.maxJump);

        Distance distance1 = new Distance(1, 55);
        System.out.println("Дистанция " + distance1.getId() + " длинна "+distance1.getLength());

        Wall wall1 = new Wall(1, 10);
        System.out.println("Стена " + wall1.getId() + " высота " +wall1.getHeight());

        Distance distance2 = new Distance(2, 20);
        System.out.println("Дистанция " + distance2.getId() + " длинна "+ distance2.getLength());

        Wall wall2 = new Wall(2, 100);
        System.out.println("Стена " + wall2.getId() + " высота " + wall2.getHeight());

        cat1.run(distance1.getLength());
        human1.run(distance1.getLength());
        robot1.run(distance1.getLength());

        cat1.jump(wall1.getHeight());
        human1.jump(wall1.getHeight());
        robot1.jump(wall1.getHeight());

        cat1.run(distance2.getLength());
        human1.run(distance2.getLength());
        robot1.run(distance2.getLength());

        cat1.jump(wall2.getHeight());
        human1.jump(wall2.getHeight());
        robot1.jump(wall2.getHeight());
    }

}
