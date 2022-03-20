package am.epam.service;

import am.epam.beans.Horse;


import java.util.*;

public class EmulationServiceImpl implements EmulationService {
    private HorseService horseService;

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    @Override
    public List<Horse> getRaceResult() {
        List<Horse> result = new ArrayList<>();
        int max = horseService.getHorses().size();

            for (int i = 0; i < max; i++) {
                Horse horse = horseService.getHorses().get(i);
                result.add(horse);
                Collections.shuffle(result);
            }
        return result;
    }
}
