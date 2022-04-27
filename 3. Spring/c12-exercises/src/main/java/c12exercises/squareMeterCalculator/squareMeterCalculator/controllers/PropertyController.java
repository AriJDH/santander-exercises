package c12exercises.squareMeterCalculator.squareMeterCalculator.controllers;

import c12exercises.squareMeterCalculator.squareMeterCalculator.App;
import c12exercises.squareMeterCalculator.squareMeterCalculator.models.Property;
import c12exercises.squareMeterCalculator.squareMeterCalculator.models.Room;
import c12exercises.squareMeterCalculator.squareMeterCalculator.services.PropertyService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyController {

    PropertyService propertyService = new PropertyService();
    Logger LOGGER = LoggerFactory.getLogger(App.class);

    @GetMapping("/properties")
    public ResponseEntity<List<Property>> getProperties() {
        return new ResponseEntity<>(propertyService.getProperties(), HttpStatus.OK);
    }

    @PostMapping("/properties/add")
    public ResponseEntity<String> addProperty(@RequestBody Property property) {
        LOGGER.info(property.toString());
        propertyService.addProperty(property);
        return new ResponseEntity<>("Property added.", HttpStatus.CREATED);
    }

    @GetMapping("/properties/getSquareMeters/{name}")
    public ResponseEntity<Double> getSquareMeters(@PathVariable String name) {
        return new ResponseEntity<>(propertyService.getSquareMeters(name), HttpStatus.OK);
    }

    @GetMapping("/properties/getPrice/{name}")
    public ResponseEntity<Double> getPrice(@PathVariable String name) {
        return new ResponseEntity<>(propertyService.getPrice(name), HttpStatus.OK);
    }

    @GetMapping("/properties/biggestRoom/{name}")
    public ResponseEntity<Room> getBiggestRoom(@PathVariable String name) {
        return new ResponseEntity<>(propertyService.getBiggestRoom(name), HttpStatus.OK);
    }

    @GetMapping("/properties/squareMetersPerRoom/{name}")
    public ResponseEntity<List<String>> getSquareMetersPerRoom(@PathVariable String name) {
        return new ResponseEntity<>(propertyService.getSquareMetersPerRoom(name), HttpStatus.OK);
    }

}
