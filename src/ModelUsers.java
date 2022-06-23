public class ModelUsers {
    String name;
    String nickName;
    int age;
    public ModelUsers(String name, String nickName, int age) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getNickName() {
        return nickName;
    }
    public int getAge() {
        return age;
    }
}