public class Range  {
    private int start;
    private int end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getLength() {
        return end - start + 1;
    }

    public boolean isValid() {
        return start <= end;
    }

    public boolean isIntersecting(Range otherRange) {
        return start <= otherRange.end && otherRange.start <= end;
    }
}
