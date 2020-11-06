package data;


import java.io.Serializable;

public class Position implements Comparable<Position>, Serializable {

    private int line;
    private int column;

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (line != position.line) return false;
        return column == position.column;

    }

    @Override
    public int hashCode() {
        int result = line;
        result = 31 * result + column;
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public int compareTo(Position o) {
        int compare = 0;
        compare =  this.line - o.line;
        if (compare == 0){
            compare = this.column - o.column;
        }
        return compare;
    }
}

