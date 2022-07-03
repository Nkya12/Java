//PARENT CLASS
class Manager {
    String name;
    
    Manager(String name){
        this.name = name;
    }
    
    void sayHello(String name){
        System.out.println("Hallo " + name + " my name is manager " + this.name);
    }
}
