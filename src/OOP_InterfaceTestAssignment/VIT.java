package OOP_InterfaceTestAssignment;

public class VIT extends Education implements USEducation, IndianEducation, UKEducation{

	@Override
	public void masterCourses() {
		System.out.println("VIT -- masterCourses");
	}

	@Override
	public void higherCourses() {
		System.out.println("VIT -- higherCourses");
	}

	@Override
	public void vocationalCourses() {
		System.out.println("VIT -- vocationalCourses");
	}

	@Override
	public void languageCourses() {
		System.out.println("VIT -- languageCourses");
	}

	@Override
	public void craftCourses() {
		System.out.println("VIT -- craftCourses");
	}

	@Override
	public void proffesionalCourses() {
		System.out.println("VIT -- proffesionalCourses");
	}

	@Override
	public void sportsCourses() {
		System.out.println("VIT -- sportsCourses");
	}

	@Override
	public void actingCourses() {
		System.out.println("VIT -- actingCourses");
	}
	
	public void autoCADCourses() {
		System.out.println("VIT -- autoCADCourses");
	}
	
	public void aiCourses() {
		System.out.println("VIT -- aiCourses");
	}

	@Override
	public void building() {
		System.out.println("VIT -- building");
	}

	@Override
	public void staff() {
		System.out.println("VIT -- Staff");
	}

}
