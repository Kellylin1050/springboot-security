package com.kelly.springbootsecurity.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="new_book")
public class NewBook {
    private String title;
    private String author;
    private String call_Number;
    private String barcode;
    private Date exh_fr;
    private Date exh_end;
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date revise_date;
    private String act_yn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCall_Number() {
        return call_Number;
    }

    public void setCall_Number(String call_Number) {
        this.call_Number = call_Number;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getExh_fr() {
        return exh_fr;
    }

    public void setExh_fr(Date exh_fr) {
        this.exh_fr = exh_fr;
    }

    public Date getExh_end() {
        return exh_end;
    }

    public void setExh_end(Date exh_end) {
        this.exh_end = exh_end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRevise_date() {
        return revise_date;
    }

    public void setRevise_date(Date revise_date) {
        this.revise_date = revise_date;
    }

    public String getAct_yn() {
        return act_yn;
    }

    public void setAct_yn(String act_yn) {
        this.act_yn = act_yn;
    }
}
