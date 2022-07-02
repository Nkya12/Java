public class PersonApp {
    public static void main(String[] args) {
        //MEMBUAT OBJECT
        Person person1 = new Person("Nayandra","kepulauan riau");
        Person person2 = new Person("otong","Makasar");
        Person person3;
        person3 = new Person("ucup","bandung");

        //MANIPULASI FIELD
        person1.name = "Nayandra";
        person1.address = "kepulauan riau";
        person2.name = "otong";
        person2.address = "Makasar";
        person3.name = "ucup";
        person3.address = "bandung";
        //person1.country = "usa";   Akan ERROR karena "final variable"

        //MENGAKSES METHOD
        person1.sayHello("miyuki");
        person2.sayHello("dono");
        person3.sayHello("yono");

        
    }
}
