package task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Map<String, Algorithm> function = context.getBean(MapFunction.class).getFunction();
        List<Point> points = Arrays.asList(new Point(2,3),new Point(2,2),new Point(3,3));
        Spectra spectra = new Spectra(points);
        Set<String> stringSet = function.keySet();
        System.out.println("Primary spectra: "+spectra+"\n");
        for (String s : stringSet) {
            System.out.println("Result spectra with NameFunction: "+s);
            System.out.println(function.get(s).run(spectra)+"\n");
        }
    }
}
