package com.ll.simpleDb;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //final붙은것들 자동으로 생성자 만들어짐
public class SimpleDb {
    private final String host;
    private final String username;
    private final String password;
    private final String dbName;

}
