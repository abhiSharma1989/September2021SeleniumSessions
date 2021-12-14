package OOP_InterfaceTestAssignment;

public class NIT extends Education implements USEducation, IndianEducation, UKEducation{

	@Override
	public void vocationalCourses() {
		System.out.println("NIT -- vocationalCourses");
	}

	@Override
	public void languageCourses() {
		System.out.println("NIT -- languageCourses");
	}

	@Override
	public void craftCourses() {
		System.out.println("NIT -- craftCourses");
	}

	@Override
	public void proffesionalCourses() {
		System.out.println("NIT -- proffesionalCourses");
	}

	@Override
	public void sportsCourses() {
		System.out.println("NIT -- sportsCourses");
	}

	@Override
	public void actingCourses() {
		System.out.println("NIT -- actingCourses");
	}

	@Override
	public void masterCourses() {
		System.out.println("NIT -- masterCourses");
	}

	@Override
	public void higherCourses() {
		System.out.println("NIT -- higherCourses");
	}

	@Override
	public void building() {
		System.out.println("NIT -- building");
	}

	@Override
	public void staff() {
		System.out.println("NIT -- Staff");
	}

}
