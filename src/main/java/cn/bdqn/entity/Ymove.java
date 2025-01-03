package cn.bdqn.entity;

import java.util.Date;

public class Ymove {
    private int id;
    private String YmoveName;
    private int price;
    private Date premiereDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYmoveName() {
        return YmoveName;
    }

    public void setYmoveName(String ymoveName) {
        YmoveName = ymoveName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }
}
