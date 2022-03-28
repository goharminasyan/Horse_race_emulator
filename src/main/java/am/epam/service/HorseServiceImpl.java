package am.epam.service;

import am.epam.beans.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("horseService")
public class HorseServiceImpl implements HorseService {

    private List<Horse> horseList;

    @Autowired
    public HorseServiceImpl(@Qualifier("horses") List<Horse> horseList) {
        this.horseList = horseList;
    }

    public List<Horse> getHorseList() {
        return horseList;
    }

    @Override
    public List<Horse> getHorses() {
        return horseList;
    }

    @Override
    public Horse getHorse(int index) {
        return horseList.get(index);
    }
}

