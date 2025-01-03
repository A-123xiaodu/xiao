package cn.bdqn.entity;

import java.util.Date;
import java.util.List;

public class Smove {
    private int id;
    private String SmoveName;
    private Integer price;
    private Date premiereDate;
    private Integer screening;
    private List<screening> screeningList;

    public List<cn.bdqn.entity.screening> getScreeningList() {
        return screeningList;
    }

    public void setScreeningList(List<cn.bdqn.entity.screening> screeningList) {
        this.screeningList = screeningList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSmoveName() {
        return SmoveName;
    }

    public void setSmoveName(String smoveName) {
        SmoveName = smoveName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public Integer getScreening() {
        return screening;
    }

    public void setScreening(Integer screening) {
        this.screening = screening;
    }
}
