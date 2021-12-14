package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.optServices();
		fh.medicalTraining();
		USMedical.billing();
		fh.medInsurance();
		fh.covidTest();
		fh.covidGuidelines();
		fh.medicalInfo();
		
		System.out.println();
		System.out.println("1");
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.oncologyServices();
		us.emergencyServices();
		us.medInsurance();
		
		System.out.println();
		System.out.println("2");
		
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.entServices();
		uk.pediaServices();
		
	

	}

}
