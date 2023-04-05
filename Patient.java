public class Patient extends Person {
    private int id;
    private String[] diseases;
    private String treatment;

    public Patient(int id, String[] diseases, String treatment, String cNIC, String name, int age) {
        super(cNIC, name, age);
        this.id = id;
        this.diseases = diseases;
        this.treatment = treatment;
    }

    public int getId() {
        return id;
    }

    public String[] getDiseases() {
        return diseases;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiseases(String[] diseases) {
        this.diseases = diseases;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", diseases=" + diseases + ", treatment=" + treatment + '}';
    }
}