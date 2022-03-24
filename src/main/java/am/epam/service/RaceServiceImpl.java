package am.epam.service;

import am.epam.beans.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("raceService")
public class RaceServiceImpl implements RaceService {

    private HorseService horseService;

    @Autowired
    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    @Override
    public Race getRace() {
        Race race = new Race();
        race.setLength(10);
        race.setParticipatingHorses(horseService.getHorses());
        race.setStartDate(LocalDate.of(2022, 6, 10));
        return race;
    }
}

