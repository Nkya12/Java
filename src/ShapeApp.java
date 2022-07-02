public class ShapeApp {
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        shape.getCorner();

        Rectangle rectangle = new Rectangle();
        rectangle.getCorner();
        rectangle.getParentCorner();    //Mengakses method dari parent class
    }
    
}
