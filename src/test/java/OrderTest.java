import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import org.junit.Test;


public class OrderTest {

    @Test(expected = OrderExpiredException.class)
    public void shouldThrowOrderExpiredException() {
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}
