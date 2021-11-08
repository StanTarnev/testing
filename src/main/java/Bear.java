public class Bear {
    private char gender;
    private int age;
    private double weight;
    private String name;

    public Bear(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate() {
        if (this.weight >= 80.00) {
            return true;
        }
        return false;
    }

    public char getGender() {
        return this.gender;
    }
}
