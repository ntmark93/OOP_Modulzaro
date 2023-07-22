package zoo;

public class Snake extends Reptile implements Oviparous{

    public Snake(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void letMeHearYourVoice() {
        System.out.println("almát?");
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
