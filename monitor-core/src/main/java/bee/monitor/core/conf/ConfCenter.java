package bee.monitor.core.conf;

import bee.monitor.core.cal.Calculator;
import bee.monitor.entity.CountKV;
import bee.monitor.entity.MonitorPoint;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by zhangsx on 15/8/18.
 * 配置中心
 */
public class ConfCenter {
    private static final String separator = "$";
    private final HashMap<String ,String> map = new HashMap();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private HashMap<String,Calculator> cals = new HashMap<String, Calculator>();
    public void init() {
        //获取对应关系
        List<CountKV> countKVs = null;

        try {
            lock.writeLock();
            for (CountKV countKV : countKVs) {
                String prefix = countKV.getPrefix();
                String suffix = countKV.getSuffix();
                String key = prefix+separator+suffix;
                String cal = countKV.getCalculatorName();
                String unit = countKV.getUnit();
                String value = cal+separator+unit;

                map.put(key,value);
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    //根据前缀和后缀获取计算方式str
    public Calculator getCal(MonitorPoint monitorPoint) {
        try{
            lock.readLock().lock();
            String key = monitorPoint.getPrefix()+separator+monitorPoint.getSuffix();
            String value = map.get(key);
            if(value==null||value.length()==0){
                throw new IllegalArgumentException("no corresponding prefix and suffix");
            }
            String[] calAndUnit = value.split(separator);
            if(calAndUnit==null||calAndUnit.length!=2){
                throw new IllegalArgumentException("calAndUnit s length is not 2");
            }
            return cals.get(calAndUnit[0]);
        }finally {
            lock.readLock().unlock();
        }
    }

    public String getUnitStr(MonitorPoint monitorPoint) {
        try{
            lock.readLock().lock();
            String key = monitorPoint.getPrefix()+separator+monitorPoint.getSuffix();
            String value = map.get(key);
            if(value==null||value.length()==0){
                throw new IllegalArgumentException("no corresponding prefix and suffix");
            }
            String[] calAndUnit = value.split(separator);
            if(calAndUnit==null||calAndUnit.length!=2){
                throw new IllegalArgumentException("calAndUnit s length is not 2");
            }
            return calAndUnit[1];
        }finally {
            lock.readLock().unlock();
        }
    }

}
