public class DrugDosageCalculator {


//    private Patient pat;
//    private Drug drug;
    private int age;
    private int weight;
    private String drug;
    private String name;
    private int dosage;
    private double finalDose;
    private int overAge;


    public String DrugDosageCalculator(Patient patient, Drug drugg){
//        pat = patient;
//        drug = drugg;
        age = patient.getAge();
        weight = patient.getWeight();
        drug = drugg.getDrugName();
        name = patient.getName();
        dosage = drugg.getDosage();

        if(age>=65) overAge = age-65;
        else overAge=0;
        finalDose = dosage*weight*(1-(0.02*overAge));

        System.out.println("Name: " + name +  ", Age: " + age + ", weight: " + weight + ", Drug: " + drug + ", Final Dosage: "+ finalDose);
        return name;

    }

//    public String calculate(Patient patient, Drug drugg){
//
//    }
}
