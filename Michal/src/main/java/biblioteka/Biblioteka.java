package biblioteka;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteka {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();
    //Book b = new Book();
    Reader r = new Reader();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }


    public void initiateBooks(){
        Book jezNikosPoczatki = new Book(1,"Kasia Majzel-Pośpiech", "Jeż Nikoś, Początki znajomości", 2021, 9.99, null);
        Book jezNikosButelka = new Book(2, "Kasia Majzel-Pośpiech", "Jeż Nikoś, Butelka, która chciała polecieś w kosmos", 2021, 9.99, null);
        Book jezNikosCamper = new Book(3, "Kasia Majzel-Pośpiech", "Jeż Nikoś, Kamper", 2021, 9.99, null);
        books.add(jezNikosPoczatki);
        books.add(jezNikosButelka);
        books.add(jezNikosCamper);
    }

    public void initiateReaders(){
        Reader michal = new Reader(1,"Michał", "Pośpiech");
        Reader kasia = new Reader(2, "Kasia","Majzel-Pośpiech");
        readers.add(michal);
        readers.add(kasia);
    }

public void showBooks(){
    for (Book b: books
         ) {
        System.out.println(b);
    }
}

    public void showAvailableBooks(){
        for (int i = 0 ; i<books.size();i++){
            if(books.get(i).getBookReader()==null)
            {
                System.out.println(books.get(i));
            }
        }
    }

    public void showRentedBooks(){
        for (int i = 0 ; i<books.size();i++){
            if(books.get(i).getBookReader()!=null)
            {
                System.out.println(books.get(i));
            }
        }
    }
public void showReaders(){
    for (Reader r:readers
         ) {
        System.out.println(r);
    }
}


// wypożycza książkę
        public void rentBook() {
        Scanner scaner = new Scanner( System.in );
            System.out.println("Wybierz książkę");
            showAvailableBooks();
            int bookIndex = scaner.nextInt();
            System.out.println("Wybierz Czytelnika");
            showReaders();
            int userIndex = scaner.nextInt();
            books.get(bookIndex-1).setBookReader(readers.get(userIndex-1));

        }
// zwrot książki

        public void returnBook() {
            Scanner scaner = new Scanner( System.in );
            System.out.println("Wybierz książkę do zwrotu");
            showRentedBooks();
            int bookIndex = scaner.nextInt();
            books.get(bookIndex-1).setBookReader(null);
        }
        public void addReader(){
            Scanner scaner = new Scanner( System.in );
            System.out.println("Podaj imię czytelnika");
            String readersName = scaner.nextLine();
            System.out.println("Podaj nazwisko czytelnika");
            String readersLastName = scaner.nextLine();
            Reader reader = new Reader(readers.size()+1, readersName,readersLastName);
            readers.add(reader);
        }

    public void addBook(){
        Scanner scaner = new Scanner( System.in );
        System.out.println("Podaj imię i nazwisko Autora");
        String authorsName = scaner.nextLine();
        System.out.println("Podaj tytuł książki");
        String booksTitle = scaner.nextLine();
        System.out.println("Podaj rok wydania");
        int bookYear = scaner.nextInt();
        System.out.println("Podaj cenę");
        double bookPrice = scaner.nextDouble();
        Book book = new Book(books.size()+1, authorsName, booksTitle, bookYear, bookPrice, null);
        books.add(book);
    }
}
