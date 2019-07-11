package practice10;

public class Student extends  Person{
    private  Klass klass;
    final String info = " I am a Student. ";

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
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
        if(klass.getLeader() !=null && klass.getLeader().getId() == super.getId()){
            return super.introduce()+this.info+"I am Leader of Class "+this.klass.getNumber()+".";
        }
        return super.introduce()+this.info+"I am at Class "+this.klass.getNumber()+".";
    }
}

