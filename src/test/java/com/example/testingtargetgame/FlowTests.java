package com.example.testingtargetgame;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.example.testingtargetgame.CompareUserVsTarget.CheckIfTargetHit;
import com.example.testingtargetgame.CompareUserVsTarget.ICheckIfTargetHit;
import com.example.testingtargetgame.GetCoordinates.GenerateTargetCoordinates;
import com.example.testingtargetgame.GetCoordinates.GetUserCoordinates;
import com.example.testingtargetgame.GetCoordinates.IGenerateTargetCoordinates;
import com.example.testingtargetgame.GetCoordinates.IGetUserCoordinates;
import com.example.testingtargetgame.UserInput.ConvertToInt;
import com.example.testingtargetgame.UserInput.IConvertToInt;
import com.example.testingtargetgame.UserInput.IIntegerCheck;
import com.example.testingtargetgame.UserInput.IRangeCheck;
import com.example.testingtargetgame.UserInput.IntegerCheck;
import com.example.testingtargetgame.UserInput.ValidAngleCheck;
import com.example.testingtargetgame.UserInput.ValidVelocityCheck;
import com.example.testingtargetgame.flow.IFlow;
import com.example.testingtargetgame.flow.ITargetInputFlow;
import com.example.testingtargetgame.flow.TargetInputFlow;

import org.junit.Test;
import org.mockito.Mock;

public class FlowTests {
    
    @Mock
    IIntegerCheck mockIntegerCheck = mock(IntegerCheck.class);

    @Mock
    IConvertToInt mockConvertToInt = mock(ConvertToInt.class);

    @Mock
    IRangeCheck mockValidAngleCheck = mock(ValidAngleCheck.class);

    @Mock
    IRangeCheck mockValidVelocityCheck = mock(ValidVelocityCheck.class);

    @Mock
    IGetUserCoordinates mockGetUserCoordinates = mock(GetUserCoordinates.class);

    @Mock
    ICheckIfTargetHit mockCheckIfTargetHit = mock(CheckIfTargetHit.class);

    @Mock
    IGenerateTargetCoordinates mockGenerateTargetCoordinates = mock(GenerateTargetCoordinates.class);
    
    @Test
    public void givenFortyFiveDegreesIntegerCheckIsCalledOnce() {
        //Given: I am a user
        given(mockIntegerCheck.getResult("45")).willReturn(true);
        given(mockConvertToInt.getResult("45")).willReturn(45);
        given(mockValidAngleCheck.getResult(45)).willReturn(true);
        //When: I have an angle of forty five
        ITargetInputFlow ITIF = new TargetInputFlow(mockIntegerCheck, mockConvertToInt, mockValidAngleCheck);
        ITIF.getResult("45");
        //Then: mockIntegerCheck is called once
        verify(mockIntegerCheck, times(1)).getResult("45");
    }
}
