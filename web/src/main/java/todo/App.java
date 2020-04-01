package todo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * className: App
 * description: TODO
 *
 * @author lamar
 * @version 1.0
 * @date 2020/4/1 22:14
 */
public class App {
    private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        TodoItem item = new TodoItem(scanner.nextLine());
        log.info(item.toString());
    }
}
