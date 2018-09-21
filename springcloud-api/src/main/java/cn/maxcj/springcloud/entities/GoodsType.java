package cn.maxcj.springcloud.entities;

public class GoodsType {
    private Integer tid;
    private String tname;


    public GoodsType() {
        super();
    }

    public GoodsType(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
