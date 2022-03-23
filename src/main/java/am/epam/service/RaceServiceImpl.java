package am.epam.service;

import am.epam.beans.Race;
import java.time.LocalDate;

public class RaceServiceImpl implements RaceService {

    private HorseService horseService;

    public RaceServiceImpl(HorseService horseService) {
        this.horseService = horseService;
    }

    @Override
    public Race getRace() {
        Race race = new Race();
        race.setLength(10);
        race.setParticipatingHorses(horseService.getHorses());
        int size = horseService.getHorses().size();
        System.out.println(size);
        race.setStartDate(LocalDate.of(2022, 6, 10));
        return race;
    }

}
