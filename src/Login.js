import React from "react";
import { View, Text, TouchableOpacity } from "react-native";
import Background from "./Background";
import {darkBlue, royalblue} from './Constans'
import Field from "./Field";
import Btn from "./Btn";
const Login = (props) => {
    return(
        <Background>
            <View style={{ alignItems: "center", width: 300 }}>
            <Text style={{ 
                color: "white", 
                fontSize: 60, 
                marginVertical: 10 }}></Text>
                <View style={{
                    backgroundColor: 'snow',
                    height: 600,
                    width: 430,
                    borderTopLeftRadius: 200,
                    paddingTop: 50,
                    alignItems: 'center'
                   
                }}>
                    <Text style={{
                        fontSize: 40,
                        color: royalblue,
                        fontWeight: 'bold'
                    }} >
                        Welcome
                    </Text>
                    <Text style={{
                        color: "grey",
                        fontSize: 16,
                        fontWeight: "bold",
                        marginBottom: 20
                    }} >Log in to your account</Text>
                    
                    <Field placeholder="E-mail / Username" keyboardType={"email-address"} />
                    <Field placeholder="Password" secureTextEntry={true} />
                
                    <View style={{ 
                        alignItems: 'flex-end',
                        width: '70%',
                        paddingRight: 16,
                        marginBottom: 100}}>
                        <Text style={{
                            color: darkBlue,
                            fontWeight: 'bold',
                            fontSize: 16
                        }}>Forgot Password?</Text>
                    </View>
                    <View style={{
                        alignItems: 'center'
                    }}>
                    <Btn textColor='white' bgColor={darkBlue} btnLabel="Log In" Press={() => alert("Logged In")} />
                    </View>
                    <View style={{
                        display: 'flex',
                        flexDirection: 'row',
                        justifyContent: "center"
                    }}>
                    <Text style={{
                        fontSize:16,
                        fontWeight: "bold"
                    }}>Don't have an account?</Text>
                    <TouchableOpacity onPress={() => props.navigation.navigate("SignUp")} >
                    <Text style={{
                        color: darkBlue,
                        fontWeight: "bold",
                        fontSize: 16
                    }}>Sign Up</Text>
                    </TouchableOpacity>
                    </View>
                </View>
            </View>
        </Background>
    );
}

export default Login;