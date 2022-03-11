package cn.penstaro.java.design.builder;

/**
 * @author: Penstaro
 * @date: 2022/3/10
 * @Description:
 **/
public class Person {
    private String name;
    private int age;
    private Location loc;
    private Person(){
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loc=" + loc +
                '}';
    }

    public static class PersonBuilder{
        Person p = new Person();
        public PersonBuilder constructorName(String name){
            p.name = name;
            return this;
        }
        public PersonBuilder constructorAge(int age){
            p.age = age;
            return this;
        }
        public PersonBuilder constructorLocation(int cityId, int strId){
            p.loc = new Location(cityId,strId);
            return this;
        }
        public Person build(){
            return p;
        }
    }

    public static void main(String[] args) {
        Person p = new PersonBuilder().constructorName("Tom").constructorAge(3).constructorLocation(500108, 401336).build();
        System.out.println(p);
    }
}

class Location{
    private int cityId;
    private int strId;

    public Location(int cityId, int strId) {
        this.cityId = cityId;
        this.strId = strId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "cityId=" + cityId +
                ", strId=" + strId +
                '}';
    }
}
