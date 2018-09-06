package practice;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//利用gson生成json数据
public class App2 {
    public static void main(String[] args) throws IOException {

        Diaosi a3=new Diaosi();
        a3.setName("王小二");
        a3.setAge(25);
        a3.setBirthday("1991-01-10");
        a3.setSchool("蓝翔");
        a3.setMojor(new String[]{"理发","挖掘机"});
        a3.setHis_girlfriend(false);
        a3.setCar(null);
        a3.setHouse(null);
        a3.setComment("这是一个注释");
        /*a3.setIgnore("不要看见我");*/
        /*
        利用gson生成json
        Gson gson=new Gson();
        System.out.println(gson.toJson(a3));*/
        /*
        可以美化输出的json的格式
        GsonBuilder gsonBuilder=new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson=gsonBuilder.create();
        System.out.println(gson.toJson(a3));*/
            /*
        这里使用了gson的回调函数，可以订制自己生成json数据的策略
        GsonBuilder gsonBuilder=new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy(){
           public String translateName(Field f){
                if(f.getName().equals("name")){
                    return "NAME";
                }
                return f.getName();
           }
        });
        Gson gson=gsonBuilder.create();
        System.out.println(gson.toJson(a3));*/
    }
}
