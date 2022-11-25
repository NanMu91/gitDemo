package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("pull一下");
        System.out.println("hot-fix1 分支");
        System.out.println("第一次push2");
        System.out.println("github");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
