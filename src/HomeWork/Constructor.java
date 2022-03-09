package HomeWork;

public class Constructor {
    public static void main(String[] args) {
        Humann humann1 = new Humann();

    }
}
class Humann {
    public Humann() {
        System.out.println("Првиет из первого конструктора");
    }
    private String name;
    private int age;
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}

    public void getUserInfo() {
    }


    class Human{
        String name;
        int age;

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void getUserInfo(){
            System.out.println(name+", "+age);
        }
    }
}

