package Servise;

import Objects.Toys;

import java.util.ArrayList;
import java.util.List;

public class Constructor {

    List<Toys> array = new ArrayList<>();
    public List<Toys> arrayCreator(Toys arr){
        array.add(arr);
        return array;
    }
}
