package com.qkk.daily.review.al;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName TestStrStr.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月21日 22:11:32
 */
/*
    题目描述:增强的strstr
    C 语言有一个库函数： char *strstr(const char *haystack, const char *needle) ，实现在字符串 haystack 中查找第一次出现字符串 needle 的位置，如果未找到则返回 null。

    现要求实现一个strstr的增强函数，可以使用带可选段的字符串来模糊查询，与strstr一样返回首次查找到的字符串位置。
 */
public class TestStrStr {
    public static void print(String src, String tar) {
        Pattern pattern = Pattern.compile(tar);
        Matcher matcher = pattern.matcher(src);
        if (matcher.find()) {
            System.out.println(src.indexOf(matcher.group()));
        }
    }

    public static void main(String[] args) {
        print("abcd", "b[cd]");
    }
}
