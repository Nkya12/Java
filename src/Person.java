//Membuat CLASS
class Person{
    //MEMBUAT FIELD
    String name;
    String address;
    final String country = "Indonesia";

    //MEMBUAT CONTRUCTOR
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //CONSTRUCTOR OVERLOADING
    Person(String paramName){
        this(paramName, null);
    }
    Person(){
        this(null);
    }

    //MEMBUAT METHOD
    void sayHello(String name){
        System.out.println("Hallo " + name + " my name is " + this.name);
    }
}