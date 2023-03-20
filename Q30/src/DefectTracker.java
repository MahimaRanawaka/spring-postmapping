import java.util.Arrays;
import java.util.Comparator;

public class DefectTracker {
    private Project[] projects;
    private Defect[][] defects;
    private int projectCount;

    public DefectTracker(int maxProjects) {
        this.projects = new Project[maxProjects];
        this.defects = new Defect[maxProjects][];
        this.projectCount = 0;
    }

    public void addProject(int projectId, String projectName) {
        Project project = new Project(projectId, projectName);
        this.projects[this.projectCount] = project;
        this.defects[this.projectCount] = new Defect[0];
        this.projectCount++;
    }

    public void addDefect(int projectId, int defectId, String defectDescription, String severity) {
        int projectIndex = findProjectIndex(projectId);
        if (projectIndex == -1) {
            throw new IllegalArgumentException("Invalid project ID");
        }

        Defect defect = new Defect(defectId, defectDescription, severity);
        Defect[] projectDefects = this.defects[projectIndex];
        Defect[] newDefects = new Defect[projectDefects.length + 1];
        int i = 0;
        for (Defect d : projectDefects) {
            if (d.getDefectId() == defectId) {
                throw new IllegalArgumentException("Defect ID already exists");
            }
            if (d.getSeverity().equals(severity)) {
                throw new IllegalArgumentException("Defect with same severity already exists");
            }
            newDefects[i] = d;
            i++;
        }
        newDefects[i] = defect;
        this.defects[projectIndex] = newDefects;
    }

    public Defect[] listDefects(int projectId) {
        int projectIndex = findProjectIndex(projectId);
        if (projectIndex == -1) {
            throw new IllegalArgumentException("Invalid project ID");
        }

        Defect[] projectDefects = this.defects[projectIndex];
        Arrays.sort(projectDefects, Comparator.comparing(Defect::getSeverity));
        return projectDefects;
    }

    private int findProjectIndex(int projectId) {
        for (int i = 0; i < this.projectCount; i++) {
            if (this.projects[i].getProjectId() == projectId) {
                return i;
            }
        }
        return -1;
    }
}
class main {
    public static void main(String[] args) {
        DefectTracker tracker = new DefectTracker(10);

        // Add projects
        tracker.addProject(1, "Project A");
        tracker.addProject(2, "Project B");

        // Add defects
        tracker.addDefect(1, 1, "Defect 1 for Project A", "HIGH");
        tracker.addDefect(1, 2, "Defect 2 for Project A", "MEDIUM");
        tracker.addDefect(1, 3, "Defect 3 for Project A", "LOW");
        tracker.addDefect(2, 1, "Defect 1 for Project B", "LOW");
        tracker.addDefect(2, 2, "Defect 2 for Project B", "HIGH");

        // List defects
        Defect[] projectADefects = tracker.listDefects(1);
        System.out.println("Defects for Project A:");
        for (Defect d : projectADefects) {
            System.out.println(d.getDefectId() + ", " + d.getDefectDescription() + ", " + d.getSeverity() + ", " + d.getDefectStatus());
        }

        Defect[] projectBDefects = tracker.listDefects(2);
        System.out.println("Defects for Project B:");
        for (Defect d : projectBDefects) {
            System.out.println(d.getDefectId() + ", " + d.getDefectDescription() + ", " + d.getSeverity() + ", " + d.getDefectStatus());
        }
    }
}
