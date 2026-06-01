package com.example.gullapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

//ab esa text banae gy jisko partially select kar ky navigate kar saken
@Composable
fun PartialSelectableText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer() {
            //vertically arrange karne ky liye column use kar sakte hain
            Column {
                Text(text = "Gull Fatima 1")
                Text(text = "Gull Fatima 2")
                Text(text = "Gull Fatima 3")
                DisableSelection{     //esa text jo select na ho sake
                    Text(text = "Gull Fatima 4, not selectable")
                    Text(text = "Gull Fatima 5, not selectable")
                    Text(text = "Gull Fatima 6, not selectable")
                }
            }
        }
    }
}


@Composable

//clickable text having link
fun AnnotatedStringWithListenerSimple(){

    val urlHandler = LocalUriHandler.current
    //built-in manager that opens phone browser

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            buildAnnotatedString // function that help us to connect normal text with linkable text
            {
                append("Build better apps faster with ")
                val link = LinkAnnotation.Url(
                    "https://developer.android.com/compose",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )
                )
                //link ko text mai add karwa rahe hain
                //link ka color set kar rahe hain

                {
                    val url = (it as LinkAnnotation.Url).url
                    urlHandler.openUri(url)
                }
                //jab user is link per click kare ga tu urihandler brower open kar ky ye specific website open kare ga

                withLink(link) {
                    append("JetPack CImpose")
                }
            }
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PartialSelectableTextPreview()
//{
//    AnnotatedStringWithListenerSimple()
//}