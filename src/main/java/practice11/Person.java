package practice11;

public class Person {
    private int id;
    private String  name;
    private int age;

    public Person(){}

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            return ((Person)obj).getId() ==this.id;
        }
        return super.equals(obj);
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

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }


}