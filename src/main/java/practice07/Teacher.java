package practice07;

public class Teacher extends Person{
    private Klass klass;
    final String info=" I am a Teacher. ";

    public Teacher(){}
    public Teacher(Klass klass) {
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    @Override
    public String introduce() {
        if(this.klass != null){
            return super.introduce()+this.info+"I teach Class "+this.klass.getNumber()+".";
        }
        return super.introduce()+this.info+"I teach No Class.";
    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber() ==this.klass.getNumber()){
            return super.introduce()+this.info+"I teach "+student.getName()+".";
        }
        return super.introduce()+this.info+"I don't teach "+student.getName()+".";
    }
}
