package spring;

import java.util.ArrayList;
import java.util.List;

public class User implements IValidate {

    private List<String> idList = new ArrayList<>();
    private List<String> passList = new ArrayList<>();

    public User() {
    }

    public void addUser(String userId, String password) {
        idList.add(userId);
        passList.add(password);
        System.out.println("User Registered Successfully!");
    }

    public boolean IsAuthenticated(String userId, String password) {

        for (int i = 0; i < idList.size(); i++) {
            if (idList.get(i).equals(userId) &&
                passList.get(i).equals(password)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public List<String> getPassList() {
        return passList;
    }

    public void setPassList(List<String> passList) {
        this.passList = passList;
    }

    public String toString() {
        return "User [Total Users=" + idList.size() + "]";
    }
}