package com.example.demo2;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LController {
	private static Logger logger=Logger.getLogger(LController.class);
@RequestMapping("log")
public static String log() throws IOException {
	Layout layout=new SimpleLayout();
	Appender app=new FileAppender(layout,"C://Users//pvinod//Documents//mylogs//data.log");
    logger.addAppender(app);
    logger.debug("From DEBUG");
    logger.info("FROM INFO");
    logger.warn("From WARN");
    logger.error("From ERROR");
    logger.fatal("From FATAL");
	return "CHECK OUT THE LOGS TO SEE THE OUTPUT :\"C://Users//pvinod//Documents//mylogs//data.log\" ";
	
}
}
