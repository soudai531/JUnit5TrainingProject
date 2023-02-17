package com.example.junit5trainingproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnit5TrainingProjectApplicationTest {

    @Test
    void say() {
        // 事前準備
        JUnit5TrainingProjectApplication jUnit5TrainingProjectApplication = new JUnit5TrainingProjectApplication();

        // 実行
        String actual = jUnit5TrainingProjectApplication.say();

        // 検証
        assertEquals("hello world", actual);

        // 事後処理
        jUnit5TrainingProjectApplication = null;
    }
}