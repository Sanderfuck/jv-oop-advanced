package core.basesyntax.entity;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor();
    }
}
