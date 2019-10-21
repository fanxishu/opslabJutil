package com.opslab.util.xml;

import com.opslab.bean.ItvSysFamilyList;
import com.opslab.util.XMLUtil;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlFanilyToBean {
    private static final Logger logger = LoggerFactory.getLogger(XmlFanilyToBean.class);

    @Test
    @Ignore
    public void test(){
        String localFile="F:\\idea\\opslabJutil\\src\\test\\resource\\text\\FAMILY_MEMBER_SYNC_20190926_00.txt";
        logger.info("---将File类型的xml转换成对象 Start---");
        ItvSysFamilyList    itvSysFamilyList = (ItvSysFamilyList) XMLUtil.convertXmlFileToObject(ItvSysFamilyList.class, localFile);
        logger.info("---将File类型的xml转换成对象 End---"+itvSysFamilyList.toString());
        System.out.println("---将File类型的xml转换成对象 End---"+itvSysFamilyList.toString());
    }
}
