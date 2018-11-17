package com.example.along.learningprogram.deisgnpatterns.structured.facade;

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
 * @desc 外观模式
 * <p>该模式就是把一些复杂的流程封装成一个接口供给外部用户更简单的使用</>
 * <p>在以下情况下可以考虑使用外观模式：
 * (1) 当要为访问一系列复杂的子系统提供一个简单入口时可以使用外观模式
 * (2) 客户端程序与多个子系统之间存在很大的依赖性。引入外观类可以将子系统与客户端解耦，从而提高子系统的独立性和可移植性
 * (3) 在层次化结构中，可以使用外观模式定义系统中每一层的入口，层与层之间不直接产生联系，而通过外观类建立联系，降低层之间的耦合度</>
 * @date 2018/11/10 15:04
 */
public class FacadeActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;
    private Computer mComputer;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mGeneralList.setPrompt("外观模式");
        mGeneralList.addData("启动Computer");
        mGeneralList.addData("关闭Computer");
    }

    /**
     * 初始化监听
     */
    @SuppressLint("SetTextI18n")
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 0) {
                mComputer = new Computer();
                mTvResult.setText("结果：\n" + mComputer.start());
            } else if (position == 1) {
                if (mComputer == null) {
                    mTvResult.setText("结果：没开电脑你关个球");
                } else {
                    mTvResult.setText("结果：\n" + mComputer.shutDown());
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
        return R.layout.deisgnpatterns_activity_facade;
    }
}
