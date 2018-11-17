package com.example.along.learningprogram.deisgnpatterns.create.prototype;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 原型模式
 * <p>原型模式虽然是创建型的模式，但是与工程模式没有关系，
 * 从名字即可看出，该模式的思想就是将一个对象作为原型，
 * 对其进行复制、克隆，产生一个和原对象类似的新对象</>
 * <p>可以和工厂方法模式一起使用</>
 * <p>浅度克隆(浅拷贝)
 * 只负责克隆按值传递的数据（比如基本数据类型、String类型），而不复制它所引用的对象，
 * 换言之，所有的对其他对象的引用都仍然指向原来的对象。
 * 深度克隆(深拷贝)
 * 除了浅度克隆要克隆的值外，还负责克隆引用类型的数据。那些引用其他对象的变量将指向被复制过的新对象，
 * 而不再是原有的那些被引用的对象。换言之，深度克隆把要复制的对象所引用的对象都复制了一遍，
 * 而这种对被引用到的对象的复制叫做间接复制。</>
 * <p>Java中任何实现了Cloneable接口的类都可以通过调用clone()方法来复制一份自身然后传给调用者。一般而言，clone()方法满足：
 * (1) 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象。
 * (2) 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
 * (3) 如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。</>
 * <p>一般需要重写clone的equals方法以满足上边第三个条件
 * (1)当obj1.equals(obj2)为true时，obj1.hashCode() == obj2.hashCode()必须为true
 * (2)当obj1.hashCode() == obj2.hashCode()为false时，obj1.equals(obj2)必须为false
 * <p>Java对于equals方法和hashCode方法是这样规定的：
 * (1) 如果两个对象相同，那么它们的hashCode值一定要相同。也告诉我们重写equals方法，一定要重写hashCode方法。
 * (2) 如果两个对象的hashCode相同，它们并不一定相同，这里的对象相同指的是用equals方法比较。</>
 * <p>哈希值的特点：
 * (1)一定程度的唯一性；
 * (2)长度固定；
 * (3)哈希值是二进制值；
 * (4)要找到生成相同哈希值的2个不同输入，在有限时间内是不可能的；哈希算法应用于加密领域的原因。</>
 * <p>equals 方法在非空对象引用上实现相等关系：
 * <p>
 * 自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true。
 * 对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true。
 * 传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true，那么 x.equals(z) 应返回 true。
 * 一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false，前提是对象上 equals 比较中所用的信息没有被修改。
 * 对于任何非空引用值 x，x.equals(null) 都应返回 false。
 * Object 类的 equals 方法实现对象上差别可能性最大的相等关系；即，对于任何非空引用值 x 和 y，
 * 当且仅当 x 和 y 引用同一个对象时，此方法才返回 true（x == y 具有值 true）</>
 * <p>深拷贝
 * (1)让Address实现cloneable接口，然后在Customer中deepClone里进行Address的拷贝
 * (2)使用序列化的方式进行克隆，序列化来实现深拷贝简单。但是，
 * 所涉及到的所有对象都的实现序列化接口
 * (3)其他方式</>
 * @date 2018/11/10 14:38
 */
