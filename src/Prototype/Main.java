package Prototype;

import Prototype.Types.ByArea;
import Prototype.Types.ByPeople;

import java.util.ArrayList;
import java.util.List;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 03.05.2017
 * 
 * Karpikova
 */
public class Main {
    public static void main(String[] args) {
        AreaLevel Netherlands = new AreaLevel(null, 0, ByArea.COUNTRY);
        AreaLevel NiceRegion = new AreaLevel(Netherlands, 0, ByArea.REGION);
        AreaLevel Utreht = new AreaLevel(NiceRegion, 99, ByArea.CITY);
        AreaLevel Leiden = new AreaLevel(NiceRegion, 23, ByArea.CITY);
        List<AreaLevel> areaLevelList = new ArrayList<AreaLevel>();
        areaLevelList.add(Utreht);
        areaLevelList.add(Leiden);
        areaLevelList.add(NiceRegion);
        areaLevelList.add(Netherlands);
        int areaNeth = AreaLevel.getSumArea(NiceRegion, areaLevelList);
        System.out.println("Area of NiceRegion is " + areaNeth);
    }
}
