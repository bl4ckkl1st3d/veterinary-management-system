/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;
import contents.SystemLogin;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import java.sql.*;

public class SystemLoginTest {

    @InjectMocks
    private SystemLogin systemLogin; // This is your class under test

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(mockConnection.prepareStatement(any(String.class))).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
    }

    @Test
    public void testSuccessfulLoginAsCashier() throws Exception {
        // Set up mock behavior
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getString("LOA")).thenReturn("0");
        when(mockResultSet.getInt("userid")).thenReturn(1);

        // Call the method
        systemLogin.performLogin("cashier_user", "password1");

        // Verify interactions and state
        verify(mockPreparedStatement).setString(1, "cashier_user");
        verify(mockPreparedStatement).setString(2, systemLogin.sha256("password1"));
        verify(mockPreparedStatement).executeQuery();

        // Add further assertions to verify the correct behavior (e.g., correct UI actions)
        // This part can involve verifying the state changes in the UI components
    }

    @Test
    public void testUnsuccessfulLogin() throws Exception {
        // Set up mock behavior
        when(mockResultSet.next()).thenReturn(false);

        // Call the method
        systemLogin.performLogin("invalidUsername", "invalidPassword");

        // Verify interactions and state
        verify(mockPreparedStatement).setString(1, "invalidUsername");
        verify(mockPreparedStatement).setString(2, systemLogin.sha256("invalidPassword"));
        verify(mockPreparedStatement).executeQuery();

        // Add further assertions to verify the correct behavior (e.g., correct UI actions)
        // This part can involve verifying the state changes in the UI components
    }

    // Add more tests for different scenarios (e.g., different roles, multiple unsuccessful attempts)
}
