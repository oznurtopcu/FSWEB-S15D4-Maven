package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {


    public boolean add(String str) {
        if (!super.contains(str)) {
            // Aynı elemanı tekrar eklememek için kontrol yapıyoruz
            return super.add(str);
        }
        return false;
    }

    public void sort(){
        Collections.sort(this);
        // ArrayList'i sıralıyoruz
        // Bir elemanın kendisi üzerinde yapılacak bir işlem için this kullanıyoruz
    }

    public boolean remove(Object obj) {
        boolean result = super.remove(obj);
        sort(); // silme işleminden sonra tekrar sıralyor
        return result;
    }
}
