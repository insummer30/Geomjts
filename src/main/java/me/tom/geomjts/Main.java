package me.tom.geomjts;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

/**
 * Created on 2020/08/11
 *
 *  VIVID Solution에서 제공하는 JTS 라이브러리를 사용하여 공간 연산을 사용해보는 연습 프로젝트
 *
 * @author tom.j
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Geometry g1 = new WKTReader().read("LINESTRING (0 0, 10 10, 20 20)");

        /* 아래와 같이 팩토리를 사용해서 쉽게 보기 쉽게 지오메트리 객체를 만들 수도 있다.
        Coordinate[] coordinates = new Coordinate[] {
                new Coordinate(0, 0),
                new Coordinate(10, 10),
                new Coordinate(20, 20)};

        Geometry g1 = new GeometryFactory().createLineString(coordinates);
         */

        Geometry g2 = new WKTReader().read("POLYGON((0 0, 2 0, 2 2, 0 2, 0 0))");
        Geometry pangyo = new WKTReader().read("POLYGON((215282.50 436328.00,215282.509168 429560.00,206114.50 429560.00,206114.5 436328.00,215282.50 436328.00))");
        Geometry pangyo2 = new WKTReader().read("POLYGON((209680.50 433432.00,209208.50 433024.00,209100.50 431976.00,210152.50 431860.00,211404.50 432056.00,211404.50 433500.00,210484.50 433592.00,209968.50 433668.00,209680.50 433432.00))");
        Geometry kakao = new WKTReader().read("POLYGON((209691.25 433663.00,209691.25139 433533.50,209552.25 433533.50,209552.25 433663.00,209691.25 433663.00))");
        Geometry kakao2 = new WKTReader().read("POLYGON((209552.75 433663.50,209546.75 433608.50,209547.25 433579.00,209550.75 433536.50,209631.25 433534.50,209687.25 433536.50,209693.25 433555.50,209692.75 433581.00,209692.25 433612.00,209693.75 433645.50,209687.75 433665.00,209607.75 433665.50,209573.25 433660.50,209552.75 433663.50))");
        Geometry fourByFour = new WKTReader().read("POLYGON((212828.00 433809.00,212828.004000 429705.00,208828.00 429705.00,208828 433809.00,212828.00 433809.00))");
        Geometry veryBig = new WKTReader().read("POLYGON((464333.00 457371.00,464333.00397312 60059.00,67021.00 60059.00,67021 457371.00,464333.00 457371.00))");


        System.out.println(((int)g2.getArea()));
        System.out.println((int)pangyo.getArea());
        System.out.println((int)pangyo2.getArea());
        System.out.println((int)kakao.getArea());
        System.out.println((int)kakao2.getArea());
        System.out.println((int)fourByFour.getArea());
        System.out.println((int)veryBig.getArea());
    }
}
