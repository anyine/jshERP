package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.Date;

public class DepotItemVo4DetailByTypeAndMId {

    private String number;

    private String newtype;

    private BigDecimal bnum;

    private Date otime;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNewtype() {
        return newtype;
    }

    public void setNewtype(String newtype) {
        this.newtype = newtype;
    }

    public BigDecimal getBnum() {
        return bnum;
    }

    public void setBnum(BigDecimal bnum) {
        this.bnum = bnum;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }
}