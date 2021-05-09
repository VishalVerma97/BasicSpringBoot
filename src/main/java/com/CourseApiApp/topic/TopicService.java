package com.CourseApiApp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("Spring", "Spring Framework", "This is java framework"),
//                new Topic("Rails", "Rails Framework", "This is ruby framework"),
//                new Topic("Angular", "Angular Framework", "This is angular framework")
//        ));
//
//    public List<Topic> getAllTopics() {
//        return topics;
//    }
//
//    public Topic getTopic(String id) {
//        return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
//    }
//
//    public void addTopic(Topic topic) {
//        topics.add(topic);
//    }
//
//    public void updateTopic(Topic topic, String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
//    }
//
//    public void deleteTopic(String id) {
//        topics.removeIf(x -> x.getId().equals(id));
//    }


    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

}
