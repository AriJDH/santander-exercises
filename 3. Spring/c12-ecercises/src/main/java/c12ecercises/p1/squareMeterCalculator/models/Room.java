package c12ecercises.p1.squareMeterCalculator.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class Room {

    private String name;
    private double width;
    private double length;

    public double getSquareMeters() {
        return this.width * this.length;
    }

}