package am.epam;

import am.epam.service.EmulationService;
import am.epam.service.HorseService;
import am.epam.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class HorseRaceEmulatorDemo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HorseService horseService = context.getBean("horseService", HorseService.class);

        RaceService raceService = context.getBean("raceService", RaceService.class);
        System.out.println("Information about race");
        System.out.println(raceService.getRace() + "\n)");

        System.out.println("Enter your preferred horse race number");
        Scanner s = new Scanner(System.in);
        int horseNumber = s.nextInt();
        if(horseNumber>horseService.getHorses().size()){
            throw new RuntimeException("There is no horse with such a number in this race");
        }else {
            System.out.println("You have chosen: "+horseService.getHorse(horseNumber));
        }

        System.out.println("Emulation starts.");
        EmulationService emulationService = context.getBean("emulationService", EmulationService.class);
        for (int j =9; j <= 60; j += 10) {
            System.out.println("Result at " + j + " second");
            System.out.println(emulationService.getRaceResult() + "\n");
        }
    }
}