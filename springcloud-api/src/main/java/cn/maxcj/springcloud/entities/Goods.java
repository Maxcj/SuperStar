package cn.maxcj.springcloud.entities;



public class Goods {
    private Integer gid;
    private String gname;
    private String gcontent;
    private Integer gtype;
    private Integer gnum;
    private Float gmoney;
    private Integer uid;
    private String dbsource;

    public String getDbsource() {
        return dbsource;
    }

    public void setDbsource(String dbsource) {
        this.dbsource = dbsource;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGcontent() {
        return gcontent;
    }

    public void setGcontent(String gcontent) {
        this.gcontent = gcontent;
    }

    public Integer getGtype() {
        return gtype;
    }

    public void setGtype(Integer gtype) {
        this.gtype = gtype;
    }

    public Integer getGnum() {
        return gnum;
    }

    public void setGnum(Integer gnum) {
        this.gnum = gnum;
    }

    public Float getGmoney() {
        return gmoney;
    }

    public void setGmoney(Float gmoney) {
        this.gmoney = gmoney;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Goods() {
        super();
    }


    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gcontent='" + gcontent + '\'' +
                ", gtype=" + gtype +
                ", gnum=" + gnum +
                ", gmoney=" + gmoney +
                ", uid=" + uid +
                ", dbsource='" + dbsource + '\'' +
                '}';
    }

    public Goods(Integer gid, String gname, String gcontent, Integer gtype, Integer gnum, Float gmoney, Integer uid, String dbsource) {
        this.gid = gid;
        this.gname = gname;
        this.gcontent = gcontent;
        this.gtype = gtype;
        this.gnum = gnum;
        this.gmoney = gmoney;
        this.uid = uid;
        this.dbsource = dbsource;
    }
}
