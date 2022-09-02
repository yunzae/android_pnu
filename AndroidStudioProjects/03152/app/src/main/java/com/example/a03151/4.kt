package com.example.a03151
import java.io.*
import java.lang.*
import kotlin.math.*

fun main()= with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()

    var T = IntArray(N + 10)
    var P = IntArray(N + 10)
    var dp = IntArray(N + 10)

    var max = 0

    for(i in 0..(N-1) step(1)){
        val input = readLine()!!.split(" ").map{it.toInt()}
        T[i] = input[0]
        P[i] = input[1]
    }
    for (i in T.indices) {
        val nx = i + T[i]
        if (i > 0) dp[i] = max(dp[i], dp[i-1])
        if (nx > N) continue
        dp[nx] = max(dp[nx], dp[i] + P[i])

    }
    if (dp[N]>dp[N-1])
        max = dp[N]
    else
        max = dp[N-1]

    println(max)

    close()
}