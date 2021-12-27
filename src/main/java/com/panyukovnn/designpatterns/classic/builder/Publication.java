package com.panyukovnn.designpatterns.classic.builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class Publication {

    private final String id;
    private final String text;
    private final LocalDateTime takenAt;
    private final byte[] media;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String text;
        private LocalDateTime takenAt;
        private byte[] media;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder takenAt(LocalDateTime takenAt) {
            this.takenAt = takenAt;
            return this;
        }

        public Builder media(byte[] media) {
            this.media = media;
            return this;
        }

        public Publication build() {
            Objects.requireNonNull(id, "Publication id can't be null.");
            Objects.requireNonNull(text, "Publication text can't be null.");
            Objects.requireNonNull(media, "Publication media can't be null.");

            return new Publication(id, text, takenAt, media);
        }
    }
}
