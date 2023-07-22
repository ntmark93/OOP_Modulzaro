package zoo;

public class Turtle extends Reptile implements Oviparous{

    public Turtle(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void letMeHearYourVoice() {
        System.out.println("mindjárt ottvagyok");
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
