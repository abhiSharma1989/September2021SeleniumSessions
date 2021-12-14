package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");	
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");	
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");	
	}

	@Override
	public void entServices() {
		System.out.println("FH -- entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
	}
	
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}
	
	public void optServices() {
		System.out.println("FH -- optServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}
	
	@Override
	public void medInsurance() {
		System.out.println("Fortis Medical Insurance");
	}

	@Override
	public void covidTest() {
		System.out.println("FH -- CovidTest");
	}

}
