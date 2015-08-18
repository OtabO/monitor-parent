package bee.monitor.core.cal;

import bee.monitor.core.pro.Postprocessor;
import bee.monitor.entity.MonitorPoint;

/**
 * Created by zhangsx on 15/8/18.
 */
public abstract class ValveCalculator implements Calculator{
    private Postprocessor postprocessor;
    public void value(MonitorPoint monitorPoint){
        //计算
        count(monitorPoint);
        //获取当前点
        MonitorPoint curr = getCurrentPoint();
        //TODO 阀值计算 触发action

        postprocessor.process(curr);
    }

}
