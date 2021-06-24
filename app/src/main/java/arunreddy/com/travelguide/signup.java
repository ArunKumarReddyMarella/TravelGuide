package arunreddy.com.travelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class signup extends AppCompatActivity {
    private static final Pattern PASSWORD_PATTERN=Pattern.compile(
            "^"+
                    "(?=.*[0-9])"+
                    "(?=.*[a-z])"+
                    "(?=.*[A-Z])"+
                    "(?=.*[@#$%^&\\-+=()])"+
                    "(?=\\S+$)"+
                    ".{6,}"+
                    "$"
    );
    FirebaseAuth mAuth=FirebaseAuth.getInstance();
    private  static final String TAG="EmailPassword";
    EditText email,password,username,confirmPassword;
    Button sign_up,registeredSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(mAuth.getCurrentUser()!=null){
            startActivity(new Intent(signup.this,MainActivity.class));
            finish();
        }
        setContentView(R.layout.activity_signup);
        email=findViewById(R.id.registered_email);
        password=findViewById(R.id.registered_password);
        confirmPassword=findViewById(R.id.confirm_password);
        username=findViewById(R.id.registered_username);
        sign_up=findViewById(R.id.registered_sign_up);
        registeredSignIn=findViewById(R.id.registered_sign_in);
        registeredSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signup.this,login.class));
                finish();
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }

    private  void signUp(){
        Log.d(TAG,"signUp"+email);
        if(!validateForm()){
            return;
        }
        String em=email.getText().toString();
        String pw=password.getText().toString();
        mAuth.createUserWithEmailAndPassword(em,pw).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(signup.this,"Registration Successful",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(signup.this,login.class));
                    finish();
                }
                else{
                    Log.w(TAG,"signUpWithEmail:failure",task.getException());
                    Toast.makeText(signup.this,"Registration Fail "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateForm() {
        boolean valid=true;
        String em=email.getText().toString();
        if(TextUtils.isEmpty(em)){
            email.setError("Required Email");
            valid=false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(em).matches()){
            valid=false;
            email.setError("Please enter a valid email address");
        }
        else{
            email.setError(null);
        }
        String pw=password.getText().toString();
        if(TextUtils.isEmpty(pw)){
            password.setError("Password Reduired");
            valid=false;
        }
        else{
            password.setError(null);
        }
        String cpw=confirmPassword.getText().toString();
        //Toast.makeText(signup.this,""+pw+" "+cpw,Toast.LENGTH_LONG).show();
        if(TextUtils.isEmpty(cpw)){
            password.setError("Password Reduired");
            valid=false;
        }
        else if(!PASSWORD_PATTERN.matcher(pw).matches()){
            password.setError("Password too weak");
            valid=false;
        }
        else{
            password.setError(null);
        }
        if(!(cpw.equals(pw))){
            confirmPassword.setError("Not Matching");
            valid=false;
        }
        else
        {
            confirmPassword.setError(null);
        }
        return valid;
    }
}