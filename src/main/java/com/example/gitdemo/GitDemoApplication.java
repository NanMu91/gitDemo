package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("jjjj");
        System.out.println("pppp");
        System.out.println("master 分支1");
        System.out.println("hot-fix1 分支");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
