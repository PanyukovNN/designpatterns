package com.panyukovnn.designpatterns.classic.builder;

public class Main {

    public static void main(String[] args) {

//        new Publication()
//                .setId("")
//                .setText("");

        Publication.builder()
                .id(null)
                .build();

        Publication.Builder builder = Publication.builder();

        enrichResponse(builder);
        enrichResponse(builder);
        enrichResponse(builder);

        Publication build = builder.build();
    }

    private static void enrichResponse(Publication.Builder builder) {
        builder.id("");
    }
}
