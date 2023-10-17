public class Drug {
    private String drugName;
    private int dosage;

    public Drug(String name, int dose){
        drugName=name;
        dosage=dose;
    }

    public String getDrugName(){
        return drugName;
    }
    public int getDosage(){
        return dosage;
    }
}
