package OOP_InterfaceTestAssignment;

public class IIT extends Education implements USEducation, IndianEducation, UKEducation{

	@Override
	public void vocationalCourses() {
		System.out.println("IIT -- vocationalCourses");
	}

	@Override
	public void languageCourses() {
		System.out.println("IIT -- languageCourses");
	}

	@Override
	public void craftCourses() {
		System.out.println("IIT -- craftCourses");
	}

	@Override
	public void proffesionalCourses() {
		System.out.println("IIT -- proffesionalCourses");
	}

	@Override
	public void sportsCourses() {
		System.out.println("IIT -- sportsCourses");
	}

	@Override	
	public void actingCourses() {
		System.out.println("IIT -- actingCourses");
	}

	@Override
	public void masterCourses() {
		System.out.println("IIT -- masterCourses");
	}

	@Override
	public void higherCourses() {
		System.out.println("IIT -- higherCourses");
	}

	@Override
	public void building() {
		System.out.println("IIT -- building");
	}

	@Override
	public void staff() {
		System.out.println("IIT -- Staff");
	}
	
	

}
