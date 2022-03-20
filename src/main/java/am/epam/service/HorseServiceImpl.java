package am.epam.service;

import am.epam.beans.Horse;

import java.util.List;

public class HorseServiceImpl implements HorseService {
    private List<Horse> horses;

    public HorseServiceImpl(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Horse getHorse(int index) {
        return horses.get(index);
    }

}
