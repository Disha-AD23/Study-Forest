import jakarta.persistence.*;

@Entity
public class StudyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalTime;
    private int treeCount;

    public StudyData() {}

    public StudyData(int totalTime, int treeCount) {
        this.totalTime = totalTime;
        this.treeCount = treeCount;
    }

    public Long getId() {
        return id;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTreeCount() {
        return treeCount;
    }

    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }
}
