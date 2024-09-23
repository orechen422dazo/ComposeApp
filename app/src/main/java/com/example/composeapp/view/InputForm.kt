import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun InputForm() {
    // 状態を管理するための変数
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // メールアドレス入力フィールド
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("メールアドレス") },
            shape = RoundedCornerShape(8.dp), // 角丸の形状
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // パスワード入力フィールド
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("パスワード") },
            shape = RoundedCornerShape(8.dp), // 角丸の形状
            visualTransformation = PasswordVisualTransformation(), // パスワードを隠す
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // 送信ボタン
        Button(
            onClick = {
                // ここにフォーム送信のロジックを実装
                println("Email: $email, Password: $password")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("送信")
        }
    }
}