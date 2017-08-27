package com.example.weian.multimediaplayer

import android.media.MediaPlayer

/**
 * for controlling MediaPlayer
 *
 * Created by weian on 2017/8/27.
 */

class MediaPlayerProxy: IPlayer {
    private val mMediaPlayer = MediaPlayer()

    override fun play(uri: String) {
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun resume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isPlaying() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun current() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun duration() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}