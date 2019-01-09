package main.com.zc;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


import main.com.zc.services.domain.courses.CourseAppServiceImpl;
import main.com.zc.services.domain.courses.course;



@ManagedBean(name = "mainHomeBean")
@ApplicationScoped
public class MainHomeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String homeSiteName;
	
	 @ManagedProperty("#{CourseFacadeImpl}")
	 private CourseAppServiceImpl courseFasade; 
	 private List<course> courses;
	
	 
	@PostConstruct
	public void init() {
		refreshPage();
	}
	
	public void refreshPage(){
		
		homeSiteName="Zewail Courses";
		courses=courseFasade.getAll();
	}
	
	public String getHomeSiteName() {
		return homeSiteName;
	}
	public void setHomeSiteName(String homeSiteName) {
		this.homeSiteName = homeSiteName;
	}


	public CourseAppServiceImpl getCourseFasade() {
		return courseFasade;
	}


	public void setCourseFasade(CourseAppServiceImpl courseFasade) {
		this.courseFasade = courseFasade;
	}


	public List<course> getCourses() {
		return courses;
	}


	public void setCourses(List<course> courses) {
		this.courses = courses;
	}

	

	
	
}
