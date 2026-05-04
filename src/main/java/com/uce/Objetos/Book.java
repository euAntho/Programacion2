package com.uce.Objetos;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.print.DocFlavor.STRING;

import com.uce.funciones.ClaseEstatica;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Getter @Setter
    private String title;
    @Getter @Setter
    private Persona author;
    @Getter @Setter
    private float price;
    @Getter @Setter
    private String editorial;
    @Getter @Setter
    private int pages;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private String edition;

    @Override
    public String toString() {
       String est =
        "Book [title=" + title + ", author=" + author + ", price=" + price + ", editorial=" + editorial
                + ", pages=" + pages + ", year=" + year + ", edition=" + edition + "]";
                return est;
    }

}
