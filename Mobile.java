package day10;

public class Mobile {
    private long mobileno;

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "[mobileno=" + mobileno + "]";
    }
}
