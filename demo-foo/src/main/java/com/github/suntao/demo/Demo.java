/**
 * foo Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author suntao
 * @date 2018-10-09 14:19
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(appVersionAfterMixtrade("6.10.0.0", "6.10.0"));
    }

    public static boolean appVersionAfterMixtrade(String versionName, String target) {
        String currentHcbVersion = versionName;
        String[] currentHcbVersions = currentHcbVersion.split("\\.");/** 当前货车帮版本号 **/

        String targetHcbVersion = target;
        String[] targetHcbVersions = targetHcbVersion.split("\\.");/** 待比较的货车帮版本号 **/
        int biaoji = 0;
        String targetVersion = "";
        for (String hcbVersion : currentHcbVersions) {
            targetVersion = targetHcbVersions[biaoji];
            if (NumberUtils.isDigits(hcbVersion) && NumberUtils.isDigits(targetVersion)) {
                if (NumberUtils.toLong(hcbVersion) > NumberUtils.toLong(targetVersion)) {
                    return true;
                } else if (NumberUtils.toLong(hcbVersion) < NumberUtils.toLong(targetVersion)) {
                    return false;
                } else {
                    // 相等时，继续判断下一个部分的数字
                    biaoji++;
                    if (biaoji == currentHcbVersions.length) {
                        return true;
                    }
                    continue;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}