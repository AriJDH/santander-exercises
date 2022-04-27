package c12exercises.diploma.models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private List<Subject> subjects;

}

/*
*
*
*
* */

