package com.ss15.Ex1;

//Create by Quynh at 8:58 CH on 03/05/2026
public class PhanTich {
//    Phân tích logic lỗi trong ProductRepository
//
//    Phần 1 - Phân tích logic lỗi
//    Điểm sai sót thứ 1: Thiếu điều kiện kiểm tra tồn kho
//    Vấn đề: Method findByCategoryAndPriceLessThan chỉ kiểm tra danh mục và giá, nhưng không kiểm tra điều kiện stockQuantity > 0.
//
//    Hệ quả: Hệ thống trả về cả sản phẩm đã hết hàng, gây trải nghiệm tồi cho người dùng.
//
//    Điểm sai sót thứ 2: Sử dụng LessThan thay vì LessThanEqual
//    Vấn đề: Method sử dụng PriceLessThan (giá < maxPrice) thay vì PriceLessThanEqual (giá ≤ maxPrice).
//
//    Hệ quả: Sản phẩm có giá chính xác bằng mức giá tối đa không xuất hiện trong kết quả.
//
//    Test case chứng minh
//    Dữ liệu mẫu:
//
//    iPhone 14: category="Điện thoại", price=10000000, stockQuantity=5
//    Samsung S23: category="Điện thoại", price=10000000, stockQuantity=0
//    Xiaomi 13: category="Điện thoại", price=9500000, stockQuantity=3
//    Oppo Find: category="Điện thoại", price=10500000, stockQuantity=2
//    Truy vấn: Tìm "Điện thoại" với maxPrice=10000000
//
//    Kết quả mong muốn: iPhone 14, Xiaomi 13 (chỉ sản phẩm còn hàng và giá ≤ 10M)
//
//    Kết quả thực tế (code cũ): Xiaomi 13 (thiếu iPhone 14 vì dùng LessThan, bao gồm Samsung S23 hết hàng)
//
//    Phần 2 - Giải pháp
//    Method name chuẩn xác
//    List<Product> findByCategoryAndPriceLessThanEqualAndStockQuantityGreaterThan(String category, Double maxPrice, Integer minStock);
//    Giải thích:
//
//    PriceLessThanEqual: giá ≤ maxPrice
//    StockQuantityGreaterThan: stockQuantity > 0 (truyền minStock=0)
}
