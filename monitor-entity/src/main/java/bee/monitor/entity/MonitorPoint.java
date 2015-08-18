package bee.monitor.entity;

/**
 * Created by zhangsx on 15/8/18.
 * 监控点,客户端埋点数据结构
 */
public class MonitorPoint {
    //前缀 例:10.65.198.1
    private String prefix;
    //后缀 例:堆内存剩余空间
    private String Suffix;
    //值 例:100.00
    private double value;
    //时间戳 例:1919388329832
    private long timeStamp;
    //计量单位 例:MB
//    private String unit;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return Suffix;
    }

    public void setSuffix(String suffix) {
        Suffix = suffix;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

//    public String getUnit() {
//        return unit;
//    }
//
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }
}
