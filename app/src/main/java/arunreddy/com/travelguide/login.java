package arunreddy.com.travelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {
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
    private FirebaseAuth mAuth;
    private static  final String TAG="EmailPassword";
    EditText email,password;
    Button signIn,signUp,forgetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth=FirebaseAuth.getInstance();
        if(mAuth.getCurrentUser()!=null){
            startActivity(new Intent(login.this,MainActivity.class));
            finish();
        }
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.login_email);
        password=findViewById(R.id.login_password);
        signIn=findViewById(R.id.login_signin);
        signUp=findViewById(R.id.login_signup);
        forgetPassword=findViewById(R.id.forgot_password);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(login.this,signup.class);
                startActivity(j);
                finish();
            }
        });
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetMail=new EditText(v.getContext());
                AlertDialog.Builder passwordResetDialog=new AlertDialog.Builder(v.getContext());
                passwordResetDialog.setTitle("RESET PASSWORD");
                passwordResetDialog.setMessage("Enter Your Email");
                passwordResetDialog.setView(resetMail);
                passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String mail=resetMail.getText().toString();
                        mAuth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(login.this,"Rest Link Sent to Your Email",Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(login.this,"Error! Rest Link is Not Sent"+mail+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
                passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                passwordResetDialog.create().show();
            }
        });
    }

    private void signin() {
        Log.d(TAG,"signin"+email);
        if(!validateForm()){
            return;
        }
        String em=email.getText().toString();
        String pw=password.getText().toString();
        mAuth.signInWithEmailAndPassword(em,pw).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    Toast.makeText(login.this, "SignIn Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this, MainActivity.class));
                    finish();
                }else {
                    Log.d(TAG,"signInWithEmail:failure",task.getException());
                    Toast.makeText(login.this, ""+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateForm() {
        boolean valid=true;
        String em=email.getText().toString().trim();
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
        String pw=password.getText().toString().trim();
        if(TextUtils.isEmpty(pw)){
            password.setError("Reduired Password");
            valid=false;
        }
        else if(!PASSWORD_PATTERN.matcher(pw).matches()){
            valid=false;
            password.setError("Password too weak");
        }
        else{
            password.setError(null);
        }
        return valid;
    }
}