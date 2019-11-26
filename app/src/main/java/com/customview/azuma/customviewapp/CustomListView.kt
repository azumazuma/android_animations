package com.customview.azuma.customviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.azuma.android_animation.animation.*
import com.customview.azuma.customviewapp.databinding.ListCellBinding

class CustomListView(private val context: Context,private val targetView: View) : BaseAdapter() {
    private var animList: List<String> = listOf(
        "Bound.inSideCenter",
        "Bound.inSideTop",
        "Bound.inSideTopLeft",
        "Bound.inSideTopRight",
        "Bound.inSideBottom",
        "Bound.inSideRight",
        "Bound.inSideLeft",
        "Door.topOpen",
        "Door.topClose",
        "Door.bottomOpen",
        "Door.bottomClose",
        "Door.leftOpen",
        "Door.leftClose",
        "Door.rightOpen",
        "Door.rightClose",
        "Extend.widthSmall",
        "Extend.widthBig",
        "Extend.heightSmall",
        "Extend.heightBig",
        "Extend.small",
        "Extend.big",
        "Flash.week",
        "Flash.medium",
        "Flash.strength",
        "Roll.inSideTop",
        "Roll.outSideTop",
        "Roll.inSideBottom",
        "Roll.outSideBottom",
        "Roll.inSideLeft",
        "Roll.outSideLeft",
        "Roll.inSideRight",
        "Roll.outSideRight",
        "Shake.week",
        "Shake.medium",
        "Shake.strength",
        "Slip.inSideTop",
        "Slip.outSideTop",
        "Slip.inSideBottom",
        "Slip.outSideBottom",
        "Slip.inSideRight",
        "Slip.outSideRight",
        "Slip.inSideLeft",
        "Slip.outSideLeft",
        "Snap.inSideX",
        "Snap.outSideX",
        "Snap.inSideY",
        "Snap.outSideY",
        "Turn.inSide",
        "Turn.outSide",
        "Turn.inSideAxisTopLeft",
        "Turn.outSideAxisTopLeft",
        "Turn.inSideAxisTopRight",
        "Turn.outSideAxisTopRight",
        "Turn.inSideAxisBottomLeft",
        "Turn.outSideAxisBottomLeft",
        "Turn.inSideAxisBottomRight",
        "Turn.outSideAxisBottomRight",
        "Zoom.inSide",
        "Zoom.outSide",
        "Zoom.inSideTop",
        "Zoom.outSideTop",
        "Zoom.inSideBottom",
        "Zoom.outSideBottom",
        "Zoom.inSideLeft",
        "Zoom.outSideLeft",
        "Zoom.inSideRight",
        "Zoom.outSideRight"
        )
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding: ListCellBinding

        if (convertView == null) {
            binding = ListCellBinding.inflate(LayoutInflater.from(context), parent, false)
            binding.root.tag = binding
        } else {
            binding = convertView.tag as ListCellBinding
        }

        binding.title.text = animList[position]

        binding.root.setOnClickListener {
            animationStart(position)
        }

