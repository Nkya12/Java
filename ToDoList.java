public class ToDoList{
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        viewShowTodoList();
        
    }

    //Menampilkan To Do List
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no =i + 1;

            if (todo != null){
                System.out.println(no + " " + todo);
            }
    }
    }

    //Menambahkan todo ke list
    public static void addtodolist(String todo) {
        //cek apakah model penuh?
        var isFull = true;
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
                //Model masih ada yang kosong
                break; 
            }
        }
        //Jika penuh
        if(isFull){
            var temp = model;
            model = new String[model.length*2];

            for(int i = 0; i < temp.length; i++){
                model[i]=temp[i];
            }
        } 
        //Tambahkan ke posisi yang data arraynya null
        for(var i = 0; i< model.length; i++){
            if(model[i] == null){
                model[i]=todo;
                break;
            }
        }
    }
    //Menghapus todolist
    public static boolean deleteTodoList(Integer number) {
        if ((number -1) >= model.length){
            return false;
        }
        else if(model[number-1] == null){
            return false;
        }
        else{
            for(int i=(number-1);i < model.length;i++){
                if(i==(model.length-1)){
                    model[i]=null;
                }
                else{
                    model[i]=model[i+1];
                }
            }
            return true;
        }
    }
    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
      /**
   * Menampilkan view todo list
   */
  public static void viewShowTodoList() {
    while (true) {
      showTodoList();

      System.out.println("MENU : ");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var input = input("Pilih");

      if (input.equals("1")) {
        viewAddTodoList();
      } else if (input.equals("2")) {
        viewRemoveTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak dimengerti");
      }
    }
  }
  /**
   * Menampilkan view menambahkan todo list
   */
  public static void viewAddTodoList() {
    System.out.println("MENAMBAH TODOLIST");

    var todo = input("Todo (x Jika Batal)");

    if (todo.equals("x")) {
      // batal
    } else {
      addtodolist(todo);
    }
  }
  /**
   * Menampilkan view menghapus todo list
   */
  public static void viewRemoveTodoList() {
    System.out.println("MENGHAPUS TODOLIST");

    var number = input("Nomor yang Dihapus (x Jika Batal)");

    if (number.equals("x")) {
      // batal
    } else {
      boolean success = deleteTodoList(Integer.valueOf(number));
      if (!success) {
        System.out.println("Gagal menghapus todolist : " + number);
      }
    }
  }



}