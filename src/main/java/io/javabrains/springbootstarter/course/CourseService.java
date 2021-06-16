package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    /*private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "spring framework", "spring framework description"),
                new Topic("java", "core java", "java description"),
                new Topic("js", "java script", "js description"))
    );*/

    public List<Course> getAllCourses(String id){
        // return topics;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id){
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id);
    }

    public void addCourse(Course course){
        //topics.add(topic);
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        /*for(int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }*/
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        /*for(int i = 0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.remove(i);
                return;
            }
        }*/
        courseRepository.deleteById(id);
    }
}
