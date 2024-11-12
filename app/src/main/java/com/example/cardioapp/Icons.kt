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



public val Phonelink_setup: ImageVector
    get() {
        if (_Phonelink_setup != null) {
            return _Phonelink_setup!!
        }
        _Phonelink_setup = ImageVector.Builder(
            name = "Phonelink_setup",
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
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(400f, -160f)
                lineToRelative(-6f, -50f)
                quadToRelative(-8f, -3f, -14f, -6.5f)
                reflectiveQuadToRelative(-12f, -9.5f)
                lineToRelative(-46f, 20f)
                lineToRelative(-40f, -70f)
                lineToRelative(40f, -30f)
                quadToRelative(-2f, -8f, -2f, -15f)
                reflectiveQuadToRelative(2f, -15f)
                lineToRelative(-40f, -30f)
                lineToRelative(42f, -68f)
                lineToRelative(44f, 18f)
                quadToRelative(6f, -5f, 12f, -8f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(6f, -50f)
                horizontalLineToRelative(80f)
                lineToRelative(6f, 50f)
                quadToRelative(8f, 3f, 14f, 6f)
                reflectiveQuadToRelative(12f, 8f)
                lineToRelative(44f, -18f)
                lineToRelative(42f, 68f)
                lineToRelative(-40f, 30f)
                quadToRelative(2f, 8f, 2f, 15f)
                reflectiveQuadToRelative(-2f, 15f)
                lineToRelative(40f, 30f)
                lineToRelative(-40f, 70f)
                lineToRelative(-46f, -20f)
                quadToRelative(-6f, 6f, -12f, 9.5f)
                reflectiveQuadToRelative(-14f, 6.5f)
                lineToRelative(-6f, 50f)
                close()
                moveToRelative(40f, -100f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                reflectiveQuadToRelative(-17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                reflectiveQuadToRelative(-43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                reflectiveQuadToRelative(17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                moveTo(280f, 160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        return _Phonelink_setup!!
    }

private var _Phonelink_setup: ImageVector? = null


public val Local_hospital: ImageVector
    get() {
        if (_Local_hospital != null) {
            return _Local_hospital!!
        }
        _Local_hospital = ImageVector.Builder(
            name = "Local_hospital",
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
                moveTo(420f, 680f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-120f)
                horizontalLineTo(540f)
                verticalLineToRelative(-140f)
                horizontalLineTo(420f)
                verticalLineToRelative(140f)
                horizontalLineTo(280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(140f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        return _Local_hospital!!
    }

private var _Local_hospital: ImageVector? = null


public val Edit_document: ImageVector
    get() {
        if (_Edit_document != null) {
            return _Edit_document!!
        }
        _Edit_document = ImageVector.Builder(
            name = "Edit_document",
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
                moveTo(560f, 880f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                reflectiveQuadToRelative(-4f, 22.5f)
                reflectiveQuadToRelative(-13f, 20.5f)
                lineTo(683f, 880f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                close()
                moveTo(620f, 820f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(521f, -201f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                close()
            }
        }.build()
        return _Edit_document!!
    }

private var _Edit_document: ImageVector? = null


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




