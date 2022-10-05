import java.util.ArrayList;
import java.util.Scanner;

public class TestObject {

    private ArrayList<User> userList = new ArrayList<>();

    public static void main( String[] args ) {
        TestObject users = new TestObject();
        Scanner scan = new Scanner( System.in );
        for( ;; ) {
            System.out.println( "Enter a user name to register or a blank line to exit:" );
            System.out.print( "User name: " );
            String name = scan.nextLine();
            if( name.isEmpty() ) break;
            User user = new User();
            user.setName( name );
            System.out.print( "User account no.: " );
            int acc = scan.nextInt();
            scan.nextLine();  // eat the new line
            user.setAccount( acc );
            users.addUser( user );
            System.out.println( users );
        }
    }

    public void addUser( User user ) {
        userList.add( user );
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for( int i = 0; i < userList.size(); i++ ) {
            stringBuilder.append( i );
            stringBuilder.append( ": " );
            stringBuilder.append( userList.get( i ) );
            stringBuilder.append( '\n' );
        }
        return stringBuilder.toString();
    }


    public static class User {
        private String name;
        private int account;

        @Override
        public String toString() {
            return "User{" + "name=" + name + ", account=" + account + '}';
        }

        public String getName() {
            return name;
        }

        public void setName( String name ) {
            this.name = name;
        }

        public int getAccount() {
            return account;
        }

        public void setAccount( int account ) {
            this.account = account;
        }
    }
}
