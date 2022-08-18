package com.kelly.springbootsecurity.rowmapper;

import com.kelly.springbootsecurity.model.NewBook;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewBookRowMapper implements RowMapper<NewBook> {

    @Override
    public NewBook mapRow(ResultSet rs, int rowNum) throws SQLException {
        NewBook newbook = new NewBook();
        newbook.setTitle(rs.getString("Title"));
        newbook.setAuthor(rs.getString("Author"));
        newbook.setCall_Number(rs.getString("Call_Number"));
        newbook.setBarcode(rs.getString("Barcode"));
        newbook.setExh_fr(rs.getDate("Exh_fr"));
        newbook.setExh_end(rs.getDate("Exh_end"));
        newbook.setId(rs.getInt("book_id"));
        newbook.setRevise_date(rs.getDate("revise_date"));
        newbook.setAct_yn(rs.getString("act_yn"));

        return newbook;
    }
}
