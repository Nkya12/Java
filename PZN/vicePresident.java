//CHILD CLASS
class vicePresident extends Manager{

    vicePresident(){
        super(null); //Super constructor
    }

    //Method overriding
    void sayHello(String name){
        System.out.println("hallo " + name + " my name is vice president " + this.name);
    }
}