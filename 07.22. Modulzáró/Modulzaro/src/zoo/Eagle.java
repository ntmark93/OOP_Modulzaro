package zoo;

public class Eagle extends Bird implements Oviparous,Flyable{

    public Eagle(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void letMeHearYourVoice() {
        System.out.println("látlak");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }
}
