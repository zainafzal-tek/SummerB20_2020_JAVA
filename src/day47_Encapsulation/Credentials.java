package day47_Encapsulation;

public class Credentials {

    String name;
    int age;
    private String userName;
    private String passWord;

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }


}
