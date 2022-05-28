package model.vo;

import java.sql.Date;

public class Heritage {

    private int regency_sn;
    private int regency_no;
    private int regency_design_no;
    private String regency_trans_no;
    private String regency_name_kor;
    private String regency_name_chi;
    private String regency_category_name;
    private String regency_area;
    private String regency_area_no;
    private String regency_admin;
    private String regency_address;
    private String regency_type;
    private String regency_type2;
    private String regency_type3;
    private String regency_type4;
    private String regency_quantity;
    private String regency_era;
    private String regency_owner;
    private String regency_content;
    private java.sql.Date regency_enrolldate;
    private String regency_longitude;
    private String regency_latitude;

    public Heritage(){}

    public Heritage(int regency_no, int regency_design_no, String regency_area_no) {
        this.regency_no = regency_no;
        this.regency_design_no = regency_design_no;
        this.regency_area_no = regency_area_no;
    }

    public Heritage(int regency_sn, int regency_no, int regency_design_no, String regency_trans_no, String regency_name_kor,
                    String regency_name_chi, String regency_category_name, String regency_area, String regency_area_no,
                    String regency_admin) {
        this.regency_sn = regency_sn;
        this.regency_no = regency_no;
        this.regency_design_no = regency_design_no;
        this.regency_trans_no = regency_trans_no;
        this.regency_name_kor = regency_name_kor;
        this.regency_name_chi = regency_name_chi;
        this.regency_category_name = regency_category_name;
        this.regency_area = regency_area;
        this.regency_area_no = regency_area_no;
        this.regency_admin = regency_admin;
    }

    public Heritage(String regency_address, String regency_type, String regency_type2, String regency_type3, String regency_type4,
                    String regency_quantity, String regency_era, String regency_owner, String regency_content,
                    Date regency_enrolldate, String regency_longitude, String regency_latitude) {
        this.regency_address = regency_address;
        this.regency_type = regency_type;
        this.regency_type2 = regency_type2;
        this.regency_type3 = regency_type3;
        this.regency_type4 = regency_type4;
        this.regency_quantity = regency_quantity;
        this.regency_era = regency_era;
        this.regency_owner = regency_owner;
        this.regency_content = regency_content;
        this.regency_enrolldate = regency_enrolldate;
        this.regency_longitude = regency_longitude;
        this.regency_latitude = regency_latitude;
    }

    public Heritage(int regency_sn, int regency_no, int regency_design_no, String regency_trans_no, String regency_name_kor,
                    String regency_name_chi, String regency_category_name, String regency_area, String regency_area_no,
                    String regency_admin, String regency_address, String regency_type, String regency_type2,
                    String regency_type3, String regency_type4, String regency_quantity, String regency_era, String regency_owner,
                    String regency_content, Date regency_enrolldate, String regency_longitude, String regency_latitude) {
        this.regency_sn = regency_sn;
        this.regency_no = regency_no;
        this.regency_design_no = regency_design_no;
        this.regency_trans_no = regency_trans_no;
        this.regency_name_kor = regency_name_kor;
        this.regency_name_chi = regency_name_chi;
        this.regency_category_name = regency_category_name;
        this.regency_area = regency_area;
        this.regency_area_no = regency_area_no;
        this.regency_admin = regency_admin;
        this.regency_address = regency_address;
        this.regency_type = regency_type;
        this.regency_type2 = regency_type2;
        this.regency_type3 = regency_type3;
        this.regency_type4 = regency_type4;
        this.regency_quantity = regency_quantity;
        this.regency_era = regency_era;
        this.regency_owner = regency_owner;
        this.regency_content = regency_content;
        this.regency_enrolldate = regency_enrolldate;
        this.regency_longitude = regency_longitude;
        this.regency_latitude = regency_latitude;
    }

    public int getRegency_sn() {
        return regency_sn;
    }

    public void setRegency_sn(int regency_sn) {
        this.regency_sn = regency_sn;
    }

    public int getRegency_no() {
        return regency_no;
    }

    public void setRegency_no(int regency_no) {
        this.regency_no = regency_no;
    }

    public int getRegency_design_no() {
        return regency_design_no;
    }

    public void setRegency_design_no(int regency_design_no) {
        this.regency_design_no = regency_design_no;
    }

    public String getRegency_trans_no() {
        return regency_trans_no;
    }

    public void setRegency_trans_no(String regency_trans_no) {
        this.regency_trans_no = regency_trans_no;
    }

