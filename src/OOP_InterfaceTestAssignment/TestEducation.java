package OOP_InterfaceTestAssignment;

public class TestEducation {

	public static void main(String[] args) {
		VIT v = new VIT();
		v.vocationalCourses();
		v.actingCourses();
		v.aiCourses();
		v.autoCADCourses();
		v.craftCourses();
		v.sportsCourses();
		v.languageCourses();
		v.masterCourses();
		v.building();
		v.staff();
		v.fees();
		
		IndianEducation ie = new VIT();
		ie.vocationalCourses();
		ie.languageCourses();
		ie.craftCourses();
		ie.building();
		ie.staff();
		
//		VIT v1 = new IndianEducation(); You cannot create an object of Interface
		
		
	}

}
