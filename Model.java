public class Model {
    private String name;
    private String reasonOfFailure;
    private String dateRetired;

    public Model(String name, String reasonOfFailure, String dateRetired) {
        this.name = name;
        this.reasonOfFailure = reasonOfFailure;
        this.dateRetired = dateRetired;
    }

    public String getName() { return name; }
    public String getReasonOfFailure() { return reasonOfFailure; }
    public String getDateRetired() { return dateRetired; }

    @Override
    public String toString() {
        return name + " - Failed due to: " + reasonOfFailure + " on " + dateRetired;
    }
}
