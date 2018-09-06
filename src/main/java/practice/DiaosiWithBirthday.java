package practice;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DiaosiWithBirthday {
    /*
    这个注解是gson提供的，在把对象转化为json数据时name属性会变成大写
    @SerializedName("NAME");*/
    private String name;
    private String school;
    private boolean his_girlfriend;
    private double age;
    private Object car;
    private Object house;
    private List<String> mojor;
    //private Set<String> mojor;
    private String comment;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getMojor() {
        return mojor;
    }
   /* public Set<String> getMojor() {
        return mojor;
    }*/
    public void setMojor(List<String> mojor) {
        this.mojor = mojor;
    }
   /* public void setMojor(Set<String> mojor) {
        this.mojor = mojor;
    }*/
    /*
    这个可以在生成json数据时忽略掉这个属性
    private transient String ignore;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isHis_girlfriend() {
        return his_girlfriend;
    }

    public void setHis_girlfriend(boolean his_girlfriend) {
        this.his_girlfriend = his_girlfriend;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        return "DiaosiWithBirthday{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", his_girlfriend=" + his_girlfriend +
                ", age=" + age +
                ", car=" + car +
                ", house=" + house +
                ", mojor=" + mojor +
                ", comment='" + comment + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
