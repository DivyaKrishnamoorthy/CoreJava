package com.dk;

import com.dk.java.basics.DataTypes;
import com.dk.java.basics.Literals;
import com.dk.java.basics.TypeConversion;
import com.dk.java.basics.AssignmentAndIncrement;
import com.dk.java.basics.RelationalOperator;
import com.dk.java.basics.LogicalOperator;
import com.dk.java.basics.IfElse;
import com.dk.java.basics.TernaryOperator;
import com.dk.java.basics.Switch;
import com.dk.java.loops.WhileLoop;
import com.dk.java.loops.DoWhileLoop;
import com.dk.java.loops.ForLoop;
import com.dk.java.loops.WhichLoop;
import com.dk.java.methods.Methods;
import com.dk.java.methods.MethodOverloading;
import com.dk.java.methods.StackAndHeap;
import com.dk.java.arrays.ArrayCreation;
import com.dk.java.arrays.JaggedArray;
import com.dk.java.arrays.ArrayOfObjects;
import com.dk.java.arrays.MultiDimensionalArray;
import com.dk.java.arrays.EnhancedForLoop;
import com.dk.java.arrays.Drawbacks;
import com.dk.java.stringSamples.StringExample;
import com.dk.java.stringSamples.StringBufferExample;
import com.dk.java.stringSamples.ImmutableString;
import com.dk.java.staticExample.StaticVariableCode;
import com.dk.java.staticExample.StaticMethodCode;
import com.dk.java.staticExample.StaticBlockCode;
import com.dk.java.encapsulation.EncapsulationExample;
import com.dk.java.encapsulation.NamingConvention;
import com.dk.java.encapsulation.GettersAndSetters;
import com.dk.java.encapsulation.ThisKeyword;
import com.dk.java.encapsulation.ConstructorExample;
import com.dk.java.encapsulation.DefaultAndParameterizedConstructor;
import com.dk.java.encapsulation.AnonymousObjectExample;
import com.dk.java.inheritance.NeedForInheritance;
import com.dk.java.inheritance.InheritanceExample;
import com.dk.java.inheritance.SingleAndMultiLevel;
import com.dk.java.inheritance.MultipleInheritance;
import com.dk.java.inheritance.MethodOverridingExample;
import com.dk.java.inheritance.ThisAndSuperMethod;
import com.dk.java.inheritance.ThisAndSuperKeyword;

