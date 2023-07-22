package person;

public enum Gender {
    MALE("Férfi", "Male"),
    FEMALE("Nő","Female");
    private final String magyarNev;
    private final String angolNev;

    Gender(String magyarNev, String angolNev) {
        this.magyarNev = magyarNev;
        this.angolNev = angolNev;
    }
}
