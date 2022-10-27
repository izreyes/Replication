
public class SSN {

    private int area;
    private int group;
    private int seq;

    public SSN() {
        setArea(1);
        setGroup(1);
        setSeq(1);

    }

    public SSN(int area, int group, int seq) {
        setArea(area);
        setGroup(group);
        setSeq(seq);

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "{" + "area=" + getArea() + " , group=" + getGroup() + " ,seq=" + getSeq() + "}";
    }

}
