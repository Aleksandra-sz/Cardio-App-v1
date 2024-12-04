package com.example.cardioapp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


public val Arrow_back_ios: ImageVector
    get() {
        if (_Arrow_back_ios != null) {
            return _Arrow_back_ios!!
        }
        _Arrow_back_ios = ImageVector.Builder(
            name = "Arrow_back_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(400f, 880f)
                lineTo(0f, 480f)
                lineToRelative(400f, -400f)
                lineToRelative(71f, 71f)
                lineToRelative(-329f, 329f)
                lineToRelative(329f, 329f)
                close()
            }
        }.build()
        return _Arrow_back_ios!!
    }

private var _Arrow_back_ios: ImageVector? = null




public val HeartPulse: ImageVector
    get() {
        if (_HeartPulse != null) {
            return _HeartPulse!!
        }
        _HeartPulse = ImageVector.Builder(
            name = "HeartPulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(19f, 14f)
                curveToRelative(1.49f, -1.46f, 3f, -3.21f, 3f, -5.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 3f)
                curveToRelative(-1.76f, 0f, -3f, 0.5f, -4.5f, 2f)
                curveToRelative(-1.5f, -1.5f, -2.74f, -2f, -4.5f, -2f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8.5f)
                curveToRelative(0f, 2.3f, 1.5f, 4.05f, 3f, 5.5f)
                lineToRelative(7f, 7f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(3.22f, 12f)
                horizontalLineTo(9.5f)
                lineToRelative(0.5f, -1f)
                lineToRelative(2f, 4.5f)
                lineToRelative(2f, -7f)
                lineToRelative(1.5f, 3.5f)
                horizontalLineToRelative(5.27f)
            }
        }.build()
        return _HeartPulse!!
    }

private var _HeartPulse: ImageVector? = null



