package am.epam.service;

import am.epam.beans.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.*;


@Component("emulationService")
public class EmulationServiceImpl implements EmulationService {
    private HorseService horseService;

    @Autowired
    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    public HorseService getHorseService() {
        return horseService;
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