@SuppressLint("SetTextI18n")
public class PrototypeActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;
    private Book mBook;
    private Book mCloneBook;
    private Customer mCustomer;
    private Customer mCloneCustomer;
    private Address mAddress;
    /**
     * 点击那条进行的复制
     */
    private int mClickType;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mBook = new Book();
        mBook.setName("Java从入门到入土");
        mGeneralList.setPrompt("原型模式");
        mGeneralList.addData("Cloneable接口，类中不含有成员对象(浅克隆)");
        mGeneralList.addData("Cloneable接口，类中含有成员对象(浅克隆)");
        mGeneralList.addData("Cloneable接口，类中含有成员对象(深克隆)");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 0) {
                mClickType = position;
                mCloneBook = mBook.clone();
                mTvResult.setText("结果：复制了一本名为《" + mCloneBook.getName() + "》的书");
                mGeneralList.limit(3);
                mGeneralList.addData("x.clone() != x验证");
                mGeneralList.addData("x.clone().getClass() == x.getClass()验证");
                mGeneralList.addData("x.clone().equals(x)验证");
            } else if (position == 1 || position == 2) {
                mClickType = position;
                mAddress = new Address("中国", "黑龙江", "哈尔滨");
                mCustomer = new Customer("张三", mAddress);
                if (position == 1) {
                    mCloneCustomer = mCustomer.clone();
                } else {
                    //Address实现Cloneable方式的深克隆mCloneCustomer = mCustomer.deepClone()
                    mCloneCustomer = mCustomer.deepClone(mCustomer);
                }
                mTvResult.setText("结果：原客户地址：" + mCustomer.getAddress().toString() + "名字：" + mCustomer.getName()
                        + "\n复制的客户地址：" + mCloneCustomer.getAddress().toString() + "名字：" + mCloneCustomer.getName());
                mGeneralList.limit(3);
                mGeneralList.addData("x.clone() != x验证");
                mGeneralList.addData("x.clone().getClass() == x.getClass()验证");
                mGeneralList.addData("x.clone().equals(x)验证");
                mGeneralList.addData("更改原客户的地址和名字");
            } else if (position == 3) {
                if (mClickType == 0) {
                    mTvResult.setText("结果：x.clone() != x为" + (mBook != mCloneBook));
                } else {
                    mTvResult.setText("结果：x.clone() != x为" + (mCustomer != mCloneCustomer));
                }
            } else if (position == 4) {
                if (mClickType == 0) {
                    mTvResult.setText("结果：x.clone().getClass() == x.getClass()为" +
                            (mBook.getClass() == mCloneBook.getClass()));
                } else {
                    mTvResult.setText("结果：x.clone().getClass() == x.getClass()为" +
                            (mCustomer.getClass() == mCloneCustomer.getClass()));
                }
            } else if (position == 5) {
                if (mClickType == 0) {
                    mTvResult.setText("结果：x.clone().equals(x)为" +
                            mBook.equals(mCloneBook));
                } else {
                    mTvResult.setText("结果：x.clone().equals(x)为" +
                            mCustomer.equals(mCloneCustomer));
                }
            } else if (position == 6) {
                mCustomer.getAddress().setCity("大庆");
                mCustomer.setName("李四");
                if (mClickType == 1) {
                    mTvResult.setText("结果：原客户地址：" + mCustomer.getAddress().toString() + "名字：" + mCustomer.getName()
                            + "\n复制的客户地址：" + mCloneCustomer.getAddress().toString() + "名字：" + mCloneCustomer.getName()
                            + "\n结论：浅克隆未克隆成员对象，导致原客户地址修改克隆的客户地址也改变了！！！");
                } else {
                    mTvResult.setText("结果：原客户地址：" + mCustomer.getAddress().toString() + "名字：" + mCustomer.getName()
                            + "\n复制的客户地址：" + mCloneCustomer.getAddress().toString() + "名字：" + mCloneCustomer.getName()
                            + "\n结论：深克隆克隆了成员对象，所以原客户地址修改克隆的客户地址未改变！！！");
                }
            }
        });
    }

    /**
     * 请求
     */
    @Override
    protected void request() {

    }

    /**
     * 添加布局
     *
     * @param savedInstanceState 保存状态
     * @return 返回布局id
     */
    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.deisgnpatterns_activity_prototype;
    }

    /**
     * 先放在这里
     * 功能用于计算radix进制
     * 例如int[] a = int[5]{1,3,4,5,6}
     * radix = 31
     * result：13456作为31进制数转化为10进制的值
     * java中string中的hashcode使用的为31进制数
     *
     * @return 返回radix对应的进制数
     */
    private static int calculate(int radix, int[] a) {
        int sum = 0;
        for (int anA : a) {
            sum = sum * radix + anA;
        }
        return sum;
    }
}
