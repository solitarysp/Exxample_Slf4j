package demo;

import org.apache.commons.logging.LogFactory;

public class CommonUsingSlf4jWithAdapter {
    // org.apache.commons.logging.impl.Jdk14Logger impl
    public static void main(String[] args) {
        UsingCommonLog();
        UsingCommonLogUsingSlf4jNotAdepter();
    }

    private static void UsingCommonLogUsingSlf4jNotAdepter() {
        // không được vì không cùng loại, LogFactory này của  commons
        //org.slf4j.Logger log = LogFactory.getLog(MainNotUsingSlf4j.class);


        // Sử dụng slf4j nhưng không có adper nên sẽ báo lỗi không tìm thấy binder
        org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CommonUsingSlf4jWithAdapter.class);
        log.info("ClassName : "+log.getClass().getName()+" , MSG : test");

    }

    private static void UsingCommonLog() {
        org.apache.commons.logging.Log log = LogFactory.getLog(CommonUsingSlf4jWithAdapter.class);
        log.info("ClassName : "+log.getClass().getName()+" , MSG : test");
    }
}
