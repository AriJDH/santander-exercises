package c12exercises.squareMeterCalculator.squareMeterCalculator.services;

import c12exercises.squareMeterCalculator.squareMeterCalculator.dao.Dao;
import c12exercises.squareMeterCalculator.squareMeterCalculator.dao.DaoProperty;
import c12exercises.squareMeterCalculator.squareMeterCalculator.models.Property;
import c12exercises.squareMeterCalculator.squareMeterCalculator.models.Room;

import java.util.ArrayList;
import java.util.List;

public class PropertyService {

    Dao<String, Property> propertyDao = new DaoProperty();

    public List<Property> getProperties() {
        return propertyDao.getElements();
    }

    public Property getProperty(String name) {
        return propertyDao.getElement(name);
    }

    public void addProperty(Property p){
        propertyDao.addElement(p);
    }

    public double getSquareMeters(String name) {

        Property p = propertyDao.getElement(name);
        double sumSquareMeters = 0;
        for (Room r: p.getRooms()) {
            sumSquareMeters += r.getSquareMeters();
        }
        return sumSquareMeters;
    }

    public double getPrice(String name) {
        return getSquareMeters(name) * 800;
    }

    public Room getBiggestRoom(String name) {

        Property p = propertyDao.getElement(name);
        Room biggestRoom = null;
        double aux = 0;
        for (Room r: p.getRooms()) {
            if (aux < r.getSquareMeters()) {
                biggestRoom = r;
            }
        }
        return biggestRoom;
    }

    public List<String> getSquareMetersPerRoom(String name) {

        Property p = propertyDao.getElement(name);
        List<String> res = new ArrayList<>();

        for (Room r: p.getRooms()) {
            res.add(r.getName() + ": " + r.getSquareMeters());
        }

        return res;
    }

}
