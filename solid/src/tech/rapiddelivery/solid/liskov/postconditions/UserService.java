package tech.rapiddelivery.solid.liskov.postconditions;

public class UserService extends AdminService {
    public boolean authorize(String userRole){
        return super.authorize(userRole) || "USER".equals(userRole);
    }
}
