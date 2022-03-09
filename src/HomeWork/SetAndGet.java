package HomeWork;

public class SetAndGet {
    public static void main(String[] args) {
        Humann humann1 = new Humann();
        humann1.setAge(18);
        humann1.setName("Bob");
        humann1.getUserInfo();
        Humann humann2 = new Humann();
        humann2.setAge(29);
        humann2.setName("Ted");
        humann2.getUserInfo();
    }

    class Human {
        String name;
        int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void getUserInfo() {
            System.out.println(name + ", " + age);
        }
    }
}