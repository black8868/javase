package cn.com.xiaoyao;

import javax.swing.*;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao
 * @ClassName: KCB
 * @Author: zhangkaixuan
 * @Description:
 * @Date: 2020/5/22
 * @Version: 1.0
 */
public class KCB {


    public static void main(String[] args) {
         JFrame jFrame = new JFrame();
         JTable jTable = new JTable(new TableDate());
         JScrollPane jScrollPane = new JScrollPane(jTable);
         jFrame.add(jScrollPane);
         jFrame.pack();
         jFrame.setVisible(true);

    }

}