public class Main {
    public static void main(String[] args) {

        System.out.println("Data Types Example");
        DataTypes dataTypes = new DataTypes();
        dataTypes.dataTypesExample();

        System.out.println("Literals Example");
        Literals literals = new Literals();
        literals.literalsExample();

        System.out.println("Type Conversion Example");
        TypeConversion typeConversion = new TypeConversion();
        typeConversion.typeConversionExample();

        System.out.println("Assignment and Increment Example");
        AssignmentAndIncrement assignment = new AssignmentAndIncrement();
        assignment.assignmentExamples();

        System.out.println("Relational Operator Example");
        RelationalOperator relational = new RelationalOperator();
        relational.relationalExample();

        System.out.println("Logical Operator Example");
        LogicalOperator logical = new LogicalOperator();
        logical.logicalExample();

        System.out.println("IfElse Example");
        IfElse ifelse = new IfElse();
        ifelse.ifElseExample();

        System.out.println("Ternary Example");
        TernaryOperator ternary = new TernaryOperator();
        ternary.ternaryExample();

        System.out.println("Switch Example");
        Switch switchExample = new Switch();
        switchExample.switchExample();

        System.out.println("While Loop Example");
        WhileLoop whileLoopExample = new WhileLoop();
        whileLoopExample.whileLoopExample();

        System.out.println("While Loop Example");
        DoWhileLoop dowhileLoopExample = new DoWhileLoop();
        dowhileLoopExample.doWhileExample();

        System.out.println("For Loop Example");
        ForLoop forLoopExample = new ForLoop();
        forLoopExample.forLoopExample();

        System.out.println("WHich Loop To Use");
        WhichLoop whichLoopToUse = new WhichLoop();
        whichLoopToUse.whichLoop();

        System.out.println("Method Example");
        Methods methodsObj = new Methods();
        methodsObj.methodsExample();

        System.out.println("Method Overloading Example");
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.methodOverloadingExample();

        System.out.println("Stack and Heap Example");
        StackAndHeap stackExample = new StackAndHeap();
        stackExample.stackAndHeapExample();

        System.out.println("Array Creation Example");
        ArrayCreation arrayCreation = new ArrayCreation();
        arrayCreation.arrayExample();

        System.out.println("Jagged Array Example");
        JaggedArray jaggedArray = new JaggedArray();
        jaggedArray.jaggedArrayExample();

        System.out.println("Array of Objects Example");
        ArrayOfObjects arrayOfObjs = new ArrayOfObjects();
        arrayOfObjs.arrayOfObjectsExample();

        System.out.println("MultiDimensional Array Example");
        MultiDimensionalArray multiDimensional = new MultiDimensionalArray();
        multiDimensional.multiDimensionalArrayExample();

        System.out.println("Enhanced For Loop Example");
        EnhancedForLoop enhancedForLoop = new EnhancedForLoop();
        enhancedForLoop.enhancedForLoopExample();

        System.out.println("Drawbacks of Array");
        Drawbacks drawbacks = new Drawbacks();
        drawbacks.drawbackExample();

        System.out.println("String Example");
        StringExample stringExample = new StringExample();
        stringExample.stringExampleCode();

        System.out.println("Immutable String Example");
        ImmutableString immutableString = new ImmutableString();
        immutableString.mutableAndImmutableExample();

        System.out.println("String Buffer Example");
        StringBufferExample stringBufferExample = new StringBufferExample();
        stringBufferExample.stringBufferExample();

        System.out.println("Static Variable Example");
        StaticVariableCode staticVariableCode = new StaticVariableCode();
        staticVariableCode.staticVariableExample();

        System.out.println("Static Method Example");
        StaticMethodCode staticMethodCode = new StaticMethodCode();
        staticMethodCode.staticMethodExample();

        System.out.println("Static Block Example");
        StaticBlockCode staticBlockCode = new StaticBlockCode();
        staticBlockCode.staticBlockExample();

        System.out.println("Encapsulation Example");
        EncapsulationExample encapsulation = new EncapsulationExample();
        encapsulation.encapsulationExample();

        System.out.println("Getter and Setter Example");
        GettersAndSetters getterSetterExample = new GettersAndSetters();
        getterSetterExample.getterSetterExample();

        System.out.println("This Keyword Example");
        ThisKeyword thisKeywordExample = new ThisKeyword();
        thisKeywordExample.thisKeywordExample();

        System.out.println("Naming Convention Example");
        NamingConvention namingConvention = new NamingConvention();
        namingConvention.namingConventionExample();

        System.out.println("Constructor Example");
        ConstructorExample constructorExample = new ConstructorExample();
        constructorExample.constructorExample();

        System.out.println("Default And Param Constructor Example");
        DefaultAndParameterizedConstructor paramConst = new DefaultAndParameterizedConstructor();
        paramConst.parameterizedConstructorExample();

        System.out.println("Anonymous Object Example");
        AnonymousObjectExample anonyObj = new AnonymousObjectExample();
        anonyObj.anonymousObj();

        System.out.println("Need for Inheritance Example");
        NeedForInheritance needForInheritance = new NeedForInheritance();
        needForInheritance.needForInheritance();

        System.out.println("Inheritance Example");
        InheritanceExample inheritanceExample = new InheritanceExample();
        inheritanceExample.inheritanceExample();

        System.out.println("Single and Multi Level Inheritance Example");
        SingleAndMultiLevel singleAndMultiLevel = new SingleAndMultiLevel();
        singleAndMultiLevel.singleAndMultiLevel();

        System.out.println("Multiple Inheritance Example");
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.multipleInheritance();

        System.out.println("Method Overriding Example");
        MethodOverridingExample methodOverriding = new MethodOverridingExample();
        methodOverriding.methodOverridingExample();

        System.out.println("This and Super Method Example");
        ThisAndSuperMethod thisAndSuper = new ThisAndSuperMethod();
        thisAndSuper.thisAndSuperMethod();

        System.out.println("This and Super Keyword Example");
        ThisAndSuperKeyword thisAndSuperKeyword = new ThisAndSuperKeyword();
        thisAndSuperKeyword.thisAndSuperKeyword();
    }

}
