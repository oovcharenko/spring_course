package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person() {
        System.out.println("Person bean is created");
//        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }
}
