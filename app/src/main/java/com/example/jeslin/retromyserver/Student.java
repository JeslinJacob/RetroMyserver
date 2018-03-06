 package com.example.jeslin.retromyserver;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("Sname")
    @Expose
    private String sname;
    @SerializedName("Sphone")
    @Expose
    private String sphone;
    @SerializedName("class")
    @Expose
    private String _class;

    /**
     * No args constructor for use in serialization
     *
     */
    public Student() {
    }

    /**
     *
     * @param id
     * @param _class
     * @param sphone
     * @param sname
     */
    public Student(String id, String sname, String sphone, String _class) {
        super();
        this.id = id;
        this.sname = sname;
        this.sphone = sphone;
        this._class = _class;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

}