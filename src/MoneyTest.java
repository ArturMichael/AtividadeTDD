import org.junit.Test;
import static org.junit.Assert.*;

abstract class Money {
    protected int amount;
    static Money dollar(int amount) {
        return new Dollar(amount);
    }
    static Money franc(int amount) {
        return new Franc(amount);
    }
    abstract Money times(int multiplier);
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}