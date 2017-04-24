package com.example.leeeyou.zhihuribao.data.service

import com.example.leeeyou.zhihuribao.data.model.one.Index
import retrofit.http.GET
import retrofit.http.Path
import rx.Observable

/**
 * Created by leeeyou on 2017/4/24.
 */
interface OneService {
    @GET("/api/onelist/{id}/0?cchannel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getIndexList(@Path("id") id: Int): Observable<Index>
}