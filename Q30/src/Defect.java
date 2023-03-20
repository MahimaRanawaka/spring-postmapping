public class Defect {
    private int defectId;
    private String defectDescription;
    private String severity;
    private String defectStatus;

    public Defect(int defectId, String defectDescription, String severity) {
        this.defectId = defectId;
        this.defectDescription = defectDescription;
        this.severity = severity;
        this.defectStatus = "NEW";
    }

    public int getDefectId() {
        return defectId;
    }

    public String getDefectDescription() {
        return defectDescription;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }
}
