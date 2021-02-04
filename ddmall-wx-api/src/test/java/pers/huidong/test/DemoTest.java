package pers.huidong.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @USER: xhd
 * @DATE: 2021-02-04
 * @Desc:
 */
public class DemoTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(111);
        list.add(111);
        for (Object i :
                list) {
            System.out.println(i);
        }
    }
}
