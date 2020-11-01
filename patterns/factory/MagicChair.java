package com.company;

public class MagicChair implements Chair {

    void doMagic() {
        System.out.println("Стул гения");
    }

    @Override
    public void useAdvantages() {
        doMagic();
    }

}
