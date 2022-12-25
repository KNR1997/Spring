package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring FrameWork Description"),
            new Topic("JS", "JavaScript", "Most popular right now"),
            new Topic("Java", "Core Java", "My first programming Language")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }


    public void updateTopic(String id, Topic topic) {


    }
}
