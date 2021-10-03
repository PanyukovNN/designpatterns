package com.panyukovnn.designpatterns.builder.innerbuilder.model;

import java.util.List;

public class InstaChannel {

    private final long id;
    private final String login;
    private final String password;
    private final List<String> posts;

    private InstaChannel(Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.posts = builder.posts;
    }

    @Override
    public String toString() {
        return "InstaChannel{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", posts=" + posts +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long id;
        private String login;
        private String password;
        private List<String> posts;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder posts(List<String> posts) {
            this.posts = posts;
            return this;
        }

        public InstaChannel build() {
            if (login == null || login.isEmpty()) {
                throw new IllegalArgumentException("Login could not be empty.");
            }

            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password could not be empty.");
            }

            return new InstaChannel(this);
        }
    }
}
