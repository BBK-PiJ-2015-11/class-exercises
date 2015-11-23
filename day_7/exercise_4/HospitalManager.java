public class HospitalManager {
	private Patient firstPatient = null;
	private Patient lastPatient = null;
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}

	private void launch() {
		Patient alice = new Patient("Alice", 77, "Bad hair");
		Patient bob = new Patient("Bob", 2, "No sense of humour");
		Patient charlie = new Patient("Charlie", 56, "Giggles");
		Patient dylan = new Patient("Dylan", 45, "Bubonic plague");
		Patient ellie = new Patient("Ellie", 3, "Morbid");
		Patient frank = new Patient("Frank", 82, "Dead");
		Patient george = new Patient("George", 43, "Bald");
		Patient harold = new Patient("Harold", 32, "Stroke");
		Patient ian = new Patient("Ian", 19, "Rebel");
		Patient john = new Patient("John", 33, "Tuberculosis");
		
		firstPatient = alice;
		
		firstPatient.addPatient(bob); 
		firstPatient.addPatient(charlie); 
		firstPatient.addPatient(dylan); 
		firstPatient.addPatient(ellie); 
		firstPatient.addPatient(frank); 
		firstPatient.addPatient(george); 
		firstPatient.addPatient(harold); 
		firstPatient.addPatient(ian); 
		firstPatient.addPatient(john);

		firstPatient.printForward();
		System.out.println("");
		
		firstPatient.printBackwardEfficiently();
		System.out.println("");

		firstPatient.getLast().printBackward();
		System.out.println("");
		
		Patient kyle = new Patient("Kyle", 22, "Measles");
		firstPatient.addPatient(kyle);
		
		firstPatient.deletePatient(george);
		firstPatient.deletePatient(charlie);
		
		// Test deleting a patient not in the double-linked list
		Patient imposter = new Patient("Imposter", 46, "Not a real patient");
		firstPatient.deletePatient(imposter);
		
		firstPatient.printForward();
		System.out.println("");
		
		firstPatient.getLast().printBackward();
		System.out.println("");
	}
}