public val Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) {
            return _Volunteer_activism!!
        }
        _Volunteer_activism = ImageVector.Builder(
            name = "Volunteer_activism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(640f, 520f)
                lineTo(474f, 358f)
                quadToRelative(-31f, -30f, -52.5f, -66.5f)
                reflectiveQuadTo(400f, 212f)
                quadToRelative(0f, -55f, 38.5f, -93.5f)
                reflectiveQuadTo(532f, 80f)
                quadToRelative(32f, 0f, 60f, 13.5f)
                reflectiveQuadToRelative(48f, 36.5f)
                quadToRelative(20f, -23f, 48f, -36.5f)
                reflectiveQuadToRelative(60f, -13.5f)
                quadToRelative(55f, 0f, 93.5f, 38.5f)
                reflectiveQuadTo(880f, 212f)
                quadToRelative(0f, 43f, -21f, 79.5f)
                reflectiveQuadTo(807f, 358f)
                close()
                moveToRelative(0f, -112f)
                lineToRelative(109f, -107f)
                quadToRelative(19f, -19f, 35f, -40.5f)
                reflectiveQuadToRelative(16f, -48.5f)
                quadToRelative(0f, -22f, -15f, -37f)
                reflectiveQuadToRelative(-37f, -15f)
                quadToRelative(-14f, 0f, -26.5f, 5.5f)
                reflectiveQuadTo(700f, 182f)
                lineToRelative(-60f, 72f)
                lineToRelative(-60f, -72f)
                quadToRelative(-9f, -11f, -21.5f, -16.5f)
                reflectiveQuadTo(532f, 160f)
                quadToRelative(-22f, 0f, -37f, 15f)
                reflectiveQuadToRelative(-15f, 37f)
                quadToRelative(0f, 27f, 16f, 48.5f)
                reflectiveQuadToRelative(35f, 40.5f)
                close()
                moveTo(280f, 740f)
                lineToRelative(278f, 76f)
                lineToRelative(238f, -74f)
                quadToRelative(-5f, -9f, -14.5f, -15.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineTo(558f)
                quadToRelative(-27f, 0f, -43f, -2f)
                reflectiveQuadToRelative(-33f, -8f)
                lineToRelative(-93f, -31f)
                lineToRelative(22f, -78f)
                lineToRelative(81f, 27f)
                quadToRelative(17f, 5f, 40f, 8f)
                reflectiveQuadToRelative(68f, 4f)
                quadToRelative(0f, -11f, -6.5f, -21f)
                reflectiveQuadTo(578f, 606f)
                lineToRelative(-234f, -86f)
                horizontalLineToRelative(-64f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(304f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(13f, 3.5f)
                lineToRelative(235f, 87f)
                quadToRelative(33f, 12f, 53.5f, 42f)
                reflectiveQuadToRelative(20.5f, 66f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, 33f)
                reflectiveQuadToRelative(35f, 87f)
                verticalLineToRelative(40f)
                lineTo(560f, 900f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(520f, -546f)
            }
        }.build()
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null





public val Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Hospital",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8.5f, 5.034f)
                verticalLineToRelative(1.1f)
                lineToRelative(0.953f, -0.55f)
                lineToRelative(0.5f, 0.867f)
                lineTo(9f, 7f)
                lineToRelative(0.953f, 0.55f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-0.953f, -0.55f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.1f)
                lineToRelative(-0.953f, 0.55f)
                lineToRelative(-0.5f, -0.866f)
                lineTo(7f, 7f)
                lineToRelative(-0.953f, -0.55f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(0.953f, 0.55f)
                verticalLineToRelative(-1.1f)
                close()
                moveTo(13.25f, 9f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.25f)
                close()
                moveTo(13f, 11.25f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                close()
                moveToRelative(0.25f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.25f)
                close()
                moveToRelative(-11f, -4f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.75f)
                verticalLineToRelative(-0.5f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 9f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.25f)
                close()
                moveTo(2f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveToRelative(2f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveToRelative(0f, -14f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(2f, 7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                close()
                moveToRelative(-8f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineToRelative(7f)
                close()
            }
        }.build()
        return _Hospital!!
    }

private var _Hospital: ImageVector? = null





public val Psychology_alt: ImageVector
    get() {
        if (_Psychology_alt != null) {
            return _Psychology_alt!!
        }
        _Psychology_alt = ImageVector.Builder(
            name = "Psychology_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-172f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(108f)
                lineToRelative(-38f, -155f)
                quadToRelative(-23f, -91f, -98f, -148f)
                reflectiveQuadToRelative(-172f, -57f)
                quadToRelative(-116f, 0f, -198f, 81f)
                reflectiveQuadToRelative(-82f, 197f)
                quadToRelative(0f, 60f, 24.5f, 114f)
                reflectiveQuadToRelative(69.5f, 96f)
                lineToRelative(26f, 24f)
                verticalLineToRelative(208f)
                close()
                moveToRelative(240f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                reflectiveQuadTo(440f, 600f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                reflectiveQuadTo(480f, 640f)
                moveToRelative(-30f, -128f)
                horizontalLineToRelative(61f)
                quadToRelative(0f, -25f, 6.5f, -40.5f)
                reflectiveQuadTo(544f, 434f)
                quadToRelative(18f, -20f, 35f, -40.5f)
                reflectiveQuadToRelative(17f, -53.5f)
                quadToRelative(0f, -42f, -32.5f, -71f)
                reflectiveQuadTo(483f, 240f)
                quadToRelative(-40f, 0f, -72.5f, 23f)
                reflectiveQuadTo(365f, 323f)
                lineToRelative(55f, 23f)
                quadToRelative(7f, -22f, 24.5f, -35.5f)
                reflectiveQuadTo(483f, 297f)
                quadToRelative(22f, 0f, 36.5f, 12f)
                reflectiveQuadToRelative(14.5f, 31f)
                quadToRelative(0f, 21f, -12.5f, 37.5f)
                reflectiveQuadTo(492f, 411f)
                quadToRelative(-20f, 21f, -31f, 42f)
                reflectiveQuadToRelative(-11f, 59f)
            }
        }.build()
        return _Psychology_alt!!
    }

private var _Psychology_alt: ImageVector? = null



public val Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -7f, -0.5f, -14.5f)
                reflectiveQuadTo(799f, 453f)
                quadToRelative(-5f, 29f, -27f, 48f)
                reflectiveQuadToRelative(-52f, 19f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 440f)
                verticalLineToRelative(-40f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -23f, 12.5f, -40.5f)
                reflectiveQuadTo(563f, 171f)
                quadToRelative(-20f, -5f, -40.5f, -8f)
                reflectiveQuadToRelative(-42.5f, -3f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                horizontalLineToRelative(200f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineTo(400f)
                verticalLineToRelative(110f)
                quadToRelative(20f, 5f, 39.5f, 7.5f)
                reflectiveQuadTo(480f, 800f)
            }
        }.build()
        return _Globe!!
    }

private var _Globe: ImageVector? = null



public val CheckSquare: ImageVector
    get() {
        if (_CheckSquare != null) {
            return _CheckSquare!!
        }
        _CheckSquare = ImageVector.Builder(
            name = "CheckSquare",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(14f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.97f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.071f, 1.05f)
                lineToRelative(-3.992f, 4.99f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.08f, 0.02f)
                lineTo(4.324f, 8.384f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(2.094f, 2.093f)
                lineToRelative(3.473f, -4.425f)
                close()
            }
        }.build()
        return _CheckSquare!!
    }

private var _CheckSquare: ImageVector? = null


public val PersonCircle: ImageVector
    get() {
        if (_PersonCircle != null) {
            return _PersonCircle!!
        }
        _PersonCircle = ImageVector.Builder(
            name = "PersonCircle",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                moveToRelative(8f, -7f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.468f, 11.37f)
                curveTo(3.242f, 11.226f, 4.805f, 10f, 8f, 10f)
                reflectiveCurveToRelative(4.757f, 1.225f, 5.468f, 2.37f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 1f)
            }
        }.build()
        return _PersonCircle!!
    }

private var _PersonCircle: ImageVector? = null

