package am.epam.service;

import am.epam.beans.Horse;

import java.util.List;


public class HorseServiceImpl implements HorseService {

    private List<Horse> horseList;

    public HorseServiceImpl(List<Horse> horseList) {
        this.horseList = horseList;
    }

    public List<Horse> getHorseList() {
        return horseList;
    }

    @Override
    public List<Horse> getHorses() {
        if(horseList!=null){
        return horseList;}
        return null;
    }
}
