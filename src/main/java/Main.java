import controller.factory.GlovesFactory;
import controller.factory.HelmetFactory;
import controller.factory.OverallsFactory;
import controller.factory.ShoesFactory;
import controller.search.SearchByParams;
import controller.sort.SortingByParams;
import domain.Motorcyclist;
import domain.equipment.*;
import domain.equipment.enums.StyleType;
import domain.equipment.enums.TypeHelmet;
import domain.equipment.enums.TypeSeason;
import domain.equipment.enums.TypeMaterial;
import view.ConsoleView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args ){

        List<Ammunition> helmetList = new ArrayList<>();
        List<Ammunition> glovesList = new ArrayList<>();
        List<Ammunition> overallsList = new ArrayList<>();
        List<Ammunition> shoesList = new ArrayList<>();
        ShoesFactory shoesFactory = ShoesFactory.getInstance();
        HelmetFactory helmetFactory =  HelmetFactory.getInstance();
        GlovesFactory glovesFactory =  GlovesFactory.getInstance();
        OverallsFactory overallsFactory =  OverallsFactory.getInstance();
        Random randomSize = new Random();
        Random randomType = new Random();
        Motorcyclist motorcyclist = new Motorcyclist();
        ConsoleView view = new ConsoleView();
        int tempRandomSize = 0;
        int tempRandomType = 0;

        for (int i = 0; i < 10; i++) {
            tempRandomSize = 35 + randomSize.nextInt(45-35);
            tempRandomType = 0 + randomType.nextInt(3-0);
            shoesList.add(shoesFactory.createAmmunition(((i + 5) * 3), "FOX", tempRandomSize,
                                                                                StyleType.values()[tempRandomType]));
        }
        for (int i = 0; i < 10; i++) {
            tempRandomSize = 10 + randomSize.nextInt(50-10);
            tempRandomType = 0 + randomType.nextInt(4-0);
            helmetList.add(helmetFactory.createAmmunition(((i + 5) * 3), "LS" + i, tempRandomSize,
                                                                                TypeHelmet.values()[tempRandomType]));
        }
        for (int i = 0; i < 10; i++) {
            tempRandomSize = 1 + randomSize.nextInt(10-1);
            tempRandomType = 0 + randomType.nextInt(2-0);
            glovesList.add(glovesFactory.createAmmunition(((i + 5) * 2), "RubelHorn", tempRandomSize,
                                                                                TypeMaterial.values()[tempRandomType]));
        }
        for (int i = 0; i < 10; i++) {
            tempRandomSize = 40 + randomSize.nextInt(70-40);
            tempRandomType = 0 + randomType.nextInt(4-0);
            overallsList.add(overallsFactory.createAmmunition(((i + 5) * 5), "TSHUL", tempRandomSize, TypeSeason.values()[tempRandomType]));
        }

        motorcyclist.setName("Максим");
        motorcyclist.setHelmet((Helmet) helmetList.get(2));
        motorcyclist.setOveralls((Overalls) overallsList.get(5));
        motorcyclist.setGloves((Gloves) glovesList.get(8));
        motorcyclist.setShoes((Shoes) shoesList.get(0));

        view.showMotocyclist(motorcyclist);
        view.showHelmetList(helmetList);
        view.showOverralsList(overallsList);
        view.showGlovesList(glovesList);
        view.showShoesList(shoesList);
        view.showFinalCost(motorcyclist);

        SortingByParams sortingByParams = SortingByParams.getInstance();
        sortingByParams.sortingBySize(helmetList);
        view.showHelmetList(helmetList);

        SearchByParams searchByParams = SearchByParams.getInstance();
        List<Ammunition> searchList = searchByParams.searchByRangeSize(shoesList,40,43);
        view.showShoesList(searchList);
    }
}
