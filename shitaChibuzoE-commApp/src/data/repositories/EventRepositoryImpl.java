package data.repositories;


import data.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRepositoryImpl implements EventRepository{

    private int lastIdCreated;

    private List<Event> events = new ArrayList<>();
    @Override
    public Event save(Event aEvent) {
        boolean isSaved = aEvent.getId() != 0;
        if (isSaved) update(aEvent); else saveNewEvent(aEvent);

        return aEvent;
    }
    private void update(Event aEvent) {
//        Package savedPackage = findById(aPackage.getId());
//        int indexOfSavedPackage = packages.indexOf(savedPackage);
//        packages.set(indexOfSavedPackage,aPackage);

//        Package savedPackage = findById(aPackage.getId());
//        packages.remove(savedPackage);
        delete(aEvent.getId());
        events.add(aEvent);
    }

    private void saveNewEvent(Event aEvent){
        events.add(aEvent);
        aEvent.setId(generateEventId());
        lastIdCreated++;
    }

    @Override
    public Event findById(int id) {
        for (Event aEvent: events) if(aEvent.getId() == id) return aEvent;
        return null;
    }
    private int generateEventId() {
        return lastIdCreated+1;
    }

    @Override
    public void delete(Event aEvent) {
        events.remove(aEvent);
    }

    @Override
    public void delete(int id) {
        Event foundEvent = findById(id);
        delete(foundEvent);
    }

    @Override
    public List<Event> findAll() {
        return events;
    }


    @Override
    public long count() {
        return lastIdCreated;
    }
}