    public String getRegency_name_kor() {
        return regency_name_kor;
    }

    public void setRegency_name_kor(String regency_name_kor) {
        this.regency_name_kor = regency_name_kor;
    }

    public String getRegency_name_chi() {
        return regency_name_chi;
    }

    public void setRegency_name_chi(String regency_name_chi) {
        this.regency_name_chi = regency_name_chi;
    }

    public String getRegency_category_name() {
        return regency_category_name;
    }

    public void setRegency_category_name(String regency_category_name) {
        this.regency_category_name = regency_category_name;
    }

    public String getRegency_area() {
        return regency_area;
    }

    public void setRegency_area(String regency_area) {
        this.regency_area = regency_area;
    }

    public String getRegency_area_no() {
        return regency_area_no;
    }

    public void setRegency_area_no(String regency_area_no) {
        this.regency_area_no = regency_area_no;
    }

    public String getRegency_admin() {
        return regency_admin;
    }

    public void setRegency_admin(String regency_admin) {
        this.regency_admin = regency_admin;
    }

    public String getRegency_address() {
        return regency_address;
    }

    public void setRegency_address(String regency_address) {
        this.regency_address = regency_address;
    }

    public String getRegency_type() {
        return regency_type;
    }

    public void setRegency_type(String regency_type) {
        this.regency_type = regency_type;
    }

    public String getRegency_type2() {
        return regency_type2;
    }

    public void setRegency_type2(String regency_type2) {
        this.regency_type2 = regency_type2;
    }

    public String getRegency_type3() {
        return regency_type3;
    }

    public void setRegency_type3(String regency_type3) {
        this.regency_type3 = regency_type3;
    }

    public String getRegency_type4() {
        return regency_type4;
    }

    public void setRegency_type4(String regency_type4) {
        this.regency_type4 = regency_type4;
    }

    public String getRegency_quantity() {
        return regency_quantity;
    }

    public void setRegency_quantity(String regency_quantity) {
        this.regency_quantity = regency_quantity;
    }

    public String getRegency_era() {
        return regency_era;
    }

    public void setRegency_era(String regency_era) {
        this.regency_era = regency_era;
    }

    public String getRegency_owner() {
        return regency_owner;
    }

    public void setRegency_owner(String regency_owner) {
        this.regency_owner = regency_owner;
    }

    public String getRegency_content() {
        return regency_content;
    }

    public void setRegency_content(String regency_content) {
        this.regency_content = regency_content;
    }

    public Date getRegency_enrolldate() {
        return regency_enrolldate;
    }

    public void setRegency_enrolldate(Date regency_enrolldate) {
        this.regency_enrolldate = regency_enrolldate;
    }

    public String getRegency_longitude() {
        return regency_longitude;
    }

    public void setRegency_longitude(String regency_longitude) {
        this.regency_longitude = regency_longitude;
    }

    public String getRegency_latitude() {
        return regency_latitude;
    }

    public void setRegency_latitude(String regency_latitude) {
        this.regency_latitude = regency_latitude;
    }

    @Override
    public String toString() {
        return "Heritage{" +
                "regency_sn=" + regency_sn +
                ", regency_no=" + regency_no +
                ", regency_design_no=" + regency_design_no +
                ", regency_trans_no=" + regency_trans_no +
                ", regency_name_kor='" + regency_name_kor + '\'' +
                ", regency_name_chi='" + regency_name_chi + '\'' +
                ", regency_category_name='" + regency_category_name + '\'' +
                ", regency_area='" + regency_area + '\'' +
                ", regency_area_no='" + regency_area_no + '\'' +
                ", regency_admin='" + regency_admin + '\'' +
                ", regency_address='" + regency_address + '\'' +
                ", regency_type='" + regency_type + '\'' +
                ", regency_type2='" + regency_type2 + '\'' +
                ", regency_type3='" + regency_type3 + '\'' +
                ", regency_type4='" + regency_type4 + '\'' +
                ", regency_quantity='" + regency_quantity + '\'' +
                ", regency_era='" + regency_era + '\'' +
                ", regency_owner='" + regency_owner + '\'' +
                ", regency_content='" + regency_content + '\'' +
                ", regency_enrolldate=" + regency_enrolldate +
                ", regency_longitude='" + regency_longitude + '\'' +
                ", regency_latitude='" + regency_latitude + '\'' +
                '}';
    }
}
