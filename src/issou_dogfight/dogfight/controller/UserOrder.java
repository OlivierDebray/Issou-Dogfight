package issou_dogfight.dogfight.controller;

/**
 * Created by Olivier Debray on 01/06/2017.
 */

public class UserOrder implements IUserOrder {
    private int player ;
    private Order order ;

    public UserOrder(int player, Order order) {
        this.player = player;
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return this.order ;
    }

    @Override
    public int getPlayer() {
        return this.player ;
    }
}
