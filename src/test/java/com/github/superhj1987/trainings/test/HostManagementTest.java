package com.github.superhj1987.trainings.test;

import com.github.superhj1987.trainings.util.HostManagement;
import org.junit.Test;

/**
 * Author: Bryant Hang
 * Date: 16/8/5
 * Time: 16:15
 */
public class HostManagementTest {

    @Test
    public void test() throws Exception {
        new HostManagement().powerOnHost("00-21-85-6D-50-62");
        new HostManagement().powerOnHost("00-21-85-6D-50-5D");
    }
}
