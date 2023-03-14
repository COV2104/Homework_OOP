import java.util.Comparator;

public class PetAgeComparator implements Comparator< HomeAnimal> {

    @Override
    public int compare(HomeAnimal o1, HomeAnimal o2) {
        if(o1.getAge()> o2.getAge())
            return 1;
        else if(o1.getAge()< o2.getAge())
            return -1;
        else
            return 0;
    }
}