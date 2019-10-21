package com.example.lombok;

public class MainTest {
    public static void main(String[] args) {
//        链式风格
        new Product2().setDescription("xxx").setWeight(1);

//       lombok 链式风格 @RequiredArgsConstructor 和 @NonNull
        Product.of("xxx").setWeight(1);
//   builder
        Product3 product3 = Product3.builder().description("zs").weight(24).build();
//     lombok builder
        Product4 product4 = Product4.builder().description("zs").weight(24).build();





    }
}
