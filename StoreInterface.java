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

}

public class StoreInterface {
    public static void main(String[] args) {
    
    }
}
