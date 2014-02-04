package T3;

public enum Gender {
    MALE, FEMALE;

    public Gender getGender(String gender) {
        System.out.println(gender);
        switch (gender) {
            case "Female": return FEMALE;
            case "Male": return MALE;
            default: return null; }
    }
}