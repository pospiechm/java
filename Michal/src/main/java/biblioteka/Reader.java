package biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Reader {
        private int index;
        private String firstName;
        private String lastName;

        public Reader(int index, String firstName, String lastName) {
                this.index = index;
                this.firstName = firstName;
                this.lastName = lastName;
        }

        public Reader(){
        }


        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        @Override
        public String toString() {
                return  "Czytelnik: " + index +
                        ". " + firstName +
                        " " + lastName ;
        }
}
