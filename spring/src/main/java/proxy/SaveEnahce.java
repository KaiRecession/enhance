package proxy;


import domain.User;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaveEnahce {
    public void save(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        System.out.println("开始代理增强");
//        Object[] args = pjp.getArgs();
        Object[] objects = new Object[1];
        User user = new User();
        user.setName("代理kai");
        objects[0] = user;
        try {
            // 调用本来的方法
            Object proceed = pjp.proceed(objects);
            System.out.println("代理执行完毕");
            System.out.println(proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
