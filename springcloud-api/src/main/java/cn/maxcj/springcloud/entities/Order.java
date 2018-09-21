package cn.maxcj.springcloud.entities;

public class Order {
    private Integer oid;
    private Integer uid;
    private Integer gid;
    private Integer gnum;
    private  Float summoney;

    public Order() {
        super();
    }

    public Order(Integer oid, Integer uid, Integer gid, Integer gnum, Float summoney) {
        this.oid = oid;
        this.uid = uid;
        this.gid = gid;
        this.gnum = gnum;
        this.summoney = summoney;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", gid=" + gid +
                ", gnum=" + gnum +
                ", summoney=" + summoney +
                '}';
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getGnum() {
        return gnum;
    }

    public void setGnum(Integer gnum) {
        this.gnum = gnum;
    }

    public Float getSummoney() {
        return summoney;
    }

    public void setSummoney(Float summoney) {
        this.summoney = summoney;
    }
}
