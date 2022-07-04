public class Cell {

    final int col, row;
    Celltype celltype;

    Cell(int row, int col){
        this.col = col;
        this.row = row;
    }

    public Celltype getCelltype(){
        return celltype;
    }

    public void setCellType(Celltype celltype){
        this.celltype = celltype;
    }
    
    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    
}
