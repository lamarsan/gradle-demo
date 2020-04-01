package com.lamarsan.gradle.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * className: TodoRepository
 * description: TODO
 *
 * @author lamar
 * @version 1.0
 * @date 2020/4/1 23:45
 */
public class TodoRepository {
    private static Map<String, TodoItem> items = new HashMap<>();

    public void save(TodoItem item) {
        System.out.println("" + item);
        items.put(item.getName(), item);
    }
}
