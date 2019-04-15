package lab10.view;

import org.apache.log4j.Logger;

public class Printer {

    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }

    public static void print(Object msg) {
        LOG.info(msg);

    }

}
