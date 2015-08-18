package bee.monitor.core.cal;

import bee.monitor.entity.MonitorPoint;

/**
 * Created by zhangsx on 15/8/18.
 */
public interface Calculator {
    void count(MonitorPoint monitorPoint);
    MonitorPoint getCurrentPoint();
}
