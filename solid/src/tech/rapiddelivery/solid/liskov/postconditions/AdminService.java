package tech.rapiddelivery.solid.liskov.postconditions;

public class AdminService {
    public boolean authorize(String userRole){
        return "ADMIN".equals(userRole);
    }
}
