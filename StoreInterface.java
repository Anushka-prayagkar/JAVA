interface iMember {
    public void callback();
}

class Store {
    iMember members [] = new iMember[100];
    int counter = 0;
    
    void register(iMember m) {
        members[counter++] = m;
    }

    void inviteSale() {
        for(int i = 0; i < counter; i++) {
            members[i].callback();
        }
    }
}

class Customer implements iMember {
    String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("I will visit " + name);
    }
}

public class StoreInterface {
    public static void main(String[] args) {
        Store s = new Store();

        Customer c1 = new Customer("Anushka");
        Customer c2 = new Customer("Prayagkar");

        s.register(c1);
        s.register(c2);

        s.inviteSale();    
    }
}
