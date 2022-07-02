//Membuat CLASS
class Person{
    //MEMBUAT FIELD
    String name;
    String address;
    final String country = "Indonesia";

    //MEMBUAT CONTRUCTOR

    //MEMBUAT METHOD
    void sayHello(String paramName){
        System.out.println("Hallo " + paramName + " my name is " + name);
    }
}