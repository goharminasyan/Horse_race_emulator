package am.epam.service;

import am.epam.beans.Horse;

import java.util.List;

public interface HorseService {
    List<Horse> getHorses();
    Horse getHorse(int index);
}
