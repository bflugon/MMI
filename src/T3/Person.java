package T3;

import T3.Gender;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {
	
	public final static String NAME_PROPERTY = "Ole";
	public final static String DATE_PROPERTY = "29.08.2012";
	public final static String EMAIL_PROPERTY = "Ole@dole.doffen";
	public final static String HEIGHT_PROPERTY = "150";
	public final static String GENDER_PROPERTY = "Male";
	
	private String name;
	private String dateOfBirth;
	private Gender gender;
	private String email;
	private double height;
	
	private PropertyChangeSupport pcs;
	
	
	public Person(){
		pcs = new PropertyChangeSupport(this);
	}
	
	public Person(String name, String dateOfBirth, Gender gender, String email, double height) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.height = height;
		
		pcs = new PropertyChangeSupport(this);
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	
	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		pcs.firePropertyChange(NAME_PROPERTY, oldValue, name);
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		String oldValue = this.dateOfBirth;
		this.dateOfBirth = dateOfBirth;
		pcs.firePropertyChange(DATE_PROPERTY, oldValue, dateOfBirth);
	}
	
	public void setGender(Gender gender) {
		Gender oldValue = this.gender;
		this.gender = gender;
		pcs.firePropertyChange(GENDER_PROPERTY, oldValue, gender);
	}
	
	public void setEmail(String email) {
		String oldValue = this.email;
		this.email = email;
		pcs.firePropertyChange(EMAIL_PROPERTY, oldValue, email);
	}
	
	public void setHeight(double height) {
		double oldValue = this.height;
		this.height = height;
		pcs.firePropertyChange(HEIGHT_PROPERTY, oldValue, height);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener){
		pcs.addPropertyChangeListener(listener);
		
		System.out.println(pcs.getPropertyChangeListeners());
	}
	
	
}
