module spark {
    exports spark;
    exports spark.utils;
    exports spark.serialization;

    requires java.sql;

    requires org.eclipse.jetty.websocket.jetty.server;
    requires org.eclipse.jetty.websocket.servlet;
    requires org.eclipse.jetty.websocket.core.server;
    requires org.slf4j;
}
