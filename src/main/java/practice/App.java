package practice;





import org.json.JSONArray;
import org.json.JSONObject;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        testjson3();
    }
    private static void testjson(){
        JSONObject a1=new JSONObject();
        Object object=null;
        a1.put("name","王小二");
        a1.put("age",25);
        a1.put("birthday","1991-01-10");
        a1.put("school","蓝翔");
        a1.put("mojor",new String[]{"理发","挖掘机"});
        a1.put("his_girlfriend",false);
        a1.put("car",object);
        a1.put("house",object);
        a1.put("comment","这是一个注释");
        System.out.println(a1.toString());

    }
    private static void testjson2(){
        Map<String,Object> a2=new HashMap<String, Object>();
        Object object=null;
        a2.put("name","王小二");
        a2.put("age",25);
        a2.put("birthday","1991-01-10");
        a2.put("school","蓝翔");
        a2.put("mojor",new String[]{"理发","挖掘机"});
        a2.put("his_girlfriend",false);
        a2.put("car",object);
        a2.put("house",object);
        a2.put("comment","这是一个注释");
        System.out.println(new JSONObject(a2).toString());
    }
    private static void testjson3(){
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
        System.out.println(new JSONObject(a3));
    }
   /* private static void testjson4(){
        File file=new File(App.class.getResource("/wangxiaoer.json").getFile());
        FileUtils是apache的一个工具类
        String content=FileUtils.readFileToString(file);
        JSONObject jsonObject=new JSONObject(content);
        System.out.println("姓名是:"+jsonObject.getString("name"));
        System.out.println("年龄:"+jsonObject.getDouble("age"));
        System.out.println("有没有女朋友？"+jsonObject.getBoolean("his_girlfriend"));
        JSONArray mojorArray=jsonObject.getJSONArray("mojor");
        for (int i=0;i<mojorArray.length();i++){
            String m= (String) mojorArray.get(i);
            System.out.println("z专业-"+(i-1)+m);
        }

    }*/
}
