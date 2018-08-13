/*
  Copyright 2018 Sohu.com Inc. All Rights Reserved.
 */

package zkw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created @ 2018-08-12 16:15
 *
 * @author Zhang Kaiwei(kaiweizhang@sohu-inc.com)
 * @version 1.0
 */
@RestController
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/check")
    public String checkAlive() {
        return "Alive!";
    }

}
