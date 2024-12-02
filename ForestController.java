import com.example.studyforest.model.StudyData;
import com.example.studyforest.service.StudyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ForestController {

    @Autowired
    private StudyDataService service;

    @GetMapping("/data")
    public StudyData getStudyData() {
        return service.getStudyData();
    }

    @PostMapping("/grow")
    public void growTree() {
        service.updateStudyData(60, 1); // 1 minute of study adds 1 tree
    }

    @PostMapping("/reset")
    public void reset() {
        service.resetStudyData();
    }
}
