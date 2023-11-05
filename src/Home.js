import React from "react";
import { View, StyleSheet, Text } from "react-native";
import Background from "./Background";
import Btn from "./Btn";
import { darkBlue, darkGreen, green, slategray, teal } from "./Constans";
const Home = (props) => {
  return (
    <Background>
      <View style={{ alignItems:"center", marginHorizontal: 40, marginVertical: 100 }}>
        <Text style={{ color: "white", fontSize: 55, fontWeight: '300', marginBottom: 40 }}>AssignIt</Text>
        <Text style={{ color: "white", fontSize: 30, marginBottom: 40 }}>Let's Start!</Text>
        <View style={{
          alignItems: "center",
          marginVertical: 100
        }}>
        <Btn bgColor={darkBlue} textColor='white' btnLabel="Log In" Press={() => props.navigation.navigate("Login")} />
        <Btn bgColor="black" textColor='white' btnLabel="Sign Up" Press={() => props.navigation.navigate("SignUp") } />
        </View>
      </View>
    </Background>
  );
};
const style = StyleSheet.create({});
export default Home;