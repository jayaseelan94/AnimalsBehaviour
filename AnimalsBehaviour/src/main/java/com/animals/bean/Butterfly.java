package com.animals.bean;

import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;
import com.animals.interfaces.Flyable;
import com.animals.interfaces.Speakable;
import com.animals.utils.Constants;

public class Butterfly extends Insect implements Flyable {
	private Insect state = new caterpillarState(new SingHelper(SoundEnums.CATERPILLAR));

    public Butterfly() {
        super(new SingHelper(SoundEnums.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new SingHelper(SoundEnums.NO_SOUND));
    }

    @Override
    public void fly() {
        state.fly();
    }

    @Override
    public void canSpeak() {
        state.canSpeak();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    private class ButterflyState extends Insect implements Flyable {

        public ButterflyState(SingHelper singHelper) {
            super(singHelper);
        }

        @Override
        public void canSpeak() {
            super.canSpeak();
        }

        @Override
        public void fly() {
            super.fly();
        }
    }

    private class caterpillarState extends Insect implements Speakable {

        public caterpillarState(SingHelper singHelper) {
            super(singHelper);

        }

        @Override
        public void canSpeak() {
            super.canSpeak();
        }

        @Override
        public void fly() {
            System.out.println(Constants.I_CANT_FLY);
        }
    }
}
