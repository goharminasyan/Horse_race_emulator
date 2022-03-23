package am.epam.service;

import am.epam.beans.Horse;
import org.springframework.stereotype.Component;

import java.util.List;

public interface HorseService {
    List<Horse> getHorses();
}
