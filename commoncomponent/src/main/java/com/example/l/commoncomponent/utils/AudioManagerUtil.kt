package com.example.l.commoncomponent.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.media.AudioManager

@SuppressLint("StaticFieldLeak")
/**
 *@author $汪金龙$
 *@desc 系统声音模式设置工具类
 *@date 2018/11/5 16:07
 */
class AudioManagerUtil constructor(private var context: Context) {
    private var audioManager: AudioManager =
            context.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    /**
     * 设置是否使用扬声器
     */
    fun setSpeakerphoneOn(on: Boolean) {
        if (on) {
            if (this.audioManager.isSpeakerphoneOn) return
            this.audioManager.isSpeakerphoneOn = true
        } else {
            this.audioManager.isSpeakerphoneOn = false
            (context as Activity).volumeControlStream = AudioManager.STREAM_VOICE_CALL
            //把声音设定成Earpiece（听筒）出来，设定为正在通话中
            this.audioManager.mode = AudioManager.MODE_IN_CALL
        }
    }

    /**
     * 是否是扬声器模式
     */
    fun isSpeakerphoneOn(): Boolean {
        return this.audioManager.isSpeakerphoneOn
    }

    /**
     * 设置静音
     *
     * @param on true: 静音  false: 正常
     */
    fun setSilentOn(on: Boolean) {
        if (on) {
            if (this.audioManager.ringerMode == AudioManager.RINGER_MODE_SILENT) return
            this.audioManager.ringerMode = AudioManager.RINGER_MODE_SILENT
        } else {
            this.audioManager.ringerMode = AudioManager.RINGER_MODE_NORMAL
        }
    }

    /**
     * 是否是静音模式
     */
    fun isSlientOn(): Boolean {
        return this.audioManager.ringerMode == AudioManager.RINGER_MODE_SILENT
                || this.audioManager.ringerMode == AudioManager.RINGER_MODE_VIBRATE
    }
}