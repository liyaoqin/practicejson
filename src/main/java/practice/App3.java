package practice;
//解析json
public class App3 {
    public static void main(String[] args) {
        /*File file=new File(App.class.getResource("/wangxiaoer.json").getFile());
        String content=FileUtils.readFileToString(file);
        Gson gson=new Gson();
        Diaosi a=gson.fromJson(content,Diaosi.class);
        system.out.println(a);
        */
           /*转换日期格式
           File file=new File(App.class.getResource("/wangxiaoer.json").getFile());
        String content=FileUtils.readFileToString(file);
        Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        DiaosiWithBirthday a=gson.fromJson(content,DiaosiWithBirthday.class);
        system.out.println(a.getBirthday().tolocaltoString());
        */
                 /*
           File file=new File(App.class.getResource("/wangxiaoer.json").getFile());
        String content=FileUtils.readFileToString(file);
        Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        DiaosiWithBirthday a=gson.fromJson(content,DiaosiWithBirthday.class);
        system.out.println(a.getBirthday().tolocaltoString());
        system.out.println(a.getMojor());
        system.out.println(a.getMojor().getClass());
        */
    }


}
