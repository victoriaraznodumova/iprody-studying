package lesson11.task2;

import lesson11.task2.obstacles.*;
import lesson11.task2.participants.*;

public class Competition {
    public static void start(){
        Participant[] participants = new Participant[]{new Human("Мужчина", 6, 5),
                new Cat("Котенок", 2, 1),
                new Robot("Электроник", 15, 10)};

        Obstacle[] obstacles = new Obstacle[]{new Treadmill(1),
                new Wall(5), new Treadmill(12), new Wall(0.8)};

        for (Participant participant: participants) {
            System.out.println("Полоса препятствий для участника " + participant.getName());
            for (Obstacle obstacle: obstacles) {
                obstacle.overcome(participant);
                if (obstacle.getCurrentResult(participant)){
                    System.out.println("Участник " + participant.getName() + " прошел препятствие " +
                            obstacle.getNameAndNumber() + " на дистанции " + obstacle.getMaxDistance() );
                }
                else{
                    System.out.println("Участник " + participant.getName() + " не прошел препятствие " +
                            obstacle.getNameAndNumber() + " на дистанции " + obstacle.getMaxDistance() +
                            ". Пройдено значение " + obstacle.getCurrentDistance(participant));
                    break;
                }
                System.out.println();
            }
            System.out.println("\n\n\n");
        }
    }
}