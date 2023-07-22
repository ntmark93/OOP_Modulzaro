package zoo;

public class Cat extends Mammal implements Viviparous{

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void letMeHearYourVoice() {
        System.out.println("miauu");
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
