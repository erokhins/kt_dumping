'if (message == null)
            throw AssertionError()
        else
            throw AssertionError(message)' @ [9:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'message' @ [9:13] ==> value-parameter message: String? defined in kotlin.test.DefaultAsserter.fail[ValueParameterDescriptorImpl]

'AssertionError' @ [10:19] ==> public final fun <init>(): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'AssertionError' @ [12:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'message' @ [12:34] ==> value-parameter message: String? defined in kotlin.test.DefaultAsserter.fail[ValueParameterDescriptorImpl]

