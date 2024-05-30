# warehouse-management
Object-Oriented Programming Project that discuss about efficiency Warehouse Management.
Warehouse/src/
├── Main
│   └── Main.java                  # Berisi file utama yang menginisiasi aplikasi
├── config
│   ├── DatabaseConfig.java        # Konfigurasi koneksi database
│   └── drivermysql.jar            # Driver MySQL
├── dao
│   ├── UserDAO.java               # Data Access Object untuk operasi CRUD User
│   └── UserDAOImpl.java           # Implementasi dari UserDAO
├── img
│   └── logo.png                   # Contoh file gambar yang digunakan dalam aplikasi
├── model
│   ├── User.java                  # Struktur data User (setter dan getter)
│   └── Location.java              # Struktur data Location (setter dan getter)
├── service
│   ├── UserService.java           # Layanan untuk operasi bisnis User
│   └── UserServiceImpl.java       # Implementasi dari UserService
├── tablemodel
│   └── UserTableModel.java        # Model untuk menampilkan data User dalam tabel
└── view
    └── UserTableView.java         # View untuk presentasi data User

Pastikan sebelum menjalankan project untuk menambahkan database terlebih dahulu
1. Buat database 'db_warehouse' kemudian import file sql kedalam database
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/bf2211cc-4a4f-4888-b371-6bc46bb9e834)
2. Setelah database dibuat untuk login gunakan username 'admin' dan password 'admin'
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/3db22e9d-04ef-4743-a897-9ca7578b9994)