        return binding.root
    }

    override fun getItem(position: Int): Any {
        return animList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return animList.size
    }

    private fun animationStart(position: Int) {
        changeImage()
        when (position) {
            0 -> {
                Bound().inSideCenter(targetView).start()
            }
            1 -> {
                Bound().inSideTop(targetView).start()
            }
            2 -> {
                Bound().inSideTopLeft(targetView).start()
            }
            3 -> {
                Bound().inSideTopRight(targetView).start()
            }
            4 -> {
                Bound().inSideBottom(targetView).start()
            }
            5 -> {
                Bound().inSideRight(targetView).start()
            }
            6 -> {
                Bound().inSideLeft(targetView).start()
            }
            7 -> {
                Door().topOpen(targetView).start()
            }
            8 -> {
                Door().topClose(targetView).start()
            }
            9 -> {
                Door().bottomOpen(targetView).start()
            }
            10 -> {
                Door().bottomClose(targetView).start()
            }
            11 -> {
                Door().leftOpen(targetView).start()
            }
            12 -> {
                Door().leftClose(targetView).start()
            }
            13 -> {
                Door().rightOpen(targetView).start()
            }
            14 -> {
                Door().rightClose(targetView).start()
            }
            15 -> {
                Extend().widthSmall(targetView).start()
            }
            16 -> {
                Extend().widthBig(targetView).start()
            }
            17 -> {
                Extend().heightSmall(targetView).start()
            }
            18 -> {
                Extend().heightBig(targetView).start()
            }
            19 -> {
                Extend().small(targetView).start()
            }
            20 -> {
                Extend().big(targetView).start()
            }
            21 -> {
                Flash().week(targetView).start()
            }
            22 -> {
                Flash().medium(targetView).start()
            }
            23 -> {
                Flash().strength(targetView).start()
            }
            24 -> {
                Roll().inSideTop(targetView).start()
            }
            25 -> {
                Roll().outSideTop(targetView).start()
            }
            26 -> {
                Roll().inSideBottom(targetView).start()
            }
            27 -> {
                Roll().outSideBottom(targetView).start()
            }
            28 -> {
                Roll().inSideLeft(targetView).start()
            }
            29 -> {
                Roll().outSideLeft(targetView).start()
            }
            30 -> {
                Roll().inSideRight(targetView).start()
            }
            31 -> {
                Roll().outSideRight(targetView).start()
            }
            32 -> {
                Shake().week(targetView).start()
            }
            33 -> {
                Shake().medium(targetView).start()
            }
            34 -> {
                Shake().strength(targetView).start()
            }
            35 -> {
                Slip().inSideTop(targetView).start()
            }
            36 -> {
                Slip().outSideTop(targetView).start()
            }
            37 -> {
                Slip().inSideBottom(targetView).start()
            }
            38 -> {
                Slip().outSideBottom(targetView).start()
            }
            39 -> {
                Slip().inSideRight(targetView).start()
            }
            40 -> {
                Slip().outSideRight(targetView).start()
            }
            41 -> {
                Slip().inSideLeft(targetView).start()
            }
            42 -> {
                Slip().outSideLeft(targetView).start()
            }
            43 -> {
                Snap().inSideX(targetView).start()
            }
            44 -> {
                Snap().outSideX(targetView).start()
            }
            45 -> {
                Snap().inSideY(targetView).start()
            }
            46 -> {
                Snap().outSideY(targetView).start()
            }
            47 -> {
                Turn().inSide(targetView).start()
            }
            48 -> {
                Turn().outSide(targetView).start()
            }
            49 -> {
                Turn().inSideAxisTopLeft(targetView).start()
            }
            50 -> {
                Turn().outSideAxisTopLeft(targetView).start()
            }
            51 -> {
                Turn().inSideAxisTopRight(targetView).start()
            }
            52 -> {
                Turn().outSideAxisTopRight(targetView).start()
            }
            53 -> {
                Turn().inSideAxisBottomLeft(targetView).start()
            }
            54 -> {
                Turn().outSideAxisBottomLeft(targetView).start()
            }
            55 -> {
                Turn().inSideAxisBottomRight(targetView).start()
            }
            56 -> {
                Turn().outSideAxisBottomRight(targetView).start()
            }
            57 -> {
                Zoom().inSide(targetView).start()
            }
            58 -> {
                Zoom().outSide(targetView).start()
            }
            59 -> {
                Zoom().inSideTop(targetView).start()
            }
            60 -> {
                Zoom().outSideTop(targetView).start()
            }
            61 -> {
                Zoom().inSideBottom(targetView).start()
            }
            62 -> {
                Zoom().outSideBottom(targetView).start()
            }
            63 -> {
                Zoom().inSideLeft(targetView).start()
            }
            64 -> {
                Zoom().outSideLeft(targetView).start()
            }
            65 -> {
                Zoom().inSideRight(targetView).start()
            }
            66 -> {
                Zoom().outSideRight(targetView).start()
            }
        }
    }

    private fun changeImage() {
        val random = Math.random()
        targetView.background = when (random) {
            in 0f..0.1f -> {
                context.resources.getDrawable(R.drawable.vancouver_4640671_1920, null)
            }
            in 0.1f..0.2f -> {
                context.resources.getDrawable(R.drawable.coast_4639430_1920, null)
            }
            in 0.2f..0.3f -> {
                context.resources.getDrawable(R.drawable.emoticons_4646833_1920, null)
            }
            in 0.3f..0.4f -> {
                context.resources.getDrawable(R.drawable.landscape_4637539_1920, null)
            }
            in 0.4f..0.5f -> {
                context.resources.getDrawable(R.drawable.lighthouse_4633290_1920, null)
            }
            in 0.5f..0.6f -> {
                context.resources.getDrawable(R.drawable.macro_4639241_1920, null)
            }
            in 0.6f..0.7f -> {
                context.resources.getDrawable(R.drawable.nature_4616282_1920, null)
            }
            in 0.7f..0.8f -> {
                context.resources.getDrawable(R.drawable.railway_station_4644316_1920, null)
            }
            in 0.8f..0.9f -> {
                context.resources.getDrawable(R.drawable.vancouver_4640671_1920, null)
            }
            else -> {
                context.resources.getDrawable(R.drawable.tree_4641910_1920, null)
            }
        }
    }
}