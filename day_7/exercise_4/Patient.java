public class Patient {
	public String name;
	public int age;
	public String illness;
	public Patient prevPatient;
	public Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.prevPatient = null;
		this.nextPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			this.nextPatient.prevPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			// FIXME: Assumes patient name is unique
			this.nextPatient = this.nextPatient.nextPatient;
			this.nextPatient.prevPatient = this;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public Patient getLast() {
		if (this.nextPatient == null) {
			return this;
		} else {
			return this.nextPatient.getLast();
		}
	}
	
	public void printBackward() {
		System.out.println(this.name);
		if (this.prevPatient != null) {
			this.prevPatient.printBackward();
		}
	}

	public void printBackwardEfficiently() {
		if (this.nextPatient != null) {
			this.nextPatient.printBackwardEfficiently();
		}
		System.out.println(this.name);
	}	
	
	public void printForward() {
		System.out.println(this.name);
		if (this.nextPatient != null) {
			this.nextPatient.printForward();
		}
	}
}