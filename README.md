# Báo cáo Bài tập Kiểm thử Tự động với Selenium WebDriver

## Thông tin sinh viên

* Họ và tên: Đỗ Nguyên Anh Vũ
* MSSV: 23010334
* Lớp: CSE703010-1-3-25(COUR01.LT3)
* Môn học: Kiểm thử Phần mềm

---

# Mục tiêu bài tập

* Tìm hiểu và thực hành Selenium WebDriver.
* Xây dựng các kịch bản kiểm thử tự động.
* Thực hiện kiểm thử chức năng trên website thực tế.
* Áp dụng Java, Selenium, TestNG và Maven.

---

# 1. Giới thiệu về Selenium

Selenium là bộ công cụ mã nguồn mở hỗ trợ tự động hóa kiểm thử ứng dụng web.

Trong bài tập này sử dụng:

* Java
* Selenium WebDriver 4
* TestNG
* Maven
* IntelliJ IDEA

---

# 2. Website kiểm thử

Website sử dụng:

https://www.saucedemo.com

Đây là website mô phỏng hệ thống bán hàng thường dùng cho học tập và kiểm thử tự động.

### Ảnh website

<!-- CHÈN ẢNH WEBSITE -->

```md
![Website](images/website.png)
```

---

# 3. Cấu trúc Project

```text
selenium-automation-testing
│
├── README.md
├── pom.xml
└── src
    └── test
        └── java
            └── com
                └── automation
                    └── tests
                        ├── LoginTest.java
                        ├── AddToCartTest.java
                        └── FilterAndLogoutTest.java
```

### Ảnh cấu trúc Project

<!-- CHÈN ẢNH CẤU TRÚC -->

```md
![Project Structure](images/project-structure.png)
```

---

# 4. Test Cases

| STT | Test Case                  | Mô tả                       | Kết quả  |
| --- | -------------------------- | --------------------------- | -------- |
| 1   | Đăng nhập thành công       | Kiểm tra đăng nhập hợp lệ   | ✅ Passed |
| 2   | Thêm sản phẩm vào giỏ hàng | Kiểm tra chức năng giỏ hàng | ✅ Passed |
| 3   | Lọc sản phẩm + Đăng xuất   | Kiểm tra lọc và logout      | ✅ Passed |

---

## Test Case 1 — Đăng nhập thành công

### Mô tả

* Nhập tài khoản
* Nhập mật khẩu
* Đăng nhập
* Kiểm tra hiển thị Products

### Ảnh thực hiện

<img width="1717" height="916" alt="ChatGPT Image 17_38_00 17 thg 6, 2026" src="https://github.com/user-attachments/assets/82a4d120-aac2-4472-86cb-4d1df585802c" />


### Kết quả

✅ Passed

---

## Test Case 2 — Thêm sản phẩm vào giỏ hàng

### Mô tả

* Đăng nhập
* Chọn sản phẩm
* Thêm vào giỏ

### Ảnh thực hiện

<img width="1716" height="916" alt="ChatGPT Image 17_39_22 17 thg 6, 2026" src="https://github.com/user-attachments/assets/35705e26-10c7-44d1-8227-55c5c9d691d6" />

### Kết quả

✅ Passed

---

## Test Case 3 — Lọc sản phẩm + Đăng xuất

### Mô tả

* Lọc giá thấp → cao
* Mở menu
* Đăng xuất

### Ảnh thực hiện

<img width="1721" height="914" alt="ChatGPT Image 17_41_19 17 thg 6, 2026" src="https://github.com/user-attachments/assets/ae520a55-ed0c-4803-8f60-8f69e0642c41" />

### Kết quả

✅ Passed

---

# 5. Kết quả thực hiện

| Nội dung     | Giá trị |
| ------------ | ------- |
| Tổng số test | 3       |
| Passed       | 3       |
| Failed       | 0       |
| Error Rate   | 0%      |

### Ảnh kết quả chạy

<img width="1914" height="870" alt="test1" src="https://github.com/user-attachments/assets/045bcd24-6cb5-4220-99f5-42340177834d" />
<img width="1914" height="870" alt="test2" src="https://github.com/user-attachments/assets/b55b9e48-062f-41f6-b700-5f04679c0276" />
<img width="1914" height="870" alt="test3" src="https://github.com/user-attachments/assets/cfde006a-063a-4fd6-881b-f2680961577f" />


# 6. Khó khăn & Bài học

## Khó khăn

* Xử lý thời gian chờ (Wait)
* Tìm locator phù hợp
* Đồng bộ Selenium với giao diện web

## Bài học

* Hiểu quy trình Automation Testing
* Làm quen Selenium WebDriver
* Sử dụng TestNG để quản lý test

---

# 7. Tài liệu tham khảo

* Selenium Official Documentation
* Sauce Demo

Repository:

https://github.com/avu36/selenium-automation-testing

---

## Kết luận

Hoàn thành bài tập kiểm thử tự động bằng Selenium WebDriver với đầy đủ các chức năng:

* Đăng nhập
* Thêm sản phẩm vào giỏ
* Lọc sản phẩm
* Đăng xuất

Kết quả cuối cùng: **100% Test Passed**
