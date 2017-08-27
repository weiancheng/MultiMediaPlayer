package com.example.weian.multimediaplayer

/**
 * an interface for controller multimedia player
 *
 * Created by weian on 2017/8/27.
 */

interface IPlayer {
    fun play(uri: String)
    fun stop()
    fun pause()
    fun resume()
    fun isPlaying()
    fun current()
    fun duration()
}