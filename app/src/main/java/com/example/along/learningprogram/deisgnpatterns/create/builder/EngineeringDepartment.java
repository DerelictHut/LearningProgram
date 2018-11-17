package com.example.along.learningprogram.deisgnpatterns.create.builder;

/**
 * @author $汪金龙$
 * @desc 工程部门作为指挥者，可以指导生产部门作业
 * @date 2018/11/12 14:16
 */
public class EngineeringDepartment {
    private AbstractCarBuilder mBuilder;

    public EngineeringDepartment(AbstractCarBuilder builder) {
        mBuilder = builder;
    }

    /**
     * 组装
     */
    public void Construct(String material, String type, String configuration) {
        mBuilder.makeMaterial(material);
        mBuilder.makeType(type);
        mBuilder.makeConfiguration(configuration);
    }
}
