package c12ecercises.p1.squareMeterCalculator.dao;

import c12ecercises.p1.squareMeterCalculator.models.Property;
import c12ecercises.p1.squareMeterCalculator.models.Room;

import java.util.ArrayList;
import java.util.List;

public class DaoProperty implements Dao <String, Property>{

    List<Property> properties = new ArrayList<>();

    @Override
    public List<Property> getElements() {
        return this.properties;
    }

    @Override
    public Property getElement(String name) {
        Property property = null;
        for (Property p: properties) {
            if (p.getName().equals(name)) {
                property = p;
            }
        }
        return property;
    }

    @Override
    public void addElement(Property property) {
        this.properties.add(property);
    }
}
