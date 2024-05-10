package client;

public class Owner {

    int phone;

    public Owner(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "phone=" + phone +
                '}';
    }
}
