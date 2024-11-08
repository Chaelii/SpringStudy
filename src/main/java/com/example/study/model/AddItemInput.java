//package com.example.study.model;
//
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import org.hibernate.validator.constraints.Range;
//
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//public class AddItemInput {
//    @NotBlank(message = "상품 이름은 비워둘 수 없습니다.")
//    private String name;
//    @NotBlank(message = "상품 설명은 비워둘 수 없습니다.")
//    private String description;
//    @NotBlank(message = "시작 가격을 입력해야 합니다.")
//    @Range(min = 100, max = 100000,
//            message = "시작 가격은 최소 100원, 최대 10,000,000원 사이여야 합니다.")
//    private String startingPrice;
//}
