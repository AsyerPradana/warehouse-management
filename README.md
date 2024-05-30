# warehouse-management
Object-Oriented Programming Project that discuss about efficiency Warehouse Management.

# Warehouse/
├── build.xml
├── manifest.mf
├── nbproject/
│ ├── build-impl.xml
│ ├── genfiles.properties
│ ├── project.properties
│ └── project.xml
├── src/
│ ├── config/
│ │ ├── Koneksi.java
│ │ └── mysql-connector-j-8.3.0.jar
│ ├── dao/
│ │ ├── DAO_Login.java
│ │ ├── DAO_Pengguna.java
│ │ └── Encrypt.java
│ ├── img/
│ │ ├── admin.png
│ │ ├── background-ware.png
│ │ ├── dashboard.png
│ │ ├── home.png
│ │ ├── lokasi.png
│ │ ├── pengguna.png
│ │ ├── produk.png
│ │ └── report.png
│ ├── Main/
│ │ ├── content_bg.form
│ │ ├── content_bg.java
│ │ ├── Menu_Utama.form
│ │ ├── Menu_Utama.java
│ │ ├── MenuItem.form
│ │ └── MenuItem.java
│ ├── model/
│ │ ├── Model_Login.java
│ │ ├── Model_Pengguna.java
│ ├── service/
│ │ ├── Service_Login.java
│ │ └── Service_Pengguna.java
│ ├── tablemodel/
│ │ └── TableMod_Pengguna.java
│ └── view/
│ ├── Data_Pengguna.form
│ ├── Data_Pengguna.java
│ ├── Form_Login.form
│ ├── Form_Login.java
│ ├── Master_Pengguna.form
│ └── Master_Pengguna.java

# Run Program
Pastikan sebelum menjalankan project untuk menambahkan database terlebih dahulu
1. Buat database 'db_warehouse' kemudian import file sql kedalam database
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/bf2211cc-4a4f-4888-b371-6bc46bb9e834)
2. Setelah database dibuat untuk login gunakan username 'admin' dan password 'admin'
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/34e0cd61-7fb2-4d1e-88d2-cbf7bd4968f3)
3. Jika berhasil login akan masuk tampilan utama app (Home)
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/d6b8ccd7-e643-48de-918b-a81f5b471321)
4. Pilih Dashboard/pengguna untuk melihat tabel pengguna, untuk menambahkan data > klik btn tambah
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/33229875-e0e5-4889-a67d-be6a787256c3)
5. Untuk mengedit data klik salah 1 row pada tabel, otomatis btn ubah, hapus dan batal akan muncul
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/fd053951-4c45-4123-b4c8-8a6f0b3124aa)
6. Klik perbarui untuk update data yg dipilih
![image](https://github.com/AsyerPradana/warehouse-management/assets/157374618/6d4832bb-22d8-42d9-aa93-a5edd3bc2396)

   
