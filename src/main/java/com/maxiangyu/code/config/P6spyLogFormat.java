package com.maxiangyu.code.config;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;


/**
 * @author :马翔宇
 * @description
 * @date: 2024/6/25 19:30
 */
public class P6spyLogFormat implements MessageFormattingStrategy {

    /**
     * 日志格式化方式（打印SQL日志会进入此方法，耗时操作，生产环境不建议使用）
     *
     * @param connectionId: 连接ID
     * @param now:          当前时间
     * @param elapsed:      花费时间
     * @param category:     类别
     * @param prepared:     预编译SQL
     * @param sql:          最终执行的SQL
     * @param url:          数据库连接地址
     * @return 格式化日志结果
     * @date 2024/6/25 19:32
     **/
    @Override
    public String formatMessage(int connectionId, String now, long elapsed,
                                String category, String prepared, String sql,
                                String url) {
        return "SQL耗时:" + elapsed + "毫秒\n" + " 最终执行SQL:"  + sql.replaceAll("[\\s]+", " ") + "\n";
    }
}
