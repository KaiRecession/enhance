package dao.Implements;

import dao.UserDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoImpl implements UserDao {
    // 非基本类型会出问题，还是使用ref注入的方式
    private List<String> kubernetes = new ArrayList<>();
    int id;
    String name;
    Date date;

    public UserDaoImpl(int id) {
        this.id = id;
    }

    public void setKubernetes(ArrayList<String> kubernetes) {
        this.kubernetes = kubernetes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void find() {
        System.out.println("开始搜索");
        for (String kubernete : kubernetes) {
            System.out.println(kubernete);
        }
    }

    @Override
    public void delete(String delete) {

        kubernetes.remove(delete);
        System.out.println("删除成功");
    }

    @Override
    public void save(String add) {

        kubernetes.add(add);
        System.out.println("添加成功");
    }
}
