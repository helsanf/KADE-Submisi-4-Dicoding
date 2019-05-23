package com.example.helsanf.footballmatch.rest

interface RepositoryUnitTest<T> {
    fun onDataLoaded(data: T?)
    fun onDataError()
}