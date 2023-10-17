import java.util.ArrayList; // import the ArrayList class
public class Main {
    public static void main(String[] args){
        Patient pat1 = new Patient("John Barking", 65, 60);
        Patient pat2 = new Patient("Samantha Olives", 65, 70);
        Patient pat3 = new Patient("Paul Ball", 90, 45);

        Drug drug1 = new Drug("Paracetamol", 10);
        Drug drug2 = new Drug("Benadryl", 5);

        ArrayList<Patient> patients = new ArrayList<Patient>();
        ArrayList<Drug> drugs = new ArrayList<Drug>();

        patients.add(pat1);
        patients.add(pat2);
        patients.add(pat3);
        drugs.add(drug1);
        drugs.add(drug2);

        for (int i = 0; i < patients.size(); i++) {
            for (int j = 0; j < drugs.size();j++){
                DrugDosageCalculator calc = new DrugDosageCalculator();
                calc.DrugDosageCalculator(patients.get(i), drugs.get(j));
//                DrugDosageCalculator(patients.get(i), drugs.get(j));

            }

        }
//            System.out.println(cars.get(i));








//        // Instantiate an object of class Calculator with initial value of zero
//        Calculator calc=new Calculator(0); // This will call the constructor
//        // Add some values
//        calc.add(5.2);
//        calc.add(2);
//        calc.subtract(3);
//        calc.multiply(3);
//        calc.sqrt();
//
////        System.out.println("clearing");
//
//        int i;

//        calc.AC();
//        for(i=0;i<=10;i++){ //iterating from i=0 to i = 10
//            calc.add(i); // adding 1 then 2 then 3 then .....
//        }
//
//        calc.AC();
//        System.out.println("next one");
//        for(i=10;i>0;i=i-2){ //iterating from 10 to 0 in steps of 2
//            System.out.println("i="+i);
//            calc.add(i);
//        }
//
//        calc.AC();
//        calc.add(1);
//        for(i=7;i<=15;i++){ //iterating from i=0 to i = 10
//            calc.multiply(i); // adding 1 then 2 then 3 then .....
//        }

//        calc.AC();
//        for(i=2;i<=100;i++){
//            if(i%6==0) continue;
//            else calc.add(i);
//        }


    }

}
