package bee.monitor.core;

import bee.monitor.core.cal.Calculator;
import bee.monitor.core.conf.ConfCenter;
import bee.monitor.entity.MonitorPoint;

/**
 * Created by zhangsx on 15/8/18.
 */
public class Splitter implements Calculator{
    private ConfCenter confCenter;

    @Override
    public void count(MonitorPoint monitorPoint) {
        Calculator calculator = confCenter.getCal(monitorPoint);
        calculator.count(monitorPoint);
    }

    @Override
    public MonitorPoint getCurrentPoint() {
        throw new IllegalArgumentException();
    }
}
