import com.example.studyforest.model.StudyData;
import com.example.studyforest.repository.StudyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudyDataService {

    @Autowired
    private StudyDataRepository repository;

    public StudyData getStudyData() {
        return repository.findById(1L).orElseGet(() -> {
            StudyData newData = new StudyData(0, 0);
            repository.save(newData);
            return newData;
        });
    }

    public void updateStudyData(int additionalTime, int additionalTrees) {
        StudyData data = getStudyData();
        data.setTotalTime(data.getTotalTime() + additionalTime);
        data.setTreeCount(data.getTreeCount() + additionalTrees);
        repository.save(data);
    }

    public void resetStudyData() {
        StudyData data = getStudyData();
        data.setTotalTime(0);
        data.setTreeCount(0);
        repository.save(data);
    }
}
