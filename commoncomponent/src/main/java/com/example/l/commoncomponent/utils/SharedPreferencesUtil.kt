package com.example.l.commoncomponent.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import com.example.l.commoncomponent.NAME_SHARED_PREFERENCES

import com.example.lon.baselibary.BaseApplication

/**
 * @author $汪金龙$
 * @desc SharedPreferences工具
 * @date 2018/10/19 13:17
 */
@SuppressLint("CommitPrefEdits")
class SharedPreferencesUtil private constructor() {
    private val mPreferences: SharedPreferences = BaseApplication.getApplication()
            .getSharedPreferences(NAME_SHARED_PREFERENCES, Context.MODE_PRIVATE)
    private val mEditor: SharedPreferences.Editor = mPreferences.edit()

    /**
     * ------- Int ---------
     */
    fun putInt(spName: String, value: Int): Boolean {
        mEditor.putInt(spName, value)
        return mEditor.commit()
    }

    fun getInt(spName: String, defValue: Int): Int {
        return mPreferences.getInt(spName, defValue)
    }

    /**
     * ------- String ---------
     */
    fun putString(spName: String, value: String): Boolean {
        mEditor.putString(spName, value)
        return mEditor.commit()
    }

    fun getString(spName: String, defValue: String): String? {
        return mPreferences.getString(spName, defValue)
    }

    fun getString(spName: String): String {
        return mPreferences.getString(spName, "")
    }

    /**
     * ------- boolean ---------
     */
    fun putBoolean(key: String, value: Boolean): Boolean {
        mEditor.putBoolean(key, value)
        return mEditor.commit()
    }

    fun getBoolean(key: String, defValue: Boolean): Boolean {
        return mPreferences.getBoolean(key, defValue)
    }

    /**
     * ------- float ---------
     */
    fun putFloat(key: String, value: Float): Boolean {
        mEditor.putFloat(key, value)
        return mEditor.commit()
    }

    fun getFloat(key: String, defValue: Float): Float {
        return mPreferences.getFloat(key, defValue)
    }

    /**
     * ------- long ---------
     */
    fun putLong(key: String, value: Long): Boolean {
        mEditor.putLong(key, value)
        return mEditor.commit()
    }

    fun getLong(key: String, defValue: Long): Long {
        return mPreferences.getLong(key, defValue)
    }

    /**
     * 清空SP里所有数据 谨慎调用
     */
    fun clear(): Boolean {
        //清空
        mEditor.clear()
        //提交
        return mEditor.commit()
    }

    /**
     * 删除SP里指定key对应的数据项
     */
    fun remove(key: String): Boolean {
        //删除掉指定的值
        mEditor.remove(key)
        //提交
        return mEditor.commit()
    }

    /**
     * 查看sp文件里面是否存在此key
     */
    operator fun contains(key: String): Boolean {
        return mPreferences.contains(key)
    }

    /**
     * companion object主要修饰静态方法
     * 使用object修饰的类为单利模式
     */
    companion object {
        @Volatile
        private var mInstance: SharedPreferencesUtil? = null

        fun getInstance(): SharedPreferencesUtil? {
            if (mInstance == null) {
                synchronized(SharedPreferencesUtil::class.java) {
                    if (mInstance == null) {
                        mInstance = SharedPreferencesUtil()
                    }
                }
            }
            return mInstance
        }
    }
}
