import java.util.ArrayList;
import java.util.List;

public class Node
{
    private int row;
    private int column;
    private boolean visited;
    private int value;
    Node[][] nodeMatrix;
    private List<Node> neighbors=new ArrayList<>();

    public Node(int  row,int column,int value,Node[][] nodeMatrix){
        this.row=row;
        this.column=column;
        this.value =value;
        this.nodeMatrix=nodeMatrix;
    }


    public boolean isVisited(){
        return visited;
    }
    public void addNeighbor(Node neighbor){
        this.neighbors.add(neighbor);

    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public List<Node> getNeighbors()
    {
        int matRows=nodeMatrix.length;
        int  matColumns=nodeMatrix[0].length;
        if ((this.row-1)>=0)
        {
            if (nodeMatrix[row-1][column].getValue()!=1)
            neighbors.add(nodeMatrix[row-1][column]);
        }
        if ((this.row+1)<matRows)
        {
            if (nodeMatrix[row+1][column].getValue()!=1)
            neighbors.add(nodeMatrix[row+1][column]);
        }
        if ((this.column+1)<matColumns)
        {
            if (nodeMatrix[row][column+1].getValue()!=1)
            neighbors.add(nodeMatrix[row][column+1]);
        }
        if ((this.column-1)>=0)
        {
            if (nodeMatrix[row][column-1].getValue()!=1)
            neighbors.add(nodeMatrix[row][column-1]);
        }
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }

}