public class UserGetSet {

    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        System.out.println(this.name=name);
        this.name = name; //  como já fiz um this dentro do sout, este se torna "infuncional"
    }

    public void setAge(int age){
        System.out.println(this.age = age);

    }

    public int getAge(){
        return age;
    }

}
