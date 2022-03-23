package am.epam.config;

import am.epam.beans.Horse;
import am.epam.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("am.epam")
public class HorseRaceConfig {

    @Bean
    public List<Horse> horseList() {
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("Arabian", 0, "Ahmed"));
        horseList.add(new Horse("Friesian", 1, "Oliver"));
        horseList.add(new Horse("Mustang", 2, "James"));
        horseList.add(new Horse("Shire", 3, "Lucas"));
        horseList.add(new Horse("Cob", 4, "William"));
        return horseList;
    }

    @Bean
    public HorseServiceImpl horseService() {
        return new HorseServiceImpl(horseList());
    }

    @Bean
    public RaceServiceImpl raceService() {
        return new RaceServiceImpl(horseService());
    }

    @Bean
    public EmulationServiceImpl emulationService() {
        return new EmulationServiceImpl(horseService());
    }

}