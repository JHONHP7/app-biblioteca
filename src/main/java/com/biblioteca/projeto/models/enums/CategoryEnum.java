package com.biblioteca.projeto.models.enums;

public enum CategoryEnum {
    FICCAO("Ficção"), POLICIAL("Policial"), SUSPENSE("Suspense"), FANTASIA("Fantasia"), ROMANCE("Romance"), TERROR("Terror");

    private String code;

    CategoryEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
