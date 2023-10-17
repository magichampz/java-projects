public class Patient {

    private String name;
    private int weight;
    private int age;
    public Patient(String name, int weight, int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }


}
