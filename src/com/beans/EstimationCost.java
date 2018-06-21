package com.beans;

public class EstimationCost {
int lowerLimit;
int higherLimit;
int cost;
public int getLowerLimit() {
    return lowerLimit;
}
public void setLowerLimit(int lowerLimit) {
    this.lowerLimit = lowerLimit;
}
public int getHigherLimit() {
    return higherLimit;
}
public void setHigherLimit(int higherLimit) {
    this.higherLimit = higherLimit;
}
public int getCost() {
    return cost;
}
public void setCost(int cost) {
    this.cost = cost;
}
@Override
public String toString() {
	return "EstimationCost [lowerLimit=" + lowerLimit + ", higherLimit="
			+ higherLimit + ", cost=" + cost + "]";
}

}