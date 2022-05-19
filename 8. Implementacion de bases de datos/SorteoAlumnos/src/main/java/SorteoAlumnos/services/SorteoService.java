package SorteoAlumnos.services;

import SorteoAlumnos.dtos.StudentDTO;
import SorteoAlumnos.dtos.StudentSorteadosDTO;
import SorteoAlumnos.dtos.TopicDTO;
import SorteoAlumnos.entities.Student;
import SorteoAlumnos.entities.Topic;
import SorteoAlumnos.repositories.StudentRepository;
import SorteoAlumnos.repositories.TopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class SorteoService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TopicRepository topicRepository;

    ModelMapper modelMapper = new ModelMapper();

    public boolean addStudent(StudentDTO studentDTO) {
        Student student = modelMapper.map(studentDTO, Student.class);

        student = this.studentRepository.save(student);

        return student.getId() != null;
    }

    public boolean addTopic(TopicDTO topicDto) {
        Topic topic = modelMapper.map(topicDto, Topic.class);

        topic = this.topicRepository.save(topic);

        return topic.getId() != null;
    }

    public List<StudentDTO> getStudents() {
        List<Student> students = studentRepository.findAll();

        return students.stream().map(student -> modelMapper.map(student, StudentDTO.class))
                .collect(Collectors.toList());
    }

    public List<TopicDTO> getTopics() {
        List<Topic> topics = topicRepository.findAll();

        return topics.stream().map(topic -> modelMapper.map(topic, TopicDTO.class))
                .collect(Collectors.toList());
    }

    public List<StudentSorteadosDTO> getDraw() {

        List<Optional<Student>> students = new ArrayList<>();
        ThreadLocalRandom.current().ints(6, 20)
                .distinct().limit(5).forEach( n ->
                        students.add(studentRepository.findById(n))
                );

        List<StudentSorteadosDTO> studentSorteados = new ArrayList<>();

        for (Optional<Student> student: students) {
            StudentSorteadosDTO studentSorteadosDTO = new StudentSorteadosDTO();
            studentSorteadosDTO.setFirst_name(student.get().getFirst_name());
            studentSorteadosDTO.setLast_name(student.get().getLast_name());
            studentSorteadosDTO.setTopic_name(student.get().getTopic().getName());
            studentSorteadosDTO.setTopic_complexity(student.get().getTopic().getComplexity());
            studentSorteados.add(studentSorteadosDTO);
        }

        return studentSorteados;
    }

}
