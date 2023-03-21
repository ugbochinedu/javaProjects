package Turtle;

public class Position {
    private int column;
    private int row;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Position{" +
                "column=" + column +
                ", row=" + row +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
//         if(!(obj instanceof Position o)) return false;
//         if (!(obj.getClass() == Position.class)) return false;
        if(obj.getClass() != Position.class) return false;
        Position o = (Position) obj;
        return row == o.row && column == o.column;
    }
}
