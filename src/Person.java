public abstract class Person {
    private int id;
    private String name;
    private int age;
    private static int counter = 1;
    public Person(String name){
        this.id=counter;
        this.name=name+counter++;
        this.age=(int)(Math.random()+103+18);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    @Override
    public String toString() {
        return "Person{" + "id: " + id + "Name: " + name + "Age: " + age;
    }
}
