package com.cerdure.bookshelf.dto.book;

import com.cerdure.bookshelf.domain.book.Category;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookDto {

    private Long id;
    private String name;
    private String imgPath;
    private String author;
    private String publisher;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;
    private String ISBN;
    private Integer originPrice;
    private Integer discountRate;
    private Integer discountPrice;
    private Integer stock;
    private String intro;
    private String bookIndex;
    private String publisherReview;
    private String sortOrder;
    private List<Integer> categoryIds;
    private Category category;

    @Builder
    public BookDto(Long id, String name, String imgPath, String author, String publisher, LocalDate publishDate, String ISBN, Integer originPrice, Integer discountRate, Integer discountPrice, Integer stock, String intro, String bookIndex, String publisherReview, String sortOrder, List<Integer> categoryIds, Category category) {
        this.id = id;
        this.name = name;
        this.imgPath = imgPath;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.ISBN = ISBN;
        this.originPrice = originPrice;
        this.discountRate = discountRate;
        this.discountPrice = discountPrice;
        this.stock = stock;
        this.intro = intro;
        this.bookIndex = bookIndex;
        this.publisherReview = publisherReview;
        this.sortOrder = sortOrder;
        this.categoryIds = categoryIds;
        this.category = category;
    }

    public void coincidenceHighlight(String input){
        input = input.toUpperCase();
        int startIndex = this.name.toUpperCase().indexOf(input);
        int endIndex = startIndex + input.length();
        String coincidenceStr = "<strong>" + this.name.substring(startIndex, endIndex) + "</strong>";
        String prevStr = this.name.substring(0, startIndex);
        String nextStr = this.name.substring(endIndex, this.name.length());
        this.name = prevStr + coincidenceStr + nextStr;
    }
}
