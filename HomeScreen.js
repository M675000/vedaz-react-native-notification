import React from 'react';
import { View, Text, Button, Alert } from 'react-native';

export default function HomeScreen({ navigation }) {
  const simulatePush = () => {
    Alert.alert("Incoming Call", "Simulated push notification", [
      {
        text: "Answer",
        onPress: () => navigation.navigate('Notification')
      }
    ]);
  };

  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>Home Screen</Text>
      <Button title="Simulate Call Notification" onPress={simulatePush} />
    </View>
  );
}
