package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private final Gender gender;
    private String hobbies;
    private Person friend;
    public List<Person> friends = new ArrayList<>();

    private static int countCreatedPersons = 0;

    public Person(String name, Integer age, Gender gender, String hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        countCreatedPersons++;
    }

    public static int getCountCreatedPersons() {
        return countCreatedPersons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void addFriends(Person friend) {
        this.friend = friend;
        friends.add(friend);
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public void friendChain() {
        if (friend != null) {
            System.out.println(this.name + "  barátja: " + friend.name);
            friend.friendChain();
        } else {
            System.out.println(this.name + ": nincsenek barátai");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies='" + hobbies + '\'' +
                ", friends=" + friends +
                '}';
    }
}
