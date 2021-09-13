package com.egiwon.data.response

internal interface DataToDomainMapper<T> {
    fun toDomain(): T
}
