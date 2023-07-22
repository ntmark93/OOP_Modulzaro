package zoo;

public class Bird extends Animal{
    public Bird(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void letMeHearYourVoice() {
        System.out.println("csirip".repeat(2));
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
