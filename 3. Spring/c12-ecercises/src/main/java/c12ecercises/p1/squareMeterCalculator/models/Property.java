package c12ecercises.p1.squareMeterCalculator.models;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class Property {

    private String name;
    private String direction;
    private List<Room> rooms;

}

