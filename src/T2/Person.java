package T2;


public class Person {
    private String name;
    private String dateOfBirth;
    private String email;
    private float height;
    private Gender gender;

    public enum Gender {
        Male, Female
    }


    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public float getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
