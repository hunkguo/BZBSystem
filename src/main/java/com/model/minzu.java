package com.model;

import java.io.Serializable;

public class minzu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column minzu.minzu_code
     *
     * @mbggenerated
     */
    private String minzuCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column minzu.minzu_name
     *
     * @mbggenerated
     */
    private String minzuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table minzu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column minzu.minzu_code
     *
     * @return the value of minzu.minzu_code
     *
     * @mbggenerated
     */
    public String getMinzuCode() {
        return minzuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column minzu.minzu_code
     *
     * @param minzuCode the value for minzu.minzu_code
     *
     * @mbggenerated
     */
    public void setMinzuCode(String minzuCode) {
        this.minzuCode = minzuCode == null ? null : minzuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column minzu.minzu_name
     *
     * @return the value of minzu.minzu_name
     *
     * @mbggenerated
     */
    public String getMinzuName() {
        return minzuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column minzu.minzu_name
     *
     * @param minzuName the value for minzu.minzu_name
     *
     * @mbggenerated
     */
    public void setMinzuName(String minzuName) {
        this.minzuName = minzuName == null ? null : minzuName.trim();
    }
}