package am.epam.service;

import am.epam.beans.Race;

import java.time.LocalDate;

public class RaceServiceImpl implements RaceService{

    private HorseService horseService;

    @Override
    public Race getRace() {
        Race race = new Race();
        race.setLength(10);
        race.setParticipatingHorses(horseService.getHorses());
        race.setStartDate(LocalDate.of(2022, 6, 10));
        return race;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }
}
