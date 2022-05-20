package com.example.Sorteo.Services;

import com.example.Sorteo.Dtos.TopicDto;
import com.example.Sorteo.Dtos.TopicResponseDto;
import com.example.Sorteo.Models.Topic;
import com.example.Sorteo.Repository.ITopicRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {

    @Autowired
    ITopicRepository itopicRepository;
    ModelMapper modelMapper = new ModelMapper();

    public List<TopicDto> getTopics() {

        List<Topic> topicList = itopicRepository.findAll();
        return topicList.stream()
                .map(topic ->
                        modelMapper.map(topic, TopicDto.class)).collect(Collectors.toList());
    }


    public boolean addTopic(TopicDto topicDto) {
        Topic topic = modelMapper.map(topicDto, Topic.class);

        topic =  this.itopicRepository.save(topic);

        if(topic.getId() != null) return true; else return false;
    }
}
