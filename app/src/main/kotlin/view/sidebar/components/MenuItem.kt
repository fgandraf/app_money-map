package view.sidebar.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.theme.Afacade

@Composable
fun MenuItem(
    iconResource: String,
    label: String,
    onClick: () -> Unit
){
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .height(35.dp)
            .clip(RoundedCornerShape(8.dp))
            .pointerHoverIcon(PointerIcon.Hand)
            .clickable { onClick() }
    ) {
        Icon(
            painter = painterResource(iconResource),
            contentDescription = null,
            tint = MaterialTheme.colors.primary,
            modifier = Modifier.size(15.dp).offset(x = 10.dp),
        )

        Text(modifier = Modifier.offset(x = 22.dp),
            text = label,
            fontSize  = 14.sp,
            color = MaterialTheme.colors.primary,
            fontWeight = FontWeight.Medium,
            lineHeight = 0.sp,
            fontFamily = Afacade
        )
    }
}