package lesson1;

public class Cat {
    public String name;
    public int maxRun = 50;
    public int maxJump = 70;
    protected int runDistance;
    protected int jumpHeight;

    public Cat(String name){
        this.name = name;
    }

    // Установка параметров
    // Бег
    public void setRunDistance(int runDistance) {
        if (runDistance >= 0 && runDistance <= maxRun) {
            this.runDistance = runDistance;
            System.out.println("Пробежал");
        }else
            System.out.println("Не пробежал");
    }

    // Прыжки
    public void setJumpHeight(double jumpHeight) {
        if ((jumpHeight >= 0) & (jumpHeight <= maxJump)){
            this.jumpHeight = (int) jumpHeight;
            System.out.println("Перепрыгнул");
        } else
            System.out.println("Не перепрыгнул");
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    // Действия
    public void run(int runDistance){
        if (runDistance < maxRun)
            System.out.println(this.name + " Пробежал " + runDistance);
        else System.out.println(this.name + " Не пробежал " + runDistance );
    }

    public void jump(int jumpHigh){
        if (jumpHigh < maxJump)
            System.out.println(this.name + " Перепрыгнул " + jumpHigh);
        else System.out.println(this.name + " Не перепрыгнул "+ jumpHigh);
    }
}
