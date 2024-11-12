 package view.modules.addAccount

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import model.enums.AccountType
import view.shared.DialogTitleBar
import viewModel.AddAccountViewModel
import viewModel.SidebarViewModel

@Composable
fun AddAccount(
     sidebarViewModel: SidebarViewModel,
     addAccountViewModel: AddAccountViewModel = AddAccountViewModel(),
     accountType: AccountType,
     onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(500.dp).defaultMinSize(minHeight = 400.dp)
                .background(MaterialTheme.colors.background, shape = RoundedCornerShape(8.dp))
        ) {

            val title = when (accountType) {
                AccountType.SAVINGS -> "conta poupança"
                AccountType.CHECKING -> "conta corrente"
                AccountType.CREDIT_CARD -> "cartão de crédito"
            }

            //===== Title Bar
            DialogTitleBar("Adicionar $title", onDismiss)
            Divider()

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                when (accountType) {
                    AccountType.SAVINGS -> NewSavingAccount(sidebarViewModel, addAccountViewModel, onDismiss)
                    AccountType.CHECKING -> NewCheckingAccount(sidebarViewModel, addAccountViewModel, onDismiss)
                    AccountType.CREDIT_CARD -> NewCreditCard(sidebarViewModel, addAccountViewModel, onDismiss)
                }

            }

        }
    }
}