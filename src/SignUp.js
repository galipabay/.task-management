import React from "react";
import { View, Text, TouchableOpacity } from "react-native";
import Background from "./Background";
import {darkBlue, royalblue} from './Constans'
import Field from "./Field";
import Btn from "./Btn";
const SignUp = (props) => {
    return(
        <Background>
            <View style={{ alignItems: "center", width: 300 }}>
            <Text style={{ 
                color: "white", 
                fontSize: 60, 
                fontWeight: 'normal', 
                marginTop: 20
                }}></Text>
                <Text style={{
                    color: "grey",
                    fontSize: 19,
                    fontWeight: "bold",
                    marginBottom: 20
                }}>Create a new account</Text>
                <View style={{
                    backgroundColor: 'snow',
                    height: 800,
                    width: 430,
                    borderTopLeftRadius: 130,
                    paddingTop: 20,
                    alignItems: 'center'
                }}>
                    <Field placeholder="First Name"/>
                    <Field placeholder="Last Name"/>
                    <Field placeholder="E-mail"
                    keyboardType={'email-address'}/>
                    <Field placeholder="Username"/>
                    <Field placeholder="Contact Number"
                    keyboardType={"number-pad"}/>
                    <Field placeholder="Password" secureTextEntry={true} />
                    <Field placeholder="Confirm Password" secureTextEntry={true} />
                    <View style={{ 
                        display: "flex",
                        flexDirection: "row",
                        width: '60%',
                        paddingRight: 16,
                       }}>
                        <Text style={{
                            color: "grey",
                            fontSize: 13
                        }}>By signing in, you agree to our {' '} </Text>
                        <Text style={{
                            color: darkBlue,
                            fontWeight: 'bold',
                            fontSize: 13
                        }}>Terms & Conditions</Text>
                    </View>
                    <View style={{ 
                        display: 'flex',
                        flexDirection: 'row',
                        width: '60%',
                        paddingRight: 16,
                        }}>
                        <Text style={{
                            color: 'grey',
                            fontSize: 13}}>
                                and {" "} </Text>
                        <Text style={{
                            color: darkBlue,
                            fontWeight: 'bold',
                            fontSize: 13}}>
                                Privacy Policy</Text>
                    </View>    

                    <Btn textColor='white' bgColor={darkBlue} btnLabel="SignUp" Press={() => {
                        alert("Account Created")
                        props.navigation.navigate('Login')
                    }
                    } />
                    <View style={{
                        display: 'flex',
                        flexDirection: 'row',
                        justifyContent: "center"
                    }}>
                    <Text style={{
                        fontSize:16,
                        fontWeight: "bold"
                    }}>Already have an account?</Text>
                    <TouchableOpacity onPress={() => props.navigation.navigate("Login")} >
                    <Text style={{
                        color: darkBlue,
                        fontWeight: "bold",
                        fontSize: 16
                    }}>Log In</Text>
                    </TouchableOpacity>
                    </View>
                </View>
            </View>
        </Background>
    );
}

export default SignUp;
