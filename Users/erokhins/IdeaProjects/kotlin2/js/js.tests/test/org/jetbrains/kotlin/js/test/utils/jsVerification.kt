'accept' @ [26:5] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [26:21] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [28:30] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.test.utils.verifyAst.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [28:32] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'if (expression is JsNullLiteral) {
                Assert.fail("Expression statement contains `null` literal")
            }
            else {
                super.visitExpressionStatement(x)
            }' @ [29:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [29:17] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.test.utils.verifyAst.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'fail' @ [30:24] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'super' @ [33:17] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.verifyAst.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpressionStatement' @ [33:23] ==> public open fun visitExpressionStatement(x: JsExpressionStatement): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [33:48] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.test.utils.verifyAst.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

