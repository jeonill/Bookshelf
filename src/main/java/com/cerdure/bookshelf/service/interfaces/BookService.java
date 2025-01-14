package com.cerdure.bookshelf.service.interfaces;

import com.cerdure.bookshelf.domain.book.Book;
import com.cerdure.bookshelf.domain.member.Member;
import com.cerdure.bookshelf.dto.book.BookDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;


public interface BookService {
    public List<Book> findAll();
    public Page<Book> findAllWithPaging(Pageable pageable);
    public Book findById(Long bookId);
    public Book findById(String bookId);
    public List<Book> findByName(String name);
    public Page<Book> findByName(String name, String sortOrder, Pageable pageable);
    public Page<Book> findByNamePaging(String name, String sortOrder, Integer maxNum, Pageable pageable);
    public Page<Book> findByNameWithCategoryAndPublishDate(String name, List<Integer> categoryIds, LocalDate publishDate, String sortOrder, Pageable pageable);
    public Page<Book> findByCategory(Integer categoryId, Pageable pageable);
    public List<Book> findTop10(Integer criteria);
    public List<Book> findDiscountTop16();
    public List<Book> findDiscountTop18();
    public List<Book> findByNameWithDiscount(String name, int discountRate);
    public void insert(BookDto bookDto);
    void validateDuplicateBook(BookDto bookDto);
    public void modify(BookDto bookDto);
    public void delete(BookDto bookDto);
    boolean bookMark(Book book, Member member);


}
