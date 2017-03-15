package kenev.net.customtextviewsample

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class FontText : TextView {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        if (isInEditMode) {
            return
        }

        val ta = context.obtainStyledAttributes(attrs, R.styleable.FontText)

        ta?.let {
            val fontAsset = ta.getString(R.styleable.FontText_typefaceAsset)

            if (fontAsset.isNotEmpty()) {
                val tf = Typeface.createFromAsset(context.assets, fontAsset)
                var style = Typeface.NORMAL
                val size = textSize

                if (typeface != null) {
                    style = typeface.style
                }

                if (tf != null) {
                    setTypeface(tf, style)
                } else {

                }

                }


            }
        }

    }
