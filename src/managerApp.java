class managerApp {
    public static void main(String[] args) {
        
        //Membuat object dari parent class
        Manager manager = new Manager();
        manager.name = "ucup";
        manager.sayHello("otong");

        //Membuat object dari child class
        vicePresident vp = new vicePresident();
        vp.name = "Nayandra";
        vp.sayHello("odin");
    }    
}
