public class Medical {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        Patient patient1 = new Patient(1, new String[]{"flu", "cough"}, "rest and Meds", "12345678", "faizan", 22);
        patient1.setAge(30);
        patient1.setDiseases(new String[]{"flu", "cough"});
        patient1.setId(1);
        patient1.setName("faizan");
        patient1.setTreatment("rest and meds");
        patient1.setcNIC("12345678");
        list.display();



    }
}
