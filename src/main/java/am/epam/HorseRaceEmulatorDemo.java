package am.epam;

import am.epam.config.HorseRaceConfig;
import am.epam.service.EmulationService;
import am.epam.service.HorseService;
import am.epam.service.RaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HorseRaceEmulatorDemo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(HorseRaceConfig.class);
        HorseService horseService = context.getBean("horseService", HorseService.class);
        System.out.println(horseService.getHorses());

        RaceService raceService = context.getBean("raceService", RaceService.class);
        System.out.println("Information about race");
        System.out.println(raceService.getRace() + "\n)");


        System.out.println("Emulation starts.");
        EmulationService emulationService = context.getBean("emulationService", EmulationService.class);
        for (int j =9; j <= 60; j += 10) {
            System.out.println("Result at " + j + " second");
            System.out.println(emulationService.getRaceResult() + "\n");
        }
    }
}