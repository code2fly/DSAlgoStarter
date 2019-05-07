package com.generics.shopping;

public class ClothingPair<E extends Sized & Colored> extends Pair<E> {

    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public boolean matches() {
        return this.getLeft().getSize() == this.getRight().getSize()
                && this.getLeft().getColor() == this.getRight().getColor();
    }

    // declare a type right before a return type
    // this generic mechanism can be used with any method without requiring the enclosing
    // class to be generic
    public <F extends Colored> boolean  matches(F colorMatchingItem){
        return this.getLeft().getColor().equals(colorMatchingItem.getColor());
    }


    public static <E extends  Sized & Colored> boolean match(E left, E right ) {
        return left.getSize() == right.getSize() && left.getColor().equals(right.getColor());
    }

}
