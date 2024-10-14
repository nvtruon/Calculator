package com.example.constraintc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textResult: TextView

    var state: Int = 1
    var op: Int = 0
    var op1: Int = 0
    var op2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResult = findViewById(R.id.text_result)

        findViewById<Button>(R.id.button).setOnClickListener(this)
        findViewById<Button>(R.id.button2).setOnClickListener(this)
        findViewById<Button>(R.id.button3).setOnClickListener(this)
        findViewById<Button>(R.id.button4).setOnClickListener(this)
        findViewById<Button>(R.id.button5).setOnClickListener(this)
        findViewById<Button>(R.id.button6).setOnClickListener(this)
        findViewById<Button>(R.id.button7).setOnClickListener(this)
        findViewById<Button>(R.id.button8).setOnClickListener(this)
        findViewById<Button>(R.id.button9).setOnClickListener(this)
        findViewById<Button>(R.id.button10).setOnClickListener(this)
        findViewById<Button>(R.id.button11).setOnClickListener(this)
        findViewById<Button>(R.id.button12).setOnClickListener(this)
        findViewById<Button>(R.id.button13).setOnClickListener(this)
        findViewById<Button>(R.id.button14).setOnClickListener(this)
        findViewById<Button>(R.id.button15).setOnClickListener(this)
        findViewById<Button>(R.id.button16).setOnClickListener(this)
        findViewById<Button>(R.id.button17).setOnClickListener(this)
        findViewById<Button>(R.id.button18).setOnClickListener(this)
        findViewById<Button>(R.id.button19).setOnClickListener(this)
        findViewById<Button>(R.id.button20).setOnClickListener(this)
    }

    private fun addDigit(c: Int) {
        if (state == 1) {
            op1 = op1 * 10 + c
            textResult.text = "$op1"
        } else {
            op2 = op2 * 10 + c
            textResult.text = "$op2"
        }
    }

    override fun onClick(p0: View?) {
        val id = p0?.id
        if (id == R.id.button2) {
            addDigit(0)
        } else if (id == R.id.button5) {
            addDigit(1)
        } else if (id == R.id.button6) {
            addDigit(2)
        } else if (id == R.id.button7) {
            addDigit(3)
        } else if (id == R.id.button9) {
            addDigit(4)
        } else if (id == R.id.button10) {
            addDigit(5)
        } else if (id == R.id.button11) {
            addDigit(6)
        } else if (id == R.id.button13) {
            addDigit(7)
        } else if (id == R.id.button14) {
            addDigit(8)
        } else if (id == R.id.button15) {
            addDigit(9)
        } else if (id == R.id.button8) {
            op = 1
            state = 2
        } else if (id == R.id.button12) {
            op = 2
            state = 2
        } else if (id == R.id.button16) {
            op = 3
            state = 2
        } else if (id == R.id.button20) {
            op = 4
            state = 2
        } else if (id == R.id.button4) {
            var result = 0
            if (op == 1) {
                result = op1 + op2
            } else if (op == 2) {
                result = op1 - op2
            } else if (op == 3) {
                result = op1 * op2
            } else if (op == 4) {
                result = op1 / op2
            }
            textResult.text = "$result"
            state = 1
            op1 = 0
            op2 = 0
            op = 0
        }

    }
}
