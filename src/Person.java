//Membuat CLASS
class Person{
    //MEMBUAT FIELD
    String name;
    String address;
    final String country = "Indonesia";

    //MEMBUAT CONTRUCTOR
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    //CONSTRUCTOR OVERLOADING
    Person(String paramName){
        this(paramName, null);
    }
    Person(){
        this(null);
    }

    //MEMBUAT METHOD
    void sayHello(String paramName){
        System.out.println("Hallo " + paramName + " my name is " + name);
    }
}