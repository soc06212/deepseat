package com.deepseat.server.DeepSeatServer.vo

class DocumentVO(
    var docId: Int,
    var userId: String,
    var nickname: String,
    var roomName: String,
    var seatName: String,
    var content: String,
    var wrote: String,
    var edited: Boolean,
    var comments: Int,
    var liked: Int,
    var iLiked: Boolean
)