import React from "react";
import {TextInput } from "react-native";
import { darkBlue } from "./Constans";
const Field = (props) => {
    return(
        <TextInput {...props} style={{
            borderRadius: 100,
            color: darkBlue,
            paddingHorizontal: 50,
            width: '60%',
            backgroundColor: 'rgb(220,220,220)',
            marginVertical: 10
        }} placeholderTextColor={darkBlue}
        >
        </TextInput>
    );
}

export default Field;