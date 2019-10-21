package com.example.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

import java.util.Date;

public class JodaTimeUtil {

//    而我给的建议是，仔细考虑如何写代码，然后再去写，不是说所有的时间操作都用 Calendar 或 Date 去解决，一定要看场景。
//
//    对于时间的计算我们要考虑 joda-time 这种类似的成熟时间计算框架来写代码，它会让代码更加简洁和易读。

    final DateTime DISTRIBUTION_TIME_SPLIT_TIME = new DateTime().withTime(15,0,0,0);

    /**
     * 需求：
     *    如果今天下午 3 点前进行下单，那么发货时间是明天，
     *    如果今天下午 3 点后进行下单，那么发货时间是后天，
     *    如果被确定的时间是周日，那么在此时间上再加 1 天为发货时间。
     * tips：
     *    不是说所有的时间操作都用 Calendar 或 Date 去解决，一定要看场景
     *    对于时间的计算我们要考虑 joda-time 这种类似的成熟时间计算框架来写代码，它会让代码更加简洁和易读。
     * @param orderCreateTime
     * @return
     */
    private Date calculateDistributionTimeByOrderCreateTime(Date orderCreateTime){
        DateTime orderCreateDateTime = new DateTime(orderCreateTime);
        Date tomorrow = orderCreateDateTime.plusDays(1).toDate();
        Date theDayAfterTomorrow = orderCreateDateTime.plusDays(2).toDate();
        return orderCreateDateTime.isAfter(DISTRIBUTION_TIME_SPLIT_TIME) ? wrapDistributionTime(theDayAfterTomorrow) : wrapDistributionTime(tomorrow);
    }
    private Date wrapDistributionTime(Date distributionTime){
        DateTime currentDistributionDateTime = new DateTime(distributionTime);
        DateTime plusOneDay = currentDistributionDateTime.plusDays(1);
        boolean isSunday = (DateTimeConstants.SUNDAY == currentDistributionDateTime.getDayOfWeek());
        return isSunday ? plusOneDay.toDate() : currentDistributionDateTime.toDate() ;
    }

    public static void main(String[] args) {
        JodaTimeUtil jodaTimeUtil = new JodaTimeUtil();
        System.out.println(jodaTimeUtil.calculateDistributionTimeByOrderCreateTime(new Date()));
    }
}
