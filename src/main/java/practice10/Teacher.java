package practice10;

import java.util.List;

public class Teacher extends Person{
    private List<Klass> classes;
    final String info=" I am a Teacher. ";

    public Teacher(){}
    public Teacher(List<Klass> classes) {
        this.classes = classes;
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }
    public Teacher(int id,String name, int age, List<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }
    @Override
    public String introduce() {
        if(this.classes!=null&&this.classes.size()!=0){
            String classesString="";
            for(int i=0;i<classes.size();i++){
                classesString +=classes.get(i).getNumber();
                if(i != classes.size()-1){
                    classesString +=", ";
                }
            }
            return super.introduce()+this.info+"I teach Class "+classesString+".";
        }
        return super.introduce()+this.info+"I teach No Class.";
    }
    public boolean isTeaching(Student student){
        boolean result = false;
        if(student.getKlass()!=null){
            for(Klass klass:classes) {
                if (klass.isIn(student)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce()+this.info+"I teach "+student.getName()+".";
        }
        return super.introduce()+this.info+"I don't teach "+student.getName()+".";
    }
}