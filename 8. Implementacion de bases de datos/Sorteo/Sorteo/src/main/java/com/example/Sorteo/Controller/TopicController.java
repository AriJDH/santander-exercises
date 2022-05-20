package com.example.Sorteo.Controller;

import com.example.Sorteo.Dtos.SuccessDto;
import com.example.Sorteo.Dtos.TopicDto;
import com.example.Sorteo.Dtos.TopicResponseDto;
import com.example.Sorteo.Services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TopicController {
    @Autowired
    TopicService topicService;

    @GetMapping("/topics")
    public ResponseEntity<List<TopicDto>> detTopics(){
        return ResponseEntity.ok().body(topicService.getTopics());
    }
    @PostMapping("/topic")
    public ResponseEntity<SuccessDto> addTopic(@RequestBody TopicDto topicDto){
        if(this.topicService.addTopic(topicDto)){
            return ResponseEntity.ok()
                    .body(new SuccessDto("Se ha creado el temaaaa", HttpStatus.CREATED.value()));
        }
        else
            throw new RuntimeException();
    }
}
