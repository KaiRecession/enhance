package controller.Implements;

import controller.UserController;
import domain.User;
import service.UserService;

public class UserControllerImpl implements UserController {


    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName() + "开始操作kubernetes！");
        userService.delete("master2");
        userService.find();
        userService.save("work3");
    }
}
