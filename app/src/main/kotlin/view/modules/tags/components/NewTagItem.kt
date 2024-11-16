package view.modules.tags.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import config.IconPaths
import view.shared.ClickableIcon
import view.theme.Afacade
import viewModel.TagViewModel

@Composable
fun NewTagItem(
    tagViewModel: TagViewModel,
    label: MutableState<String>,
    onValueChange: (String) -> Unit,
    onDismiss: () -> Unit
){

    val focusRequester = remember { FocusRequester() }

    Column {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp).height(30.dp)
        ) {
            Row {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight().width(40.dp)
                ) {
                    Icon(
                        painter = painterResource(IconPaths.SYSTEM_ICONS + "tag.svg"),
                        contentDescription = null,
                        tint = Color.Blue,
                        modifier = Modifier.size(15.dp)
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    BasicTextField(
                        value = label.value,
                        onValueChange = onValueChange,
                        singleLine = true,
                        textStyle = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 0.sp,
                            fontFamily = Afacade,
                            color = Color.Blue
                        ),
                        modifier = Modifier.focusRequester(focusRequester)
                    )
                }
            }
            Row(modifier = Modifier.padding(end = 10.dp)) {
                ClickableIcon(
                    icon = "close",
                    color = Color.Blue,
                    shape = RoundedCornerShape(6.dp),
                    iconSize = 12.dp,
                    padding = true,
                    onClick = {
                        onDismiss()
                    }
                )
                ClickableIcon(
                    icon = "check",
                    color = Color.Blue,
                    shape = RoundedCornerShape(6.dp),
                    iconSize = 12.dp,
                    padding = true,
                    onClick = {
                        tagViewModel.addTag(label.value)
                        onDismiss()
                    }
                )
            }
        }
        Divider(Modifier.padding(horizontal = 15.dp))
    }

    LaunchedEffect(Unit) { focusRequester.requestFocus() }
}