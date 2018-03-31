package ProxyAop;

/**
 * @作者 刘宝军
 * Created by Edion on 2018/3/30.
 */
public class StudentBean implements StudentInterface {
    private String name ;
    private String hobby;

    public StudentBean(String name) {
        this.name = name;
    }

    public StudentBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void pritn() {
        System.out.println("Hello World!"+name);
    }
}
