class Shape {
    int getCorner(){
        return 0;
    }
    
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    //Mengakses fungsi yang ada di parent classnya
    int getParentCorner(){
        return super.getCorner();
    }
}
