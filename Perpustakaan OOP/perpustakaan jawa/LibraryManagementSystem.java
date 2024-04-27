import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Data buku
        String[][] books = {
            {"Java Programming", "John Doe", "1234567890", "Tersedia"},
            {"Python Basics", "Jane Smith", "0987654321", "Tersedia"},
            {"C++ for Beginners", "Alex Johnson", "1357924680", "Tersedia"}
        };

        // Memulai input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memilih peran
        System.out.println("Selamat datang di Perpustakaan XYZ!");
        System.out.println("Pilih peran Anda:");
        System.out.println("1. Pustakawan");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        System.out.print("Pilih peran: ");
        int roleChoice = scanner.nextInt();

        // Memproses peran pengguna
        switch (roleChoice) {
            case 1:
                librarianMenu(books, scanner);
                break;
            case 2:
            case 3:
                userMenu(books, scanner);
                break;
            default:
                System.out.println("Peran tidak valid.");
        }
    }

    // Metode untuk menu Pustakawan
    private static void librarianMenu(String[][] books, Scanner scanner) {
        while (true) {
            System.out.println("\nMenu Pustakawan:");
            System.out.println("1. Lihat daftar buku");
            System.out.println("2. Tambah buku baru");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Kembalikan buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBookList(books);
                    break;
                case 2:
                    addBook(books, scanner);
                    break;
                case 3:
                    borrowBook(books, scanner);
                    break;
                case 4:
                    returnBook(books, scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Metode untuk menu Mahasiswa/Dosen
    private static void userMenu(String[][] books, Scanner scanner) {
        while (true) {
            System.out.println("\nMenu Pengguna:");
            System.out.println("1. Lihat daftar buku");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Kembalikan buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBookList(books);
                    break;
                case 2:
                    borrowBook(books, scanner);
                    break;
                case 3:
                    returnBook(books, scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Metode untuk menampilkan daftar buku dalam format tabel
    private static void displayBookList(String[][] books) {
        System.out.println("\nDaftar Buku:");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("| No | Judul Buku          | Penulis       | Status    |");
        System.out.println("+-----------------------------------------------------+");
        for (int i = 0; i < books.length; i++) {
            if (books[i][0] != null) {
                System.out.printf("| %-2d | %-20s | %-13s | %-9s |\n", i + 1, books[i][0], books[i][1], books[i][3]);
            }
        }
        System.out.println("+-----------------------------------------------------+");
    }

    // Metode untuk menambahkan buku baru
    private static void addBook(String[][] books, Scanner scanner) {
        scanner.nextLine(); // Membuang karakter newline
        System.out.println("\nTambahkan buku baru:");

        // Meminta input judul buku
        System.out.print("Judul: ");
        String title = scanner.nextLine();

        // Meminta input penulis buku
        System.out.print("Penulis: ");
        String author = scanner.nextLine();

        // Meminta input ISBN buku
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        // Menambahkan buku ke dalam array
        for (int i = 0; i < books.length; i++) {
            if (books[i][0] == null) {
                books[i][0] = title;
                books[i][1] = author;
                books[i][2] = isbn;
                books[i][3] = "Tersedia";
                System.out.println("Buku berhasil ditambahkan ke dalam daftar.");
                return;
            }
        }
        System.out.println("Daftar buku penuh. Tidak dapat menambahkan buku baru.");
    }

    // Metode untuk meminjam buku
    private static void borrowBook(String[][] books, Scanner scanner) {
        scanner.nextLine(); // Membuang karakter newline
        System.out.print("\nMasukkan judul buku yang ingin dipinjam: ");
        String bookTitle = scanner.nextLine();

        // Mencari buku berdasarkan judul
        boolean bookFound = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i][0] != null && books[i][0].equalsIgnoreCase(bookTitle)) {
                if (books[i][3].equalsIgnoreCase("Tersedia")) {
                    System.out.println("Buku berhasil dipinjam: " + books[i][0]);
                    books[i][3] = "Dipinjam"; // Menandai buku sebagai dipinjam
                } else {
                    System.out.println("Maaf, buku sedang tidak tersedia.");
                }
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    // Metode untuk mengembalikan buku
    private static void returnBook(String[][] books, Scanner scanner) {
        scanner.nextLine(); // Membuang karakter newline
        System.out.print("\nMasukkan judul buku yang ingin dikembalikan: ");
        String bookTitle = scanner.nextLine();

        // Mencari buku berdasarkan judul
        boolean bookFound = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i][0] != null && books[i][0].equalsIgnoreCase(bookTitle)) {
                if (books[i][3].equalsIgnoreCase("Dipinjam")) {
                    System.out.println("Buku berhasil dikembalikan: " + books[i][0]);
                    books[i][3] = "Tersedia"; // Menandai buku sebagai tersedia kembali
                } else {
                    System.out.println("Buku tidak dalam status dipinjam.");
                }
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}
