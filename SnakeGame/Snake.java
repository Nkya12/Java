import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> snakePartList = new LinkedList<>();
    private Cell head;

    public Snake(Cell initPos){
        head = initPos;
        snakePartList.add(head);
        head.setCellType(Celltype.SNAKE_NODE);
    }

    
    
}